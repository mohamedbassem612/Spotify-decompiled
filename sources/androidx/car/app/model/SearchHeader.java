package androidx.car.app.model;

import java.util.Collections;
import java.util.List;
import java.util.Objects;
import p.aw41;
import p.qrd;
import p.w351;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
@qrd
public final class SearchHeader {
    private final List<Action> mEndHeaderActions;
    private final String mInitialSearchText;
    private final aw41 mSearchCallbackDelegate;
    private final String mSearchHint;
    private final boolean mShowKeyboardByDefault;
    private final Action mStartHeaderAction;

    private SearchHeader() {
        this.mSearchCallbackDelegate = null;
        this.mInitialSearchText = null;
        this.mSearchHint = null;
        this.mShowKeyboardByDefault = true;
        this.mStartHeaderAction = null;
        this.mEndHeaderActions = Collections.EMPTY_LIST;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SearchHeader)) {
            return false;
        }
        SearchHeader searchHeader = (SearchHeader) obj;
        return this.mShowKeyboardByDefault == searchHeader.mShowKeyboardByDefault && Objects.equals(this.mInitialSearchText, searchHeader.mInitialSearchText) && Objects.equals(this.mSearchHint, searchHeader.mSearchHint) && Objects.equals(this.mStartHeaderAction, searchHeader.mStartHeaderAction) && Objects.equals(this.mEndHeaderActions, searchHeader.mEndHeaderActions);
    }

    public List<Action> getEndHeaderActions() {
        return this.mEndHeaderActions;
    }

    public String getInitialSearchText() {
        return this.mInitialSearchText;
    }

    public aw41 getSearchCallbackDelegate() {
        aw41 aw41Var = this.mSearchCallbackDelegate;
        Objects.requireNonNull(aw41Var);
        return aw41Var;
    }

    public String getSearchHint() {
        return this.mSearchHint;
    }

    public Action getStartHeaderAction() {
        return this.mStartHeaderAction;
    }

    public int hashCode() {
        return Objects.hash(this.mInitialSearchText, this.mSearchHint, Boolean.valueOf(this.mShowKeyboardByDefault), this.mStartHeaderAction, this.mEndHeaderActions);
    }

    public boolean isShowKeyboardByDefault() {
        return this.mShowKeyboardByDefault;
    }

    public String toString() {
        return "SearchHeader";
    }

    public SearchHeader(w351 w351Var) {
        throw null;
    }
}
