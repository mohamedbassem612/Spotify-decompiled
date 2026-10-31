package p;

import android.view.ViewGroup;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class qtw implements wpw {
    public final mqw a;
    public final rqw b;
    public final osw c;
    public final /* synthetic */ maa d;

    public qtw(maa maaVar, ViewGroup.LayoutParams layoutParams, Object obj) {
        this.d = maaVar;
        this.a = maaVar.getBehavior();
        this.b = maaVar.a();
        this.c = f6o1.B(maaVar.c(), layoutParams, obj);
    }

    @Override // p.avl1
    public final rqw a() {
        return this.b;
    }

    @Override // p.laa
    public final String b() {
        return this.d.b();
    }

    @Override // p.laa
    public final rsw c() {
        return this.c;
    }

    @Override // p.laa
    public final mqw getBehavior() {
        return this.a;
    }
}
