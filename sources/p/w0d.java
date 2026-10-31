package p;

import android.app.PendingIntent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.graphics.drawable.IconCompat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class w0d {
    public boolean a;
    public boolean b;
    public final Object c;
    public final Object d;
    public final Object e;
    public Object f;
    public Object g;

    public w0d(boolean z, Object obj, nx2 nx2Var, boolean z2, String str, boolean z3, String str2, Function0 function0, Function0 function1) {
        this.a = z;
        this.e = obj;
        this.c = nx2Var;
        this.b = z2;
        this.d = str;
        this.f = function0;
        this.g = z3 ? Collections.singletonList(new epo(str2, new us21(function1, (byte) 8))) : z6x.a;
    }

    /* JADX WARN: Code duplicated, block: B:59:0x0135  */
    /* JADX WARN: Code duplicated, block: B:61:0x013a  */
    /* JADX WARN: Code duplicated, block: B:65:0x0176  */
    /* JADX WARN: Code duplicated, block: B:67:0x017a  */
    /* JADX WARN: Code duplicated, block: B:68:0x017d  */
    /* JADX WARN: Code duplicated, block: B:71:0x01c7  */
    /* JADX WARN: Code duplicated, block: B:73:0x01e5  */
    public void a(jbz jbzVar) {
        k4m k4mVar;
        n5a1 n5a1Var;
        Long l;
        long j;
        long j2;
        float f;
        float f2;
        qzh qzhVar;
        int i;
        String str = jbzVar.a;
        qzh qzhVar2 = (qzh) this.g;
        if (qzhVar2 == null) {
            u890.C("episodeRow");
            throw null;
        }
        bf3 bf3Var = (bf3) this.f;
        boolean z = this.b;
        waz wazVar = (!jbzVar.x || jbzVar.y) ? null : new waz(str, jbzVar.J == 3);
        List listM = wazVar == null ? p7h.M(new yaz[]{bf3.b(jbzVar), bf3.c(jbzVar), new xaz(str)}) : p7h.M(new yaz[]{wazVar, bf3.b(jbzVar), bf3.c(jbzVar)});
        ArrayList arrayList = new ArrayList();
        for (Object obj : listM) {
            arrayList.add(obj);
        }
        List listM2 = wazVar == null ? p7h.M(new yaz[]{bf3.b(jbzVar), bf3.c(jbzVar), new xaz(str)}) : p7h.M(new yaz[]{bf3.b(jbzVar), bf3.c(jbzVar), wazVar});
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : listM2) {
            arrayList2.add(obj2);
        }
        String str2 = jbzVar.f13p;
        String str3 = jbzVar.b;
        String str4 = jbzVar.d;
        String str5 = jbzVar.f;
        String str6 = jbzVar.g;
        String str7 = jbzVar.m;
        int iC = l1d.C(jbzVar.I);
        if (iC == 0) {
            k4mVar = k4m.b;
        } else if (iC == 1) {
            k4mVar = k4m.a;
        } else {
            if (iC != 2) {
                eg.o();
                return;
            }
            k4mVar = k4m.d;
        }
        k4m k4mVar2 = k4mVar;
        int i2 = jbzVar.L;
        boolean z2 = jbzVar.u || jbzVar.v;
        if (u890.j(jbzVar.C, "spotify:show:35ltzomNTBi2lqCtoL4Drt") && (i = jbzVar.L) != 0) {
            boolean z3 = k4s0.b(i);
            k540 k540Var = jbzVar.E;
            String str8 = jbzVar.F;
            n5a1Var = jbzVar.G;
            if (n5a1Var != null) {
                l = n5a1Var.a;
            } else {
                l = null;
            }
            b7z b7zVar = new b7z(str2, str3, str, str4, str5, str6, str7, k4mVar2, i2, z2, z3, k540Var, str8, e6p1.j(l, Long.valueOf(jbzVar.r.getTime()), bf3Var.a.b()));
            j = jbzVar.h;
            j2 = jbzVar.j;
            f = j;
            f2 = 0.0f;
            if (f > 0.0f) {
                if (j2 > j) {
                    f2 = 1.0f;
                } else {
                    f2 = j2 / f;
                }
            }
            qzhVar2.f(new cgm0(b7zVar, new saz(jbzVar.h, jbzVar.j, f2, jbzVar.k, jbzVar.J, dsa0.r(jbzVar.K), jbzVar.y, jbzVar.i, 64), !jbzVar.n, o7h.o0(arrayList), o7h.o0(arrayList2), z));
            qzhVar = (qzh) this.g;
            if (qzhVar != null) {
                u890.C("episodeRow");
                throw null;
            }
            qzhVar.n(new w3w((Object) this, (Object) jbzVar, (byte) 13));
            nlu nluVar = (nlu) this.e;
            nluVar.c.n(jbzVar);
            nluVar.d.n(jbzVar);
            nluVar.e.n(jbzVar);
        }
        k540 k540Var2 = jbzVar.E;
        String str9 = jbzVar.F;
        n5a1Var = jbzVar.G;
        if (n5a1Var != null) {
            l = n5a1Var.a;
        } else {
            l = null;
        }
        b7z b7zVar2 = new b7z(str2, str3, str, str4, str5, str6, str7, k4mVar2, i2, z2, z3, k540Var2, str9, e6p1.j(l, Long.valueOf(jbzVar.r.getTime()), bf3Var.a.b()));
        j = jbzVar.h;
        j2 = jbzVar.j;
        f = j;
        f2 = 0.0f;
        if (f > 0.0f) {
            if (j2 > j) {
                f2 = 1.0f;
            } else {
                f2 = j2 / f;
            }
        }
        qzhVar2.f(new cgm0(b7zVar2, new saz(jbzVar.h, jbzVar.j, f2, jbzVar.k, jbzVar.J, dsa0.r(jbzVar.K), jbzVar.y, jbzVar.i, 64), !jbzVar.n, o7h.o0(arrayList), o7h.o0(arrayList2), z));
        qzhVar = (qzh) this.g;
        if (qzhVar != null) {
            u890.C("episodeRow");
            throw null;
        }
        qzhVar.n(new w3w((Object) this, (Object) jbzVar, (byte) 13));
        nlu nluVar2 = (nlu) this.e;
        nluVar2.c.n(jbzVar);
        nluVar2.d.n(jbzVar);
        nluVar2.e.n(jbzVar);
    }

    public xjo0 b() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = (ArrayList) this.g;
        if (arrayList3 != null) {
            Iterator it = arrayList3.iterator();
            if (it.hasNext()) {
                throw pze0.g(it);
            }
        }
        if (!arrayList.isEmpty()) {
        }
        return new xjo0((IconCompat) this.c, (CharSequence) this.d, (PendingIntent) this.e, (Bundle) this.f, arrayList2.isEmpty() ? null : (z221[]) arrayList2.toArray(new z221[arrayList2.size()]), this.a, this.b);
    }

    public jhm c() {
        boolean z = this.a;
        return new jhm("aligned_curation_add_and_remove_to_your_library", z ? klx.c : irx.c, (fhm) null, Integer.valueOf(bro1.n(z, this.b)), (String) null, false, (tm81) null, new ihm(new ygm(2), z ? hhm.b : hhm.a, new ghm(kfo.g, new pgo(this, (byte) 0)), new pgo(this, (byte) 1)), 244);
    }

    public View d() {
        yir yirVarA = ((nfx) this.c).a(this.a ? k9z.b : k9z.a);
        this.g = yirVarA;
        return (ConstraintLayout) yirVarA.c;
    }

    public w0d(nfx nfxVar, rxr rxrVar, boolean z, nlu nluVar, bf3 bf3Var, boolean z2) {
        this.c = nfxVar;
        this.d = rxrVar;
        this.a = z;
        this.e = nluVar;
        this.f = bf3Var;
        this.b = z2;
    }

    public /* synthetic */ w0d(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, boolean z, boolean z2) {
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f = obj4;
        this.g = obj5;
        this.a = z;
        this.b = z2;
    }

    public w0d(d1d d1dVar, g661 g661Var) {
        this.a = false;
        this.b = false;
        this.e = new Object();
        this.f = new fp8((byte) 11);
        this.c = d1dVar;
        this.d = g661Var;
    }

    public w0d(int i, PendingIntent pendingIntent, String str) {
        this(i != 0 ? IconCompat.g((Resources) null, "", i) : null, str, pendingIntent, new Bundle());
    }

    public w0d(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent, Bundle bundle) {
        this.a = true;
        this.b = true;
        this.c = iconCompat;
        this.d = dko0.d(charSequence);
        this.e = pendingIntent;
        this.f = bundle;
        this.g = null;
        this.a = true;
        this.b = true;
    }
}
