package androidx.car.app.model;

import java.util.Collections;
import java.util.List;
import java.util.Objects;
import p.e4p1;
import p.knr0;
import p.qrd;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
@qrd
public final class Pane {
    private final List<Action> mActionList;
    private final CarIcon mImage;
    private final boolean mIsLoading;
    private final List<Row> mRows;

    public Pane(knr0 knr0Var) {
        this.mRows = e4p1.w(knr0Var.a);
        this.mActionList = e4p1.w(knr0Var.b);
        this.mImage = knr0Var.d;
        this.mIsLoading = knr0Var.c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Pane)) {
            return false;
        }
        Pane pane = (Pane) obj;
        return this.mIsLoading == pane.mIsLoading && Objects.equals(this.mActionList, pane.mActionList) && Objects.equals(this.mRows, pane.mRows) && Objects.equals(this.mImage, pane.mImage);
    }

    public List<Action> getActions() {
        List<Action> list = this.mActionList;
        return list != null ? list : Collections.EMPTY_LIST;
    }

    public CarIcon getImage() {
        return this.mImage;
    }

    public List<Row> getRows() {
        List<Row> list = this.mRows;
        return list != null ? list : Collections.EMPTY_LIST;
    }

    public int hashCode() {
        return Objects.hash(this.mRows, this.mActionList, Boolean.valueOf(this.mIsLoading), this.mImage);
    }

    public boolean isLoading() {
        return this.mIsLoading;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[ rows: ");
        List<Row> list = this.mRows;
        sb.append(list != null ? list.toString() : null);
        sb.append(", action list: ");
        sb.append(this.mActionList);
        sb.append("]");
        return sb.toString();
    }

    private Pane() {
        List list = Collections.EMPTY_LIST;
        this.mRows = list;
        this.mActionList = list;
        this.mIsLoading = false;
        this.mImage = null;
    }
}
