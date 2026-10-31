package p;

import android.view.View;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class s3f1 extends rek1 {
    public boolean a = false;
    public final /* synthetic */ byte b;
    public final /* synthetic */ t3f1 c;

    /* JADX WARN: Multi-variable type inference failed */
    public s3f1(t3f1 t3f1Var, int i) {
        this.c = t3f1Var;
        this.b = i;
    }

    @Override // p.rek1
    public final void a(View view) {
        this.a = true;
    }

    public final void d(View view) {
        if (this.a) {
            return;
        }
        this.c.a.setVisibility(this.b);
    }

    @Override // p.rek1
    public final void e() {
        this.c.a.setVisibility(0);
    }
}
