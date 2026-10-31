package p;

import android.database.DataSetObserver;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class loo extends DataSetObserver {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ loo(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // android.database.DataSetObserver
    public final void onChanged() {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                wwc1 wwc1Var = (wwc1) obj;
                wwc1Var.a = true;
                wwc1Var.notifyDataSetChanged();
                break;
            default:
                y0d0 y0d0Var = (y0d0) obj;
                if (y0d0Var.Y0.isShowing()) {
                    y0d0Var.m();
                }
                break;
        }
    }

    @Override // android.database.DataSetObserver
    public final void onInvalidated() {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                wwc1 wwc1Var = (wwc1) obj;
                wwc1Var.a = false;
                wwc1Var.notifyDataSetInvalidated();
                break;
            default:
                ((y0d0) obj).dismiss();
                break;
        }
    }
}
