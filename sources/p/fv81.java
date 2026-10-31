package p;

import android.content.Context;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class fv81 extends x9a implements isd {
    public final /* synthetic */ byte b;
    public final yqg c;
    public final Context d;
    public final String e;
    public final r87 f;
    public final vz01 g;
    public final lfb h;
    public Set i;
    public final pud j;
    public final jvd k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fv81(yqg yqgVar, Context context, String str, fjb fjbVar, r87 r87Var, vz01 vz01Var, lfb lfbVar, byte b) {
        super(fjbVar);
        this.b = b;
        w7x w7xVar = w7x.a;
        switch (b) {
            case 1:
                super(fjbVar);
                this.c = yqgVar;
                this.d = context;
                this.e = str;
                this.f = r87Var;
                this.g = vz01Var;
                this.h = lfbVar;
                this.i = w7xVar;
                this.k = new ep31(this, (byte) 16);
                this.j = pud.SIMILAR_TO_EPISODE;
                break;
            default:
                this.c = yqgVar;
                this.d = context;
                this.e = str;
                this.f = r87Var;
                this.g = vz01Var;
                this.h = lfbVar;
                this.i = w7xVar;
                this.k = new c681(this, (byte) 5);
                this.j = pud.SIMILAR_TO_AUDIOBOOK;
                break;
        }
    }

    @Override // p.x9a
    public final List a() {
        switch (this.b) {
            case 0:
                return Collections.singletonList(gn90.c);
            default:
                return Collections.singletonList(gn90.b);
        }
    }

    public final void c(i iVar, ArrayList arrayList) {
        switch (this.b) {
            case 0:
                d().c.onNext(new bsd(iVar, arrayList));
                break;
            default:
                d().c.onNext(new bsd(iVar, arrayList));
                break;
        }
    }

    @Override // p.x9a
    public final pud e() {
        switch (this.b) {
            case 0:
                break;
        }
        return this.j;
    }

    @Override // p.x9a
    public final jvd f() {
        switch (this.b) {
            case 0:
                break;
        }
        return this.k;
    }

    @Override // p.x9a
    public final boolean g(List list) {
        boolean zIsEmpty;
        switch (this.b) {
            case 0:
                zIsEmpty = this.i.isEmpty();
                break;
            default:
                zIsEmpty = this.i.isEmpty();
                break;
        }
        return !zIsEmpty;
    }

    @Override // p.x9a
    public final void i(Bundle bundle) {
        ArrayList parcelableArrayList;
        ArrayList parcelableArrayList2;
        byte b = this.b;
        Set setP1 = w7x.a;
        pud pudVar = this.j;
        switch (b) {
            case 0:
                if (bundle != null && (parcelableArrayList = bundle.getParcelableArrayList(pudVar.a)) != null) {
                    setP1 = o7h.p1(parcelableArrayList);
                }
                this.i = setP1;
                break;
            default:
                if (bundle != null && (parcelableArrayList2 = bundle.getParcelableArrayList(pudVar.a)) != null) {
                    setP1 = o7h.p1(parcelableArrayList2);
                }
                this.i = setP1;
                break;
        }
    }

    @Override // p.x9a
    public final void j(Bundle bundle) {
        byte b = this.b;
        pud pudVar = this.j;
        switch (b) {
            case 0:
                bundle.putParcelableArrayList(pudVar.a, new ArrayList<>(this.i));
                break;
            default:
                bundle.putParcelableArrayList(pudVar.a, new ArrayList<>(this.i));
                break;
        }
    }
}
