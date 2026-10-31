package androidx.car.app.model;

import java.util.Collections;
import java.util.List;
import java.util.Objects;
import p.pj51;
import p.qrd;
import p.sxd1;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
@qrd
public final class SectionedItemTemplate implements sxd1 {
    public static final int ALPHABETICAL_INDEXING_DISABLED = 0;
    public static final int ALPHABETICAL_INDEXING_TITLE_AS_IS = 1;
    public static final int ALPHABETICAL_INDEXING_TITLE_IGNORE_ARTICLES_AND_SYMBOLS = 2;
    public static final int SCROLL_STATE_PRESERVE_INDEX = 1;
    public static final int SCROLL_STATE_RESET_TO_TOP = 0;
    private final List<Action> mActions;
    private final int mAlphabeticalIndexingStrategy;
    private final Header mHeader;

    @Deprecated
    private final boolean mIsAlphabeticalIndexingAllowed;
    private final boolean mIsLoading;
    private final int mScrollStatePersistenceStrategy;
    private final SearchHeader mSearchHeader;
    private final List<Section<?>> mSections;

    private SectionedItemTemplate(pj51 pj51Var) {
        this.mSections = Collections.unmodifiableList(pj51Var.a);
        this.mActions = Collections.unmodifiableList(pj51Var.b);
        this.mHeader = pj51Var.c;
        this.mSearchHeader = null;
        this.mIsLoading = pj51Var.d;
        this.mIsAlphabeticalIndexingAllowed = pj51Var.e;
        this.mAlphabeticalIndexingStrategy = 0;
        this.mScrollStatePersistenceStrategy = 1;
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SectionedItemTemplate)) {
            return false;
        }
        SectionedItemTemplate sectionedItemTemplate = (SectionedItemTemplate) obj;
        return Objects.equals(this.mSections, sectionedItemTemplate.mSections) && Objects.equals(this.mActions, sectionedItemTemplate.mActions) && Objects.equals(this.mHeader, sectionedItemTemplate.mHeader) && Objects.equals(this.mSearchHeader, sectionedItemTemplate.mSearchHeader) && this.mIsLoading == sectionedItemTemplate.mIsLoading && this.mIsAlphabeticalIndexingAllowed == sectionedItemTemplate.mIsAlphabeticalIndexingAllowed && this.mScrollStatePersistenceStrategy == sectionedItemTemplate.mScrollStatePersistenceStrategy;
    }

    public List<Action> getActions() {
        return this.mActions;
    }

    public int getAlphabeticalIndexingStrategy() {
        int i = this.mAlphabeticalIndexingStrategy;
        if (i == 0 && this.mIsAlphabeticalIndexingAllowed) {
            return 2;
        }
        return i;
    }

    public Header getHeader() {
        return this.mHeader;
    }

    public int getScrollStatePersistenceStrategy() {
        return this.mScrollStatePersistenceStrategy;
    }

    public SearchHeader getSearchHeader() {
        return this.mSearchHeader;
    }

    public List<Section<?>> getSections() {
        return this.mSections;
    }

    public int hashCode() {
        return Objects.hash(this.mSections, this.mActions, this.mHeader, this.mSearchHeader, Boolean.valueOf(this.mIsLoading), Boolean.valueOf(this.mIsAlphabeticalIndexingAllowed), Integer.valueOf(this.mScrollStatePersistenceStrategy));
    }

    @Deprecated
    public boolean isAlphabeticalIndexingAllowed() {
        return this.mIsAlphabeticalIndexingAllowed;
    }

    public boolean isLoading() {
        return this.mIsLoading;
    }

    public String toString() {
        return "SectionedItemTemplate";
    }

    private SectionedItemTemplate() {
        List list = Collections.EMPTY_LIST;
        this.mSections = list;
        this.mActions = list;
        this.mHeader = null;
        this.mSearchHeader = null;
        this.mIsLoading = false;
        this.mIsAlphabeticalIndexingAllowed = false;
        this.mAlphabeticalIndexingStrategy = 0;
        this.mScrollStatePersistenceStrategy = 1;
    }

    public /* synthetic */ SectionedItemTemplate(pj51 pj51Var, int i) {
        this(pj51Var);
    }
}
