package androidx.car.app.model;

import java.util.Objects;
import p.qrd;
import p.sed1;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
@qrd
public final class Tab {
    private static final String EMPTY_TAB_CONTENT_ID = "EMPTY_TAB_CONTENT_ID";
    private final String mContentId;
    private final CarIcon mIcon;
    private final TabStyle mStyle;
    private final CarText mTitle;

    public Tab(sed1 sed1Var) {
        this.mTitle = sed1Var.a;
        this.mIcon = sed1Var.b;
        this.mStyle = null;
        String str = sed1Var.c;
        if (str != null) {
            this.mContentId = str;
        } else {
            this.mContentId = EMPTY_TAB_CONTENT_ID;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Tab)) {
            return false;
        }
        Tab tab = (Tab) obj;
        return Objects.equals(this.mTitle, tab.mTitle) && Objects.equals(this.mContentId, tab.mContentId) && Objects.equals(this.mIcon, tab.mIcon) && Objects.equals(this.mStyle, tab.mStyle);
    }

    public String getContentId() {
        String str = this.mContentId;
        Objects.requireNonNull(str);
        return str;
    }

    public CarIcon getIcon() {
        CarIcon carIcon = this.mIcon;
        Objects.requireNonNull(carIcon);
        return carIcon;
    }

    public TabStyle getStyle() {
        return this.mStyle;
    }

    public CarText getTitle() {
        CarText carText = this.mTitle;
        Objects.requireNonNull(carText);
        return carText;
    }

    public int hashCode() {
        return Objects.hash(this.mTitle, this.mContentId, this.mIcon, this.mStyle);
    }

    public String toString() {
        return "Tab { title: " + CarText.toShortString(this.mTitle) + ", contentId: " + this.mContentId + ", icon: " + this.mIcon + ", style: " + this.mStyle + " }";
    }

    private Tab() {
        this.mTitle = null;
        this.mContentId = EMPTY_TAB_CONTENT_ID;
        this.mIcon = null;
        this.mStyle = null;
    }
}
