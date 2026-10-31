package p;

import android.content.Context;
import android.content.Intent;
import android.graphics.SurfaceTexture;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Size;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.view.Surface;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.spotify.accountswitching.accountpickerimpl.AccountPickerActivity;
import com.spotify.martini.martinidata.model.Mode;
import com.spotify.scannables.scannables.view.ScannablesOnboardingActivity;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Scheduler;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class toj0 implements dl4 {
    public static final huz h = new huz(Boolean.TRUE, (byte) 10);
    public final /* synthetic */ byte a;
    public Object b;
    public Object c;
    public final Object d;
    public final Object e;
    public Object f;
    public Object g;

    public toj0(w2d w2dVar, oju ojuVar, h1d h1dVar) {
        Size size;
        this.a = (byte) 0;
        s2d1 s2d1Var = new s2d1();
        Size size2 = null;
        this.g = null;
        this.d = new soj0();
        this.f = h1dVar;
        Size[] sizeArrG = w2dVar.b().G(34);
        if (sizeArrG == null) {
            j2h1.p("MeteringRepeating");
            size = new Size(0, 0);
        } else {
            if (s2d1Var.a != null && "Huawei".equalsIgnoreCase(Build.BRAND) && "mha-l29".equalsIgnoreCase(Build.MODEL)) {
                ArrayList arrayList = new ArrayList();
                for (Size size3 : sizeArrG) {
                    if (s2d1.c.compare(size3, s2d1.b) >= 0) {
                        arrayList.add(size3);
                    }
                }
                sizeArrG = (Size[]) arrayList.toArray(new Size[0]);
            }
            List listAsList = Arrays.asList(sizeArrG);
            Collections.sort(listAsList, new m((byte) 22));
            Size sizeE = ojuVar.e();
            long jMin = Math.min(((long) sizeE.getWidth()) * ((long) sizeE.getHeight()), 307200L);
            int length = sizeArrG.length;
            int i = 0;
            while (i < length) {
                Size size4 = sizeArrG[i];
                long width = ((long) size4.getWidth()) * ((long) size4.getHeight());
                if (width == jMin) {
                    size = size4;
                } else if (width <= jMin) {
                    i++;
                    size2 = size4;
                } else if (size2 != null) {
                    size = size2;
                }
            }
            size = (Size) listAsList.get(0);
        }
        this.e = size;
        Objects.toString(size);
        j2h1.o("MeteringRepeating");
        this.c = k();
    }

    public static ypr A(DataInputStream dataInputStream) throws IOException {
        int i = dataInputStream.readInt();
        HashMap map = new HashMap();
        for (int i2 = 0; i2 < i; i2++) {
            String utf = dataInputStream.readUTF();
            int i3 = dataInputStream.readInt();
            if (i3 < 0) {
                k220.i(f4i1.c(i3, "Invalid value size: "));
                return null;
            }
            int iMin = Math.min(i3, 10485760);
            byte[] bArrCopyOf = zoi1.b;
            int i4 = 0;
            while (i4 != i3) {
                int i5 = i4 + iMin;
                bArrCopyOf = Arrays.copyOf(bArrCopyOf, i5);
                dataInputStream.readFully(bArrCopyOf, i4, iMin);
                iMin = Math.min(i3 - i5, 10485760);
                i4 = i5;
            }
            map.put(utf, bArrCopyOf);
        }
        return new ypr(map);
    }

    public static void D(ypr yprVar, DataOutputStream dataOutputStream) throws IOException {
        Set<Map.Entry> setEntrySet = yprVar.b.entrySet();
        dataOutputStream.writeInt(setEntrySet.size());
        for (Map.Entry entry : setEntrySet) {
            dataOutputStream.writeUTF((String) entry.getKey());
            byte[] bArr = (byte[]) entry.getValue();
            dataOutputStream.writeInt(bArr.length);
            dataOutputStream.write(bArr);
        }
    }

    public static fq51 j(Class cls, wpc wpcVar) {
        try {
            return (fq51) cls.getConstructor(wpc.class).newInstance(wpcVar);
        } catch (Exception e) {
            k220.p("Downloader factory missing", e);
            return null;
        }
    }

    public static boolean t(String str) {
        return str.startsWith("cached_content_index.exi");
    }

    public void B() {
        mjh1 mjh1VarK = t380.p(((HashMap) this.b).keySet()).k();
        while (mjh1VarK.hasNext()) {
            v((String) mjh1VarK.next());
        }
    }

    public void C() {
        ((atc) this.f).g((HashMap) this.b);
        SparseBooleanArray sparseBooleanArray = (SparseBooleanArray) this.d;
        int size = sparseBooleanArray.size();
        for (int i = 0; i < size; i++) {
            ((SparseArray) this.c).remove(sparseBooleanArray.keyAt(i));
        }
        sparseBooleanArray.clear();
        ((SparseBooleanArray) this.e).clear();
    }

    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r2v4 */
    public void a(gfq0 gfq0Var, th61 th61Var, ods odsVar, qim0 qim0Var, mr20 mr20Var, b0k b0kVar, int i, int i2) {
        int i3;
        mr20 mr20Var2;
        x340 x340Var;
        qim0 qim0Var2;
        mr20 mr20Var3;
        qim0 qim0Var3;
        int i4;
        mr20 mr20Var4;
        Object next;
        Object b6r0Var;
        lzh lzhVar;
        ?? r2;
        qim0 qim0Var4;
        m4c m4cVar = fkj0.X;
        x340 x340Var2 = (x340) b0kVar;
        x340Var2.k0(-1935899467);
        if ((i & 6) == 0) {
            i3 = (x340Var2.i(gfq0Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= x340Var2.i(th61Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= (i & 512) == 0 ? x340Var2.g(odsVar) : x340Var2.i(odsVar) ? 256 : 128;
        }
        int i5 = i3 | 3072;
        if ((i & 24576) == 0) {
            if ((i2 & 16) == 0) {
                mr20Var2 = mr20Var;
                int i6 = x340Var2.i(mr20Var2) ? 16384 : 8192;
                i5 |= i6;
            } else {
                mr20Var2 = mr20Var;
            }
            i5 |= i6;
        } else {
            mr20Var2 = mr20Var;
        }
        if ((196608 & i) == 0) {
            i5 |= x340Var2.i(this) ? 131072 : 65536;
        }
        if (x340Var2.Y(i5 & 1, (74899 & i5) != 74898)) {
            x340Var2.d0();
            if ((i & 1) == 0 || x340Var2.E()) {
                int i7 = i2 & 16;
                qim0Var3 = nim0.a;
                if (i7 != 0) {
                    i5 &= -57345;
                    mr20Var2 = h;
                }
                mr20 mr20Var5 = mr20Var2;
                i4 = i5;
                mr20Var4 = mr20Var5;
            } else {
                x340Var2.b0();
                if ((i2 & 16) != 0) {
                    i5 &= -57345;
                }
                mr20 mr20Var6 = mr20Var2;
                i4 = i5;
                mr20Var4 = mr20Var6;
                qim0Var3 = qim0Var;
            }
            x340Var2.s();
            boolean zG = x340Var2.g(gfq0Var) | x340Var2.g(th61Var);
            Object objT = x340Var2.T();
            if (zG || objT == m4cVar) {
                hur hurVar = (hur) this.b;
                String str = gfq0Var.a;
                v5b1 v5b1VarA = d7b1.a(str);
                if (v5b1VarA == null) {
                    bhn0.f("Invalid onboarding URI ".concat(str));
                    return;
                }
                Iterator it = ((LinkedHashSet) hurVar.b).iterator();
                do {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (!((acr0) next).e().contains(v5b1VarA.getType()));
                acr0 acr0Var = (acr0) next;
                if (acr0Var == null) {
                    k220.f("No onboarding page route claims ".concat(v5b1VarA.getType().getKey()));
                    return;
                }
                ebr0 ebr0Var = (ebr0) ((mly0) hurVar.c).get(acr0Var.b());
                if (ebr0Var == null) {
                    bhn0.B(acr0Var.b(), "No page provider found for onboarding page type ");
                    return;
                }
                Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
                Bundle bundle = gfq0Var.b;
                if (bundle != null) {
                    intent.putExtras(bundle);
                }
                Set set = s4b1.f;
                lzh lzhVar2 = new lzh(ebr0Var, acr0Var.c(intent, uic.x(str), th61Var));
                x340Var2.s0(lzhVar2);
                objT = lzhVar2;
            }
            lzh lzhVar3 = (lzh) objT;
            int i8 = (i4 & 14) | ((i4 >> 3) & 112);
            int i9 = i4 >> 6;
            int i10 = (i9 & 7168) | i8 | (i9 & 896);
            g0i g0iVar = (g0i) x340Var2.k(mce0.a);
            cir0 cir0Var = (cir0) x340Var2.k(k2r0.a);
            dg0 dg0Var = (dg0) this.f;
            boolean zG2 = ((((i10 & 112) ^ 48) > 32 && x340Var2.g(odsVar)) || (i10 & 48) == 32) | x340Var2.g(gfq0Var) | x340Var2.g(g0iVar) | x340Var2.g(cir0Var) | x340Var2.g(mr20Var4) | x340Var2.g(dg0Var) | x340Var2.g((kly0) this.g);
            Object objT2 = x340Var2.T();
            if (zG2 || objT2 == m4cVar) {
                x340Var = x340Var2;
                lzhVar = lzhVar3;
                r2 = 0;
                qim0Var4 = qim0Var3;
                b6r0Var = new b6r0(g0iVar, cir0Var.d(), (o7r0) this.e, null, new ifq0(odsVar, this), new jfq0(odsVar, this, gfq0Var), null, u9b1.a, dg0Var.a(g0iVar), yoi1.i(mr20Var4, o6x.a), null, odsVar, new pdp0((Object) this, (byte) 23), 4520);
                x340Var.s0(b6r0Var);
            } else {
                b6r0Var = objT2;
                x340Var = x340Var2;
                lzhVar = lzhVar3;
                qim0Var4 = qim0Var3;
                r2 = 0;
            }
            b6r0 b6r0Var2 = (b6r0) b6r0Var;
            qim0 qim0VarD = u291.d(qim0Var4, 1.0f);
            gfh0 gfh0VarC = t1c.c(een.d, (boolean) r2);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarD);
            hzj.A.getClass();
            if (x340Var.a == null) {
                tgp1.p();
                throw null;
            }
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(hmb0.t1);
            } else {
                x340Var.v0();
            }
            nko1.H(gfh0VarC, x340Var, y580.O0);
            nko1.H(xos0VarM, x340Var, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
            nko1.F(x340Var);
            nko1.H(qim0VarE, x340Var, y580.Y);
            eqn1.h(grn1.w(lzhVar, b6r0Var2, rih1.a, x340Var, 384), x340Var, (int) r2);
            x340Var.r(true);
            qim0Var2 = qim0Var4;
            mr20Var3 = mr20Var4;
        } else {
            x340Var = x340Var2;
            x340Var.b0();
            qim0Var2 = qim0Var;
            mr20Var3 = mr20Var2;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new bd5(this, gfq0Var, th61Var, odsVar, qim0Var2, mr20Var3, i, i2, (byte) 11);
        }
    }

    public void d(String str, oql oqlVar) {
        ysc yscVarQ = q(str);
        ypr yprVar = yscVarQ.e;
        ypr yprVarB = yprVar.b(oqlVar);
        yscVarQ.e = yprVarB;
        if (yprVarB.equals(yprVar)) {
            return;
        }
        ((atc) this.f).b(yscVarQ);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object e(String str, onm onmVar) {
        ylo yloVar;
        List m231Var;
        if (onmVar instanceof ylo) {
            yloVar = (ylo) onmVar;
            int i = yloVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                yloVar.d = i - Integer.MIN_VALUE;
            } else {
                yloVar = new ylo(this, onmVar);
            }
        } else {
            yloVar = new ylo(this, onmVar);
        }
        Object objC = yloVar.b;
        int i2 = yloVar.d;
        Object obj = null;
        try {
            if (i2 == 0) {
                hm5.M(objC);
                bxh bxhVar = (uwh) this.b;
                yloVar.a = str;
                yloVar.d = 1;
                objC = bxhVar.c(str, yloVar);
                d9n d9nVar = d9n.a;
                if (objC == d9nVar) {
                    return d9nVar;
                }
            } else {
                if (i2 != 1) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                str = yloVar.a;
                hm5.M(objC);
            }
            m231Var = (List) objC;
        } catch (Throwable th) {
            m231Var = new m231(th);
        }
        if (e331.a(m231Var) != null) {
            return Boolean.FALSE;
        }
        for (Object obj2 : m231Var) {
            if (((zvh) obj2).a.equals(str)) {
                obj = obj2;
                break;
            }
        }
        zvh zvhVar = (zvh) obj;
        return Boolean.valueOf(zvhVar != null && (zvhVar.b.isEmpty() ^ true));
    }

    public void f(String str) {
        Object value;
        Object value2;
        if (ihc1.y0(str)) {
            return;
        }
        bpb1 bpb1Var = (bpb1) ((lvc1) this.c).c;
        do {
            value = bpb1Var.getValue();
        } while (!bpb1Var.k(value, str));
        bpb1 bpb1Var2 = (bpb1) this.f;
        do {
            value2 = bpb1Var2.getValue();
        } while (!bpb1Var2.k(value2, str));
        fn31.T(cto1.q((iac0) this.d), (o8n) null, 0, new zlo(this, str, (lnm) null, (byte) 0), 3);
    }

    public lag g() {
        f9p f9pVar = (f9p) this.b;
        w390 w390Var = (w390) f9pVar.t;
        c8o.l(w390Var);
        yh2 yh2Var = (yh2) f9pVar.X;
        c8o.l(yh2Var);
        vb2 vb2Var = (vb2) f9pVar.Y;
        c8o.l(vb2Var);
        x290 x290Var = (x290) f9pVar.O0;
        c8o.l(x290Var);
        return new lag(w390Var, yh2Var, vb2Var, x290Var, (byte) 23);
    }

    public p2o0 h() {
        b2p b2pVar = (b2p) this.c;
        b2p b2pVar2 = (b2p) this.d;
        b2p b2pVar3 = (b2p) this.e;
        n801 n801Var = new n801((b2p) this.f, (byte) 10);
        b2p b2pVar4 = (b2p) this.g;
        add addVar = (add) ((cp31) this.b).a;
        c8o.l(addVar);
        return new p2o0(b2pVar, b2pVar2, b2pVar3, n801Var, b2pVar4, addVar, (byte) 12);
    }

    public l3v i(j0v j0vVar) {
        fq51 fq51VarU;
        soh0 soh0Var;
        wpc wpcVar = (wpc) this.b;
        List list = j0vVar.d;
        Uri uri = j0vVar.b;
        String str = j0vVar.c;
        if ("spotifyadaptive".equalsIgnoreCase(str)) {
            koh0 koh0Var = new koh0();
            koh0Var.e = uri;
            koh0Var.b(list);
            yoh0 yoh0VarA = koh0Var.a();
            q59 q59Var = (q59) this.e;
            wpc wpcVar2 = (wpc) this.f;
            h7b1 h7b1Var = new h7b1(yoh0VarA, (vrv0) q59Var.b, wpcVar2, (Executor) this.g, 20000L, 0L, -9223372036854775807L);
            if (!((rma) q59Var.c).a().D1) {
                return h7b1Var;
            }
            soh0 soh0Var2 = yoh0VarA.b;
            if (soh0Var2 != null) {
                return new cab(h7b1Var, soh0Var2.a, wpcVar2, (byte) 4);
            }
            hhg1.n("Required value was null.");
            return null;
        }
        String str2 = j0vVar.f;
        int iN = zoi1.N(uri, str);
        if (iN != 0) {
            boolean z = true;
            if (iN != 1 && iN != 2) {
                if (iN != 4) {
                    hhg1.n(f4i1.c(iN, "Unsupported type: "));
                    return null;
                }
                g0v g0vVar = j0vVar.h;
                loh0 loh0Var = new loh0();
                ooh0 ooh0Var = new ooh0();
                List list2 = Collections.EMPTY_LIST;
                w280 w280Var = b380.b;
                bg11 bg11Var = bg11.e;
                qoh0 qoh0Var = new qoh0();
                toh0 toh0Var = toh0.d;
                if (((Uri) ooh0Var.e) != null && ((UUID) ooh0Var.d) == null) {
                    z = false;
                }
                dm5.y(z);
                if (uri != null) {
                    soh0Var = new soh0(uri, (String) null, ((UUID) ooh0Var.d) != null ? new poh0(ooh0Var) : null, (joh0) null, list2, str2, bg11Var, -9223372036854775807L);
                } else {
                    soh0Var = null;
                }
                return new pjx0(new yoh0("", new noh0(loh0Var), soh0Var, new roh0(qoh0Var), tqh0.M, toh0Var), wpcVar, (Executor) this.c, g0vVar != null ? g0vVar.a : 0L, g0vVar != null ? g0vVar.b : -1L);
            }
        }
        SparseArray sparseArray = (SparseArray) this.d;
        if (sparseArray.indexOfKey(iN) >= 0) {
            fq51VarU = (fq51) sparseArray.get(iN);
        } else {
            try {
                fq51VarU = u(iN, wpcVar);
            } catch (ClassNotFoundException e) {
                k220.p(f4i1.c(iN, "Module missing for content type "), e);
                return null;
            }
        }
        koh0 koh0Var2 = new koh0();
        koh0Var2.e = uri;
        koh0Var2.b(list);
        koh0Var2.d = str2;
        yoh0 yoh0VarA2 = koh0Var2.a();
        h0v h0vVar = j0vVar.i;
        if (h0vVar != null) {
            ok60 ok60Var = (ok60) fq51VarU;
            ok60Var.e = h0vVar.a;
            ok60Var.f = h0vVar.b;
        }
        Executor executor = (Executor) this.c;
        ok60 ok60Var2 = (ok60) fq51VarU;
        ok60Var2.c = executor;
        return new pk60(yoh0VarA2, ok60Var2.b, ok60Var2.a, executor, ok60Var2.d, ok60Var2.e, ok60Var2.f);
    }

    public bb61 k() {
        SurfaceTexture surfaceTexture = new SurfaceTexture(0);
        Size size = (Size) this.e;
        surfaceTexture.setDefaultBufferSize(size.getWidth(), size.getHeight());
        Surface surface = new Surface(surfaceTexture);
        va61 va61VarD = va61.d((soj0) this.d, size);
        ((ua61) va61VarD).b.b = 1;
        g280 g280Var = new g280(surface);
        this.b = g280Var;
        n8d0 n8d0VarF = poz0.F(((j2t) g280Var).e);
        yge0 yge0Var = new yge0(surface, surfaceTexture, (byte) 25);
        n8d0VarF.b(new nx30(n8d0VarF, yge0Var, (byte) 0), n5u.a());
        va61VarD.b((g280) this.b, liv.d, -1);
        wa61 wa61Var = (wa61) this.g;
        if (wa61Var != null) {
            wa61Var.b();
        }
        wa61 wa61Var2 = new wa61(new pq70(this, (byte) 2));
        this.g = wa61Var2;
        ((ua61) va61VarD).f = wa61Var2;
        return va61VarD.c();
    }

    public wdm l() {
        f9p f9pVar = (f9p) this.b;
        y5v0 y5v0Var = (y5v0) f9pVar.Z;
        c8o.l(y5v0Var);
        t740 t740Var = (t740) f9pVar.N0;
        c8o.l(t740Var);
        i1r0 i1r0Var = (i1r0) f9pVar.P0;
        c8o.l(i1r0Var);
        o78 o78Var = (o78) f9pVar.Q0;
        c8o.l(o78Var);
        kt91 kt91Var = (kt91) f9pVar.b;
        c8o.l(kt91Var);
        h5q h5qVar = (h5q) f9pVar.f;
        c8o.l(h5qVar);
        uu00 uu00Var = (uu00) f9pVar.R0;
        c8o.l(uu00Var);
        kv00 kv00Var = (kv00) f9pVar.S0;
        c8o.l(kv00Var);
        ll30 ll30Var = (ll30) f9pVar.T0;
        c8o.l(ll30Var);
        lzn0 lzn0Var = (lzn0) f9pVar.U0;
        c8o.l(lzn0Var);
        x1i1 x1i1Var = (x1i1) f9pVar.V0;
        c8o.l(x1i1Var);
        q8n q8nVar = (q8n) f9pVar.i;
        c8o.l(q8nVar);
        return new wdm(y5v0Var, t740Var, i1r0Var, o78Var, kt91Var, h5qVar, uu00Var, kv00Var, ll30Var, lzn0Var, x1i1Var, q8nVar, (byte) 20);
    }

    public ysc m(String str) {
        return (ysc) ((HashMap) this.b).get(str);
    }

    public r8m n(Mode mode) {
        switch (w8m.a[mode.ordinal()]) {
            case 1:
                return (jc9) this.b;
            case 2:
                return (v9c) this.c;
            case 3:
                return (nbc) this.d;
            case 4:
                return (i0y0) this.e;
            case 5:
                return (i0y0) this.f;
            case 6:
            case 7:
            case 8:
                return (i0y0) this.g;
            default:
                eg.o();
                return null;
        }
    }

    public Collection o() {
        return Collections.unmodifiableCollection(((HashMap) this.b).values());
    }

    public ypr p(String str) {
        ysc yscVarM = m(str);
        return yscVarM != null ? yscVarM.e : ypr.c;
    }

    public ysc q(String str) {
        HashMap map = (HashMap) this.b;
        ysc yscVar = (ysc) map.get(str);
        if (yscVar != null) {
            return yscVar;
        }
        SparseArray sparseArray = (SparseArray) this.c;
        int size = sparseArray.size();
        int i = 0;
        int iKeyAt = size == 0 ? 0 : sparseArray.keyAt(size - 1) + 1;
        if (iKeyAt < 0) {
            while (i < size && i == sparseArray.keyAt(i)) {
                i++;
            }
            iKeyAt = i;
        }
        ysc yscVar2 = new ysc(iKeyAt, str, ypr.c);
        map.put(str, yscVar2);
        sparseArray.put(iKeyAt, str);
        ((SparseBooleanArray) this.e).put(iKeyAt, true);
        ((atc) this.f).b(yscVar2);
        return yscVar2;
    }

    /* JADX WARN: Code duplicated, block: B:49:0x0111 A[PHI: r0 r2
      0x0111: PHI (r0v10 p.tv80) = (r0v5 p.tv80), (r0v14 p.tv80) binds: [B:47:0x010e, B:16:0x0043] A[DONT_GENERATE, DONT_INLINE]
      0x0111: PHI (r2v11 java.lang.Object) = (r2v6 java.lang.Object), (r2v1 java.lang.Object) binds: [B:47:0x010e, B:16:0x0043] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:51:0x0119  */
    /* JADX WARN: Code duplicated, block: B:7:0x0021  */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0126, code lost:
    
        if (r3.b(r0, r1, r5) == r12) goto L53;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object r(java.util.List r17, p.onm r18) {
        /*
            Method dump skipped, instruction units count: 303
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.toj0.r(java.util.List, p.onm):java.lang.Object");
    }

    public void s(long j) {
        atc atcVar;
        SparseArray sparseArray = (SparseArray) this.c;
        HashMap map = (HashMap) this.b;
        atc atcVar2 = (atc) this.f;
        atcVar2.i(j);
        atc atcVar3 = (atc) this.g;
        if (atcVar3 != null) {
            atcVar3.i(j);
        }
        if (atcVar2.f() || (atcVar = (atc) this.g) == null || !atcVar.f()) {
            atcVar2.r(map, sparseArray);
        } else {
            ((atc) this.g).r(map, sparseArray);
            atcVar2.l(map);
        }
        atc atcVar4 = (atc) this.g;
        if (atcVar4 != null) {
            atcVar4.s();
            this.g = null;
        }
    }

    public fq51 u(int i, wpc wpcVar) {
        fq51 fq51VarJ;
        if (i == 0) {
            fq51VarJ = j(Class.forName("androidx.media3.exoplayer.dash.offline.DashDownloader$Factory").asSubclass(fq51.class), wpcVar);
        } else if (i == 1) {
            fq51VarJ = j(Class.forName("androidx.media3.exoplayer.smoothstreaming.offline.SsDownloader$Factory").asSubclass(fq51.class), wpcVar);
        } else {
            if (i != 2) {
                hhg1.n(f4i1.c(i, "Unsupported type: "));
                return null;
            }
            fq51VarJ = j(ok60.class.asSubclass(fq51.class), wpcVar);
        }
        ((SparseArray) this.d).put(i, fq51VarJ);
        return fq51VarJ;
    }

    public void v(String str) {
        SparseBooleanArray sparseBooleanArray = (SparseBooleanArray) this.e;
        HashMap map = (HashMap) this.b;
        ysc yscVar = (ysc) map.get(str);
        if (yscVar != null && yscVar.c.isEmpty() && yscVar.d.isEmpty()) {
            map.remove(str);
            int i = yscVar.a;
            boolean z = sparseBooleanArray.get(i);
            ((atc) this.f).h(yscVar, z);
            SparseArray sparseArray = (SparseArray) this.c;
            if (z) {
                sparseArray.remove(i);
                sparseBooleanArray.delete(i);
            } else {
                sparseArray.put(i, null);
                ((SparseBooleanArray) this.d).put(i, true);
            }
        }
    }

    public void w(Object obj) {
        switch (this.a) {
            case 21:
                AccountPickerActivity accountPickerActivity = (AccountPickerActivity) obj;
                daq daqVar = (daq) this.c;
                ((t3b1) accountPickerActivity).b1 = (jgu) daqVar.a.g0.get();
                ((t3b1) accountPickerActivity).c1 = new tuk(xqu.a((p2p) this.f));
                accountPickerActivity.j1 = new ycc1((i8h1) daqVar.A5.get());
                accountPickerActivity.i1 = (yyp) ((jly0) this.g).get();
                accountPickerActivity.h1 = new zn(new jn((dv) daqVar.gm.get(), (u2f0) daqVar.Cf.get(), (pbk1) daqVar.Oh.get(), (wbd1) daqVar.lj.get()), daqVar.D2, (Scheduler) daqVar.r3.get(), (Scheduler) daqVar.z1.get());
                break;
            case 22:
                dqd0 dqd0Var = (dqd0) obj;
                daq daqVar2 = (daq) this.c;
                Flowable flowable = (Flowable) daqVar2.D5.get();
                yjj1 yjj1Var = (yjj1) daqVar2.zq.get();
                teq teqVar = (teq) this.d;
                dqd0Var.G1 = new q1p0(flowable, yjj1Var, (unr) teqVar.a.Db.get(), (e7p0) teqVar.W4.get(), (ior) teqVar.a.Ib.get(), (yqg) daqVar2.J1.get(), (o241) daqVar2.u4.get(), s5h.s((b7p) daqVar2.xf.get()), (ffb0) daqVar2.Zs.get(), (cbv) daqVar2.vq.get(), (Scheduler) daqVar2.z1.get(), (Scheduler) daqVar2.r3.get(), daqVar2.i(), vp90.x((uy90) daqVar2.hc.get()));
                dqd0Var.I1 = teqVar.b.X();
                dqd0Var.J1 = (m7p0) daqVar2.q9.get();
                dqd0Var.H1 = (d3q) ((jly0) this.g).get();
                break;
            default:
                ScannablesOnboardingActivity scannablesOnboardingActivity = (ScannablesOnboardingActivity) obj;
                daq daqVar3 = (daq) this.c;
                ((t3b1) scannablesOnboardingActivity).b1 = (jgu) daqVar3.a.g0.get();
                ((t3b1) scannablesOnboardingActivity).c1 = new tuk(xqu.a((obq) this.f));
                scannablesOnboardingActivity.f1 = new wh41((sh41) ((jly0) this.g).get(), (bx4) daqVar3.Go.get());
                break;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public Object x(int i, String str, String str2, onm onmVar) {
        vbr vbrVar;
        yzc0 yzc0Var = (yzc0) this.c;
        if (onmVar instanceof vbr) {
            vbrVar = (vbr) onmVar;
            int i2 = vbrVar.f;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                vbrVar.f = i2 - Integer.MIN_VALUE;
            } else {
                vbrVar = new vbr(this, onmVar);
            }
        } else {
            vbrVar = new vbr(this, onmVar);
        }
        Object objI = vbrVar.d;
        int i3 = vbrVar.f;
        rih1 rih1Var = rih1.a;
        d9n d9nVar = d9n.a;
        if (i3 == 0) {
            hm5.M(objI);
            vd0 vd0Var = new vd0(yzc0Var.j(), str, str2, (byte) 29);
            vbrVar.b = str;
            vbrVar.c = str2;
            vbrVar.a = i;
            vbrVar.f = 1;
            objI = b5p1.i(vd0Var, vbrVar);
            if (objI != d9nVar) {
            }
            return d9nVar;
        }
        if (i3 != 1) {
            if (i3 == 2) {
                hm5.M(objI);
                return rih1Var;
            }
            eg.m("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        i = vbrVar.a;
        str2 = vbrVar.c;
        str = vbrVar.b;
        hm5.M(objI);
        if (!((Boolean) objI).booleanValue()) {
            a1q a1qVar = (a1q) this.e;
            tv80 tv80VarM = ((i8h1) a1qVar.b).m(((fjl0) a1qVar.c).e(str2), (xj61) null);
            uzc0 uzc0Var = new uzc0(str);
            yjp1 yjp1Var = njy0.a;
            vbrVar.b = null;
            vbrVar.c = null;
            vbrVar.a = i;
            vbrVar.f = 2;
            if (yzc0Var.h(uzc0Var, tv80VarM, yjp1Var, vbrVar) == d9nVar) {
                return d9nVar;
            }
        }
        return rih1Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0065, code lost:
    
        if (p.fn31.Y(r8, r9, r0) == r5) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object y(p.tv80 r7, p.zuc0 r8, p.onm r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof p.ugg
            if (r0 == 0) goto L13
            r0 = r9
            p.ugg r0 = (p.ugg) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            p.ugg r0 = new p.ugg
            r0.<init>(r6, r9)
        L18:
            java.lang.Object r9 = r0.b
            int r1 = r0.d
            r2 = 1
            r3 = 2
            r4 = 0
            p.d9n r5 = p.d9n.a
            if (r1 == 0) goto L37
            if (r1 == r2) goto L31
            if (r1 != r3) goto L2b
            p.hm5.M(r9)
            goto L68
        L2b:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r6)
            return r4
        L31:
            p.tv80 r7 = r0.a
            p.hm5.M(r9)
            goto L52
        L37:
            p.hm5.M(r9)
            java.lang.Object r9 = r6.b
            p.yzc0 r9 = (p.yzc0) r9
            p.uzc0 r1 = new p.uzc0
            java.lang.String r8 = r8.a
            r1.<init>(r8)
            p.yjp1 r8 = p.sjy0.a
            r0.a = r7
            r0.d = r2
            java.lang.Object r8 = r9.h(r1, r7, r8, r0)
            if (r8 != r5) goto L52
            goto L67
        L52:
            java.lang.Object r8 = r6.g
            p.q8n r8 = (p.q8n) r8
            p.pid r9 = new p.pid
            r1 = 16
            r9.<init>(r6, r7, r4, r1)
            r0.a = r4
            r0.d = r3
            java.lang.Object r6 = p.fn31.Y(r8, r9, r0)
            if (r6 != r5) goto L68
        L67:
            return r5
        L68:
            p.rih1 r6 = p.rih1.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p.toj0.y(p.tv80, p.zuc0, p.onm):java.lang.Object");
    }

    public r0s0 z() {
        return new r0s0((rxp) ((jly0) this.c).get(), (txp) ((jly0) this.e).get(), (sxp) ((jly0) this.d).get(), (uxp) ((jly0) this.f).get(), (vxp) ((jly0) this.g).get());
    }

    public toj0(Context context, agx agxVar, iac0 iac0Var, gik1 gik1Var, lh2 lh2Var) {
        this.a = (byte) 27;
        this.b = gik1Var;
        this.c = lh2Var;
        LinearLayout linearLayout = new LinearLayout(context);
        this.d = linearLayout;
        h98 h98VarA = agxVar.a((l0i) null);
        this.e = h98VarA;
        this.g = new LinkedHashMap();
        linearLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        linearLayout.setPaddingRelative(linearLayout.getPaddingStart(), linearLayout.getResources().getDimensionPixelSize(2131167023), linearLayout.getPaddingEnd(), linearLayout.getResources().getDimensionPixelSize(2131167028));
        linearLayout.setOrientation(1);
        pes0 pes0Var = (pes0) h98VarA.b;
        RecyclerView recyclerView = pes0Var.a;
        wus wusVar = new wus(recyclerView, iac0Var, new ehs(this, (byte) 0), new ehs(this, (byte) 1), new ehs(this, (byte) 2));
        recyclerView.addOnAttachStateChangeListener(wusVar);
        iac0Var.getLifecycle().a(new ek2(wusVar, (byte) 24));
        RecyclerView recyclerView2 = pes0Var.a;
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(recyclerView2.getLayoutParams());
        int dimensionPixelSize = recyclerView2.getResources().getDimensionPixelSize(2131167023);
        int i = marginLayoutParams.topMargin;
        int i2 = marginLayoutParams.bottomMargin;
        marginLayoutParams.setMarginStart(dimensionPixelSize);
        marginLayoutParams.topMargin = i;
        marginLayoutParams.setMarginEnd(dimensionPixelSize);
        marginLayoutParams.bottomMargin = i2;
        recyclerView2.setLayoutParams(marginLayoutParams);
        linearLayout.addView(pes0Var.a);
        RecyclerView recyclerView3 = pes0Var.a;
        gik1.b(recyclerView3);
        recyclerView3.k(new fhs(this, recyclerView3));
    }

    public toj0(gid gidVar, rd30 rd30Var, mo80 mo80Var, p4t p4tVar, hr0 hr0Var) {
        this.a = (byte) 3;
        this.b = gidVar;
        this.c = mo80Var;
        this.d = p4tVar;
        this.e = hr0Var;
        this.f = new Handler(Looper.getMainLooper());
        this.g = rd30Var.a(qd30.b);
    }

    public toj0(qpp qppVar, acr acrVar, yzc0 yzc0Var, qwt0 qwt0Var, r6h1 r6h1Var) {
        this.a = (byte) 25;
        this.b = acrVar;
        this.c = yzc0Var;
        this.d = qwt0Var;
        this.e = new a1q(u1n0.z((q7r0) ((uap) qppVar.a.c).H), r6h1Var);
        this.f = new lls0(yzc0Var);
        this.g = new idd1(new opg(this, (byte) 4));
    }

    public toj0(uwh uwhVar, lvc1 lvc1Var, iac0 iac0Var) {
        this.a = (byte) 13;
        this.b = uwhVar;
        this.c = lvc1Var;
        this.d = iac0Var;
        this.e = gio1.b(Boolean.TRUE);
        bpb1 bpb1VarB = gio1.b("");
        this.f = bpb1VarB;
        this.g = rqt0.u(z4p1.J(new x010(o4p1.l(new mt(bpb1VarB, (byte) 7)), (plu) lvc1Var.d, new amo(this, (lnm) null), (byte) 1), new b7c(this, (lnm) null, (byte) 19)));
    }

    public toj0(vpp0 vpp0Var, xde0 xde0Var, ayl aylVar, q8n q8nVar, q8n q8nVar2, mr20 mr20Var) {
        this.a = (byte) 29;
        this.b = vpp0Var;
        this.c = xde0Var;
        this.d = aylVar;
        this.e = mr20Var;
        this.f = q8nVar;
        this.g = q8nVar2;
    }

    public toj0(Context context, p7s p7sVar, ogr ogrVar, jo20 jo20Var, ufe0 ufe0Var, jo20 jo20Var2) {
        this.a = (byte) 26;
        this.b = new vnr(context);
        this.c = p7sVar;
        this.d = ogrVar;
        this.e = jo20Var;
        this.f = ufe0Var;
        this.g = jo20Var2;
    }

    public toj0(tq91 tq91Var, qq91 qq91Var) {
        this.a = (byte) 24;
        this.b = tq91Var;
        this.c = qq91Var;
        this.d = xqu.b(new ipq(this, 2, (byte) 19));
        this.e = xqu.b(new ipq(this, 1, (byte) 19));
        this.f = new ipq(this, 0, (byte) 19);
        this.g = xqu.b(new ipq(this, 3, (byte) 19));
    }

    public toj0(q59 q59Var, wpc wpcVar, Executor executor) {
        this.a = (byte) 7;
        this.b = wpcVar;
        this.c = executor;
        this.d = new SparseArray();
        this.e = q59Var;
        this.f = wpcVar;
        this.g = executor;
    }

    public toj0(byp bypVar) {
        this.a = (byte) 18;
        this.b = bypVar;
        this.c = iy81.a(new blp(this, 0, (byte) 9));
        this.d = iy81.a(new blp(this, 1, (byte) 9));
        this.e = iy81.a(new blp(this, 2, (byte) 9));
        this.f = iy81.a(new blp(this, 3, (byte) 9));
        this.g = iy81.a(new blp(this, 4, (byte) 9));
    }

    public toj0(cp31 cp31Var) {
        this.a = (byte) 14;
        this.b = cp31Var;
        this.c = new b2p(this, 0, (byte) 9);
        this.d = new b2p(this, 1, (byte) 9);
        this.e = new b2p(this, 2, (byte) 9);
        this.f = new b2p(this, 3, (byte) 9);
        this.g = new b2p(this, 4, (byte) 9);
    }

    public toj0(dwa0 dwa0Var, t8w t8wVar, q7r0 q7r0Var) {
        this.a = (byte) 17;
        this.b = dwa0Var;
        this.c = q7r0Var;
        this.d = t8wVar;
        this.e = new blp(this, 1, (byte) 0);
        this.f = xqu.b(new blp(this, 0, (byte) 0));
        this.g = iy81.a(new blp(this, 2, (byte) 0));
    }

    public toj0(f9p f9pVar) {
        this.a = (byte) 20;
        this.b = f9pVar;
        byte b = 7;
        this.c = iy81.a(new ywp(this, 0, b));
        this.d = iy81.a(new ywp(this, 1, b));
        this.e = iy81.a(new ywp(this, 2, b));
        this.f = iy81.a(new ywp(this, 3, b));
        this.g = iy81.a(new ywp(this, 4, b));
    }

    public toj0(cwo0 cwo0Var) {
        this.a = (byte) 19;
        this.b = cwo0Var;
        byte b = 21;
        this.c = xqu.b(new bsp(this, 2, b));
        this.d = xqu.b(new bsp(this, 3, b));
        this.e = iy81.a(new bsp(this, 1, b));
        this.f = iy81.a(new bsp(this, 4, b));
        this.g = xqu.b(new bsp(this, 0, b));
    }

    public toj0(wsm wsmVar, ryj ryjVar, xsm xsmVar, q7r0 q7r0Var) {
        this.a = (byte) 15;
        this.b = wsmVar;
        this.c = q7r0Var;
        byte b = 12;
        this.d = xqu.b(new d7p(this, 0, b));
        this.e = xqu.b(new d7p(this, 1, b));
        this.f = iy81.a(new d7p(this, 2, b));
        this.g = new d7p(this, 3, b);
    }

    public /* synthetic */ toj0(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
        this.f = obj5;
        this.g = obj6;
    }

    public toj0(th20 th20Var, uh20 uh20Var, q7r0 q7r0Var) {
        this.a = (byte) 16;
        this.b = th20Var;
        this.c = q7r0Var;
        this.d = xqu.b(new chp(this, 0, (byte) 4));
        this.e = iy81.a(new chp(this, 1, (byte) 4));
        this.f = iy81.a(new chp(this, 2, (byte) 4));
        this.g = iy81.a(new chp(this, 3, (byte) 4));
    }

    public toj0(yab1 yab1Var, File file, boolean z) {
        this.a = (byte) 8;
        this.b = new HashMap();
        this.c = new SparseArray();
        this.d = new SparseBooleanArray();
        this.e = new SparseBooleanArray();
        zsc zscVar = yab1Var != null ? new zsc(yab1Var) : null;
        fdc fdcVar = new fdc(new File(file, "cached_content_index.exi"));
        if (zscVar != null && !z) {
            this.f = zscVar;
            this.g = fdcVar;
        } else {
            String str = zoi1.a;
            this.f = fdcVar;
            this.g = zscVar;
        }
    }

    public toj0(daq daqVar, AccountPickerActivity accountPickerActivity) {
        this.a = (byte) 21;
        this.c = daqVar;
        this.b = accountPickerActivity;
        this.d = xqu.b(new p2p(daqVar, this, 2, (byte) 8));
        this.e = xqu.b(new p2p(daqVar, this, 1, (byte) 8));
        this.f = new p2p(daqVar, this, 0, (byte) 8);
        this.g = iy81.a(new p2p(daqVar, this, 3, (byte) 8));
    }

    public toj0(daq daqVar, ScannablesOnboardingActivity scannablesOnboardingActivity) {
        this.a = (byte) 23;
        this.c = daqVar;
        this.b = scannablesOnboardingActivity;
        byte b = 1;
        this.d = xqu.b(new obq(daqVar, this, 2, b));
        this.e = xqu.b(new obq(daqVar, this, b, b));
        this.f = new obq(daqVar, this, 0, b);
        this.g = xqu.b(new obq(daqVar, this, 3, b));
    }

    public toj0(daq daqVar, teq teqVar, dqd0 dqd0Var) {
        this.a = (byte) 22;
        this.c = daqVar;
        this.d = teqVar;
        this.b = dqd0Var;
        byte b = 2;
        this.e = xqu.b(new p2q(daqVar, teqVar, this, 1, b));
        this.f = new p2q(daqVar, teqVar, this, 2, b);
        this.g = iy81.a(new p2q(daqVar, teqVar, this, 0, b));
    }
}
