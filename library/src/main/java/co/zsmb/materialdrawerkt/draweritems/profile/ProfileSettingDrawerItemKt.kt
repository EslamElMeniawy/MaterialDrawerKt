package co.zsmb.materialdrawerkt.draweritems.profile

import android.graphics.Bitmap
import android.graphics.Typeface
import android.graphics.drawable.Drawable
import android.net.Uri
import co.zsmb.materialdrawerkt.builders.AccountHeaderBuilderKt
import co.zsmb.materialdrawerkt.nonReadable
import com.mikepenz.iconics.typeface.IIcon
import com.mikepenz.materialdrawer.model.ProfileSettingDrawerItem

/**
 * Adds a new ProfileSettingDrawerItem with the given [name] and [description].
 * @return The created ProfileSettingDrawerItem instance
 */
fun AccountHeaderBuilderKt.profileSetting(
        name: String = "",
        description: String = "",
        setup: ProfileSettingDrawerItemKt.() -> Unit = {}): ProfileSettingDrawerItem {
    val item = ProfileSettingDrawerItemKt(name, description)
    item.setup()
    return item.build().apply { addItem(this) }
}

class ProfileSettingDrawerItemKt(name: String, description: String) {

    private val item = ProfileSettingDrawerItem()
            .withName(name)
            .withDescription(description)

    internal fun build() = item

    /**
     * The description of the profile setting item.
     *
     * Non readable property. Wraps the withDescription function.
     */
    var description: String
        get() = nonReadable()
        set(value) {
            item.withDescription(value)
        }

    /**
     * The color of the profile setting item's description, given as an argb Long.
     *
     * Non readable property. Wraps the withDescriptionTextColor function.
     */
    var descriptionTextColor: Long
        get() = nonReadable()
        set(value) {
            item.withDescriptionTextColor(value.toInt())
        }

    /**
     * The color of the profile setting item's description, given as a color resource.
     *
     * Non readable property. Wraps the withDescriptionTextColor function.
     */
    var descriptionTextColorRes: Int
        get() = nonReadable()
        set(value) {
            item.withDescriptionTextColor(value)
        }

    /**
     * The description of the profile setting.
     *
     * Non readable property. Wraps the withEmail function.
     */
    @Deprecated(level = DeprecationLevel.ERROR,
            message = "Only here for discoverability. Use the description property instead",
            replaceWith = ReplaceWith("description"))
    var email: String
        get() = nonReadable()
        set(value) {
            item.withEmail(value)
        }

    /**
     * The icon of the profile setting, as a drawable resource.
     *
     * Non readable property. Convenience for the `iconRes` property. Wraps the withIcon function.
     */
    var icon: Int
        get() = nonReadable()
        set(value) {
            item.withIcon(value)
        }

    /**
     * The icon of the profile setting, as a Bitmap.
     *
     * Non readable property. Wraps the withIcon function.
     */
    var iconBitmap: Bitmap
        get() = nonReadable()
        set(value) {
            item.withIcon(value)
        }

    /**
     * The icon of the profile setting, as a Drawable.
     *
     * Non readable property. Wraps the withIcon function.
     */
    var iconDrawable: Drawable
        get() = nonReadable()
        set(value) {
            item.withIcon(value)
        }

    /**
     * The icon of the profile setting, as an IIcon.
     *
     * Non readable property. Wraps the withIcon function.
     */
    var iicon: IIcon
        get() = nonReadable()
        set(value) {
            item.withIcon(value)
        }

    /**
     * The icon of the profile setting, as a drawable resource.
     *
     * Non readable property. Wraps the withIcon function.
     */
    var iconRes: Int
        get() = nonReadable()
        set(value) {
            item.withIcon(value)
        }

    /**
     * The icon of the profile setting, as an Uri.
     *
     * Non readable property. Wraps the withIcon function.
     */
    var iconUri: Uri
        get() = nonReadable()
        set(value) {
            item.withIcon(value)
        }

    /**
     * The icon of the profile setting, given by a url String.
     *
     * Non readable property. Wraps the withIcon function.
     */
    var iconUrl: String
        get() = nonReadable()
        set(value) {
            item.withIcon(value)
        }

    /**
     * The color of the profile setting item's icon, given as an argb Long.
     *
     * Non readable property. Wraps the withIconColor function.
     */
    var iconColor: Long
        get() = nonReadable()
        set(value) {
            item.withIconColor(value.toInt())
        }

    /**
     * The color of the profile setting item's icon, given as a color resource.
     *
     * Non readable property. Wraps the withIconColor function.
     */
    var iconColorRes: Int
        get() = nonReadable()
        set(value) {
            item.withIconColor(value)
        }

    /**
     * Whether the icon of the profile setting item should be tinted with the enabled/disabled/selected color. If set to
     * false, your icon will always be displayed with its default colors.
     *
     * Non readable property. Wraps the withIconTinted function.
     */
    var iconTinted: Boolean
        get() = nonReadable()
        set(value) {
            item.withIconTinted(value)
        }

    /**
     * The name of the profile setting.
     *
     * Non readable property. Wraps the withName function.
     */
    var name: String
        get() = nonReadable()
        set(value) {
            item.withName(value)
        }

    /**
     * The color of the profile setting item in the profile switcher list when it's selected, as an argb Long.
     *
     * Non readable property. Wraps the withSelectedColor function.
     */
    var selectedColor: Long
        get() = nonReadable()
        set(value) {
            item.withSelectedColor(value.toInt())
        }

    /**
     * The color of the profile setting item in the profile switcher list when it's selected, as a color resource.
     *
     * Non readable property. Wraps the withSelectedColorRes function.
     */
    var selectedColorRes: Int
        get() = nonReadable()
        set(value) {
            item.withSelectedColorRes(value)
        }

    /**
     *The color of the profile setting item's text in the profile switcher list, as an argb Long.
     *
     * Non readable property. Wraps the withTextColor function.
     */
    var textColor: Long
        get() = nonReadable()
        set(value) {
            item.withTextColor(value.toInt())
        }

    /**
     * The color of the profile setting item's text in the profile switcher list, as a color resource.
     *
     * Non readable property. Wraps the withTextColorRes function.
     */
    var textColorRes: Int
        get() = nonReadable()
        set(value) {
            item.withTextColorRes(value)
        }

    /**
     * The typeface to use for the profile setting item's text.
     *
     * Non readable property. Wraps the withTypeface function.
     */
    var typeface: Typeface
        get() = nonReadable()
        set(value) {
            item.withTypeface(value)
        }

}