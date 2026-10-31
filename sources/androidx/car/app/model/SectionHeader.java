package androidx.car.app.model;

import java.util.Objects;
import p.e2q0;
import p.l1d;
import p.qrd;
import p.ug51;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
@qrd
public final class SectionHeader {
    public static final int IMAGE_TYPE_LARGE = 2;
    public static final int IMAGE_TYPE_SMALL = 1;
    private final CarIcon mEndIcon;
    private final CarText mHeadline;
    private final e2q0 mOnClickDelegate;
    private final CarIcon mStartIcon;
    private final int mStartIconType;
    private final CarText mSubtitle;
    private final CarText mTitle;

    public SectionHeader(ug51 ug51Var) {
        CarText carText = ug51Var.a;
        Objects.requireNonNull(carText);
        this.mTitle = carText;
        this.mHeadline = ug51Var.b;
        this.mSubtitle = ug51Var.c;
        this.mStartIcon = ug51Var.d;
        this.mStartIconType = ug51Var.e;
        this.mEndIcon = ug51Var.f;
        this.mOnClickDelegate = ug51Var.g;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SectionHeader)) {
            return false;
        }
        SectionHeader sectionHeader = (SectionHeader) obj;
        if (Objects.equals(this.mHeadline, sectionHeader.mHeadline) && Objects.equals(this.mTitle, sectionHeader.mTitle) && Objects.equals(this.mSubtitle, sectionHeader.mSubtitle) && Objects.equals(this.mStartIcon, sectionHeader.mStartIcon) && this.mStartIconType == sectionHeader.mStartIconType && Objects.equals(this.mEndIcon, sectionHeader.mEndIcon)) {
            if ((this.mOnClickDelegate == null) == (sectionHeader.mOnClickDelegate == null)) {
                return true;
            }
        }
        return false;
    }

    public CarIcon getEndIcon() {
        return this.mEndIcon;
    }

    public CarText getHeadline() {
        return this.mHeadline;
    }

    public e2q0 getOnClickDelegate() {
        return this.mOnClickDelegate;
    }

    public CarIcon getStartIcon() {
        return this.mStartIcon;
    }

    public int getStartIconType() {
        return this.mStartIconType;
    }

    public CarText getSubtitle() {
        return this.mSubtitle;
    }

    public CarText getTitle() {
        return this.mTitle;
    }

    public int hashCode() {
        return Objects.hash(this.mHeadline, this.mTitle, this.mSubtitle, this.mStartIcon, Integer.valueOf(this.mStartIconType), this.mEndIcon, Boolean.valueOf(this.mOnClickDelegate == null));
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("SectionHeader { headline: ");
        sb.append(this.mHeadline);
        sb.append(", title: ");
        sb.append(this.mTitle);
        sb.append(", subtitle: ");
        sb.append(this.mSubtitle);
        sb.append(", startIcon: ");
        sb.append(this.mStartIcon);
        sb.append(", startIconType: ");
        sb.append(this.mStartIconType);
        sb.append(", endIcon: ");
        sb.append(this.mEndIcon);
        sb.append(", hasClickListener: ");
        return l1d.r(sb, this.mOnClickDelegate != null, " }");
    }

    private SectionHeader() {
        this.mTitle = CarText.create("");
        this.mHeadline = null;
        this.mSubtitle = null;
        this.mStartIcon = null;
        this.mStartIconType = 1;
        this.mEndIcon = null;
        this.mOnClickDelegate = null;
    }
}
