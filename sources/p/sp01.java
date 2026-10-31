package p;

import android.content.Context;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class sp01 extends x9a {
    public final /* synthetic */ byte b = 0;
    public final Object c;
    public final pud d;
    public final Object e;
    public final Object f;
    public final jvd g;

    public sp01(Context context, fjb fjbVar, r87 r87Var, yp01 yp01Var) {
        super(fjbVar);
        this.c = context;
        this.e = r87Var;
        this.f = yp01Var;
        this.g = new gmm0(this, (byte) 1);
        this.d = pud.RECENTLY_PLAYED;
    }

    @Override // p.x9a
    public void b(String str, i iVar, ArrayList arrayList) {
        switch (this.b) {
            case 1:
                break;
            default:
                super.b(str, iVar, arrayList);
                break;
        }
    }

    @Override // p.x9a
    public final pud e() {
        switch (this.b) {
            case 0:
                break;
            case 1:
                break;
        }
        return this.d;
    }

    @Override // p.x9a
    public final jvd f() {
        switch (this.b) {
            case 0:
                return (gmm0) this.g;
            case 1:
                return this.g;
            default:
                return (gmm0) this.g;
        }
    }

    @Override // p.x9a
    public boolean g(List list) {
        switch (this.b) {
            case 1:
                return true;
            case 2:
                return true;
            default:
                return super.g(list);
        }
    }

    public sp01(Context context, fjb fjbVar, sjj0 sjj0Var, t5a1 t5a1Var, lfb lfbVar) {
        super(fjbVar);
        this.c = context;
        this.e = sjj0Var;
        this.f = lfbVar;
        this.g = new r2a1(t5a1Var, this, (byte) 2);
        this.d = pud.SOCIAL_RECOMMENDATIONS;
    }

    public sp01(lc20 lc20Var, fjb fjbVar, String str, r87 r87Var) {
        super(fjbVar);
        this.c = lc20Var;
        this.f = str;
        this.e = r87Var;
        this.g = new gmm0(this, (byte) 2);
        this.d = pud.TOP_GENRES;
    }

    private final void l(String str, i iVar, ArrayList arrayList) {
    }
}
