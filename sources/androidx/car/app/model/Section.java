package androidx.car.app.model;

import androidx.car.app.serialization.ListDelegateImpl;
import java.util.Collections;
import java.util.Objects;
import p.af51;
import p.k5q0;
import p.qi90;
import p.qrd;
import p.toc0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
@qrd
public abstract class Section<T extends qi90> {
    private final toc0 mItemsDelegate;
    private final CarText mNoItemsMessage;
    private final k5q0 mOnItemVisibilityChangedDelegate;
    private final SectionHeader mSectionHeader;
    private final CarText mTitle;

    public Section(af51 af51Var) {
        this.mItemsDelegate = new ListDelegateImpl(Collections.unmodifiableList(af51Var.a));
        this.mTitle = af51Var.b;
        this.mSectionHeader = af51Var.c;
        this.mNoItemsMessage = af51Var.d;
        this.mOnItemVisibilityChangedDelegate = af51Var.e;
    }

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof Section)) {
            return false;
        }
        Section section = (Section) obj;
        if (Objects.equals(this.mItemsDelegate, section.mItemsDelegate) && Objects.equals(this.mTitle, section.mTitle) && Objects.equals(this.mSectionHeader, section.mSectionHeader) && Objects.equals(this.mNoItemsMessage, section.mNoItemsMessage)) {
            if (Boolean.valueOf(this.mOnItemVisibilityChangedDelegate == null).equals(Boolean.valueOf(section.mOnItemVisibilityChangedDelegate == null))) {
                return true;
            }
        }
        return false;
    }

    public toc0 getItemsDelegate() {
        return this.mItemsDelegate;
    }

    public CarText getNoItemsMessage() {
        return this.mNoItemsMessage;
    }

    public k5q0 getOnItemVisibilityChangedDelegate() {
        return this.mOnItemVisibilityChangedDelegate;
    }

    public SectionHeader getSectionHeader() {
        return this.mSectionHeader;
    }

    public CarText getTitle() {
        return this.mTitle;
    }

    public int hashCode() {
        return Objects.hash(this.mItemsDelegate, this.mTitle, this.mSectionHeader, this.mNoItemsMessage, Boolean.valueOf(this.mOnItemVisibilityChangedDelegate == null));
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Section { title: ");
        sb.append(this.mTitle);
        sb.append(", sectionHeader: ");
        sb.append(this.mSectionHeader);
        sb.append(", noItemsMessage: ");
        sb.append(this.mNoItemsMessage);
        sb.append(", itemsDelegate: ");
        sb.append(this.mItemsDelegate);
        sb.append(", onItemVisibilityChangedDelegate: ");
        sb.append(this.mOnItemVisibilityChangedDelegate != null);
        return sb.toString();
    }

    public Section() {
        this.mItemsDelegate = new ListDelegateImpl(Collections.EMPTY_LIST);
        this.mTitle = null;
        this.mSectionHeader = null;
        this.mNoItemsMessage = null;
        this.mOnItemVisibilityChangedDelegate = null;
    }
}
