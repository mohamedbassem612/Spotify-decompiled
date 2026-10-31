package androidx.car.app.model;

import java.util.Collections;
import java.util.List;
import java.util.Objects;
import p.e2q0;
import p.qi90;
import p.qrd;
import p.v4a;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
@qrd
public final class Banner implements qi90 {
    public static final int IMAGE_TYPE_LARGE = 3;
    public static final int IMAGE_TYPE_MEDIUM = 2;
    public static final int IMAGE_TYPE_SMALL = 1;
    private static final int MAX_TRAILING_ELEMENTS = 2;
    private final List<Action> mBelowActions;
    private final BannerElement mLeadingElement;
    private final e2q0 mOnClickDelegate;
    private final BannerStyle mStyle;
    private final CarText mSubtitle;
    private final CarText mTitle;
    private final List<BannerElement> mTrailingElements;

    private Banner() {
        this.mTitle = null;
        this.mSubtitle = null;
        this.mOnClickDelegate = null;
        this.mStyle = null;
        this.mLeadingElement = null;
        List list = Collections.EMPTY_LIST;
        this.mTrailingElements = list;
        this.mBelowActions = list;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Banner)) {
            return false;
        }
        Banner banner = (Banner) obj;
        if (Objects.equals(this.mTitle, banner.mTitle) && Objects.equals(this.mSubtitle, banner.mSubtitle)) {
            if (Boolean.valueOf(this.mOnClickDelegate == null).equals(Boolean.valueOf(banner.mOnClickDelegate == null)) && Objects.equals(this.mStyle, banner.mStyle) && Objects.equals(this.mLeadingElement, banner.mLeadingElement) && Objects.equals(this.mTrailingElements, banner.mTrailingElements) && Objects.equals(this.mBelowActions, banner.mBelowActions)) {
                return true;
            }
        }
        return false;
    }

    public List<Action> getBelowActions() {
        return this.mBelowActions;
    }

    public BannerElement getLeadingElement() {
        return this.mLeadingElement;
    }

    public e2q0 getOnClickDelegate() {
        return this.mOnClickDelegate;
    }

    public BannerStyle getStyle() {
        return this.mStyle;
    }

    public CarText getSubtitle() {
        return this.mSubtitle;
    }

    public CarText getTitle() {
        return this.mTitle;
    }

    public List<BannerElement> getTrailingElements() {
        return this.mTrailingElements;
    }

    public int hashCode() {
        return Objects.hash(this.mTitle, this.mSubtitle, Boolean.valueOf(this.mOnClickDelegate == null), this.mStyle, this.mLeadingElement, this.mTrailingElements, this.mBelowActions);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Banner { title: ");
        sb.append(CarText.toShortString(this.mTitle));
        sb.append(", subtitle: ");
        sb.append(CarText.toShortString(this.mSubtitle));
        sb.append(", has click listener: ");
        sb.append(this.mOnClickDelegate != null);
        sb.append(", style: ");
        sb.append(this.mStyle);
        sb.append(", leading element: ");
        sb.append(this.mLeadingElement);
        sb.append(", trailing elements: ");
        sb.append(this.mTrailingElements);
        sb.append(", below actions: ");
        sb.append(this.mBelowActions);
        sb.append(" }");
        return sb.toString();
    }

    public Banner(v4a v4aVar) {
        throw null;
    }
}
