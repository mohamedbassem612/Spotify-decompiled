package p;

import android.os.AsyncTask;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class pmr0 extends AsyncTask {
    public final /* synthetic */ qmr0 a;
    public final /* synthetic */ tfp0 b;

    public pmr0(tfp0 tfp0Var, qmr0 qmr0Var) {
        this.b = tfp0Var;
        this.a = qmr0Var;
    }

    @Override // android.os.AsyncTask
    public final Object doInBackground(Object[] objArr) {
        try {
            return this.b.a();
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // android.os.AsyncTask
    public final void onPostExecute(Object obj) {
        this.a.A((smr0) obj);
    }
}
