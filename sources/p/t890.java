package p;

import android.content.Context;
import android.net.Uri;
import android.os.Binder;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Size;
import android.util.SizeF;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.navigation.fragment.NavHostFragment;
import app.p000rive.runtime.kotlin.R;
import app.p000rive.semantics.SemanticState;
import com.comscore.streaming.ContentType;
import com.spotify.connect.artisanal_cast.TlsSocketProvider;
import com.spotify.mobius.Next;
import java.io.Serializable;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public abstract class t890 {
    public static final Class[] a = {Serializable.class, Parcelable.class, String.class, SparseArray.class, Binder.class, Size.class, SizeF.class};
    public static b180 b;
    public static b180 c;

    /* JADX WARN: Code duplicated, block: B:101:0x0187  */
    /* JADX WARN: Code duplicated, block: B:103:0x018e  */
    /* JADX WARN: Code duplicated, block: B:104:0x0194  */
    /* JADX WARN: Code duplicated, block: B:109:0x01b5  */
    /* JADX WARN: Code duplicated, block: B:111:0x01ee  */
    /* JADX WARN: Code duplicated, block: B:113:0x01f3  */
    /* JADX WARN: Code duplicated, block: B:116:0x020c  */
    /* JADX WARN: Code duplicated, block: B:118:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:72:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:79:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:82:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:88:0x011d  */
    /* JADX WARN: Code duplicated, block: B:90:0x0129  */
    /* JADX WARN: Code duplicated, block: B:92:0x012e  */
    /* JADX WARN: Code duplicated, block: B:93:0x0131  */
    /* JADX WARN: Code duplicated, block: B:96:0x0136  */
    /* JADX WARN: Code duplicated, block: B:97:0x0141  */
    public static final void a(j2i j2iVar, iyb iybVar, float f, float f2, hw61 hw61Var, long j, long j2, float f3, vu30 vu30Var, boolean z, xu30 xu30Var, long j3, long j4, j2i j2iVar2, b0k b0kVar, int i, int i2, int i3) {
        int i4;
        iyb iybVar2;
        float f4;
        vu30 vu30Var2;
        int i5;
        xu30 xu30Var2;
        int i6;
        boolean z2;
        float f5;
        float f6;
        long j5;
        long j6;
        boolean z3;
        long j7;
        xu30 xu30Var3;
        vu30 vu30Var3;
        long j8;
        h311 h311VarV;
        long jB;
        xu30 xu30Var4;
        long j9;
        float f7;
        xu30 xu30Var5;
        float f8;
        long j10;
        vu30 vu30Var4;
        long j11;
        long j12;
        gfh0 gfh0VarC;
        int iK;
        float f9;
        xos0 xos0VarM;
        qim0 qim0VarE;
        long j13;
        llj lljVar;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(920075480);
        if ((i & 6) == 0) {
            i4 = (x340Var.i(j2iVar) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        int i7 = i & 48;
        nim0 nim0Var = nim0.a;
        if (i7 == 0) {
            i4 |= x340Var.g(nim0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            iybVar2 = iybVar;
            i4 |= x340Var.g(iybVar2) ? SemanticState.Hidden : SemanticState.Focused;
        } else {
            iybVar2 = iybVar;
        }
        int i8 = i4 | 27648;
        if ((196608 & i) == 0) {
            i8 |= x340Var.g(hw61Var) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i8 |= 524288;
        }
        if ((12582912 & i) == 0) {
            i8 |= 4194304;
        }
        int i9 = i8 | 100663296;
        if ((805306368 & i) == 0) {
            f4 = f3;
            i9 |= x340Var.d(f4) ? 536870912 : 268435456;
        } else {
            f4 = f3;
        }
        int i10 = i3 & SemanticState.ReadOnly;
        if (i10 != 0) {
            i5 = i2 | 6;
            vu30Var2 = vu30Var;
        } else if ((i2 & 6) == 0) {
            vu30Var2 = vu30Var;
            i5 = (x340Var.i(vu30Var2) ? 4 : 2) | i2;
        } else {
            vu30Var2 = vu30Var;
            i5 = i2;
        }
        int i11 = i5 | 432;
        int i12 = i3 & SemanticState.Multiline;
        if (i12 == 0) {
            if ((i2 & 3072) == 0) {
                xu30Var2 = xu30Var;
                i11 |= x340Var.i(xu30Var2) ? SemanticState.Modal : SemanticState.ReadOnly;
            }
            if ((i3 & TlsSocketProvider.READ_BUFFER_SIZE) == 0 || !x340Var.f(j3)) {
                i6 = SemanticState.Multiline;
            } else {
                i6 = TlsSocketProvider.READ_BUFFER_SIZE;
            }
            int i13 = i11 | i6 | 65536;
            if ((306783379 & i9) == 306783378 || (599187 & i13) != 599186) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (x340Var.Y(i9 & 1, z2)) {
                x340Var.d0();
                if ((i & 1) != 0 || x340Var.E()) {
                    long jE = eah.e(x340Var, 40);
                    jB = eah.b(jE, x340Var);
                    if (i10 != 0) {
                        vu30Var2 = y9i.a;
                    }
                    if (i12 != 0) {
                        xu30Var4 = y9i.b;
                    } else {
                        xu30Var4 = xu30Var2;
                    }
                    if ((i3 & TlsSocketProvider.READ_BUFFER_SIZE) != 0) {
                        j9 = ((dah) x340Var.k(eah.a)).p;
                    } else {
                        j9 = j3;
                    }
                    long jB2 = eah.b(j9, x340Var);
                    f7 = 56.0f;
                    xu30Var5 = xu30Var4;
                    long j14 = j9;
                    z3 = true;
                    f8 = 640.0f;
                    j10 = jB2;
                    vu30Var4 = vu30Var2;
                    j11 = jE;
                    j12 = j14;
                } else {
                    x340Var.b0();
                    f8 = f2;
                    jB = j2;
                    z3 = z;
                    j12 = j3;
                    j10 = j4;
                    xu30Var5 = xu30Var2;
                    vu30Var4 = vu30Var2;
                    f7 = f;
                    j11 = j;
                }
                x340Var.s();
                qim0 qim0VarF = dug.f(u291.d(nim0Var, 1.0f), j12, d4o1.a);
                gfh0VarC = t1c.c(een.d, false);
                iK = tgp1.k(x340Var);
                f9 = f7;
                xos0VarM = x340Var.m();
                qim0VarE = zr7.E(x340Var, qim0VarF);
                hzj.A.getClass();
                j13 = j12;
                if (x340Var.a != null) {
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
                lljVar = y580.R0;
                if (x340Var.S || !u890.j(x340Var.T(), Integer.valueOf(iK))) {
                    z5c.f(iK, x340Var, iK, lljVar);
                }
                nko1.H(qim0VarE, x340Var, y580.Y);
                float f10 = f4;
                f5 = f9;
                mod.b(p3d1.o(j10, wrl.a), apo.r(999829022, new zxb(iybVar2, j2iVar2, f5, f8, z3, hw61Var, j11, jB, f10, vu30Var4, j2iVar, xu30Var5), x340Var), x340Var, 56);
                x340Var.r(true);
                j5 = j11;
                j6 = jB;
                xu30Var3 = xu30Var5;
                j7 = j10;
                j8 = j13;
                f6 = f8;
                vu30Var3 = vu30Var4;
            } else {
                x340Var.b0();
                f5 = f;
                f6 = f2;
                j5 = j;
                j6 = j2;
                z3 = z;
                j7 = j4;
                xu30Var3 = xu30Var2;
                vu30Var3 = vu30Var2;
                j8 = j3;
            }
            h311VarV = x340Var.v();
            if (h311VarV != null) {
                h311VarV.d = new qxb(j2iVar, iybVar, f5, f6, hw61Var, j5, j6, f3, vu30Var3, z3, xu30Var3, j8, j7, j2iVar2, i, i2, i3);
            }
        }
        i11 = i5 | 3504;
        xu30Var2 = xu30Var;
        if ((i3 & TlsSocketProvider.READ_BUFFER_SIZE) == 0) {
            i6 = SemanticState.Multiline;
        } else {
            i6 = SemanticState.Multiline;
        }
        int i14 = i11 | i6 | 65536;
        if ((306783379 & i9) == 306783378) {
            z2 = true;
        } else {
            z2 = true;
        }
        if (x340Var.Y(i9 & 1, z2)) {
            x340Var.d0();
            if ((i & 1) != 0) {
                long jE2 = eah.e(x340Var, 40);
                jB = eah.b(jE2, x340Var);
                if (i10 != 0) {
                    vu30Var2 = y9i.a;
                }
                if (i12 != 0) {
                    xu30Var4 = y9i.b;
                } else {
                    xu30Var4 = xu30Var2;
                }
                if ((i3 & TlsSocketProvider.READ_BUFFER_SIZE) != 0) {
                    j9 = ((dah) x340Var.k(eah.a)).p;
                } else {
                    j9 = j3;
                }
                long jB3 = eah.b(j9, x340Var);
                f7 = 56.0f;
                xu30Var5 = xu30Var4;
                long j15 = j9;
                z3 = true;
                f8 = 640.0f;
                j10 = jB3;
                vu30Var4 = vu30Var2;
                j11 = jE2;
                j12 = j15;
            } else {
                long jE3 = eah.e(x340Var, 40);
                jB = eah.b(jE3, x340Var);
                if (i10 != 0) {
                    vu30Var2 = y9i.a;
                }
                if (i12 != 0) {
                    xu30Var4 = y9i.b;
                } else {
                    xu30Var4 = xu30Var2;
                }
                if ((i3 & TlsSocketProvider.READ_BUFFER_SIZE) != 0) {
                    j9 = ((dah) x340Var.k(eah.a)).p;
                } else {
                    j9 = j3;
                }
                long jB4 = eah.b(j9, x340Var);
                f7 = 56.0f;
                xu30Var5 = xu30Var4;
                long j16 = j9;
                z3 = true;
                f8 = 640.0f;
                j10 = jB4;
                vu30Var4 = vu30Var2;
                j11 = jE3;
                j12 = j16;
            }
            x340Var.s();
            qim0 qim0VarF2 = dug.f(u291.d(nim0Var, 1.0f), j12, d4o1.a);
            gfh0VarC = t1c.c(een.d, false);
            iK = tgp1.k(x340Var);
            f9 = f7;
            xos0VarM = x340Var.m();
            qim0VarE = zr7.E(x340Var, qim0VarF2);
            hzj.A.getClass();
            j13 = j12;
            if (x340Var.a != null) {
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
            lljVar = y580.R0;
            if (x340Var.S) {
                z5c.f(iK, x340Var, iK, lljVar);
            } else {
                z5c.f(iK, x340Var, iK, lljVar);
            }
            nko1.H(qim0VarE, x340Var, y580.Y);
            float f11 = f4;
            f5 = f9;
            mod.b(p3d1.o(j10, wrl.a), apo.r(999829022, new zxb(iybVar2, j2iVar2, f5, f8, z3, hw61Var, j11, jB, f11, vu30Var4, j2iVar, xu30Var5), x340Var), x340Var, 56);
            x340Var.r(true);
            j5 = j11;
            j6 = jB;
            xu30Var3 = xu30Var5;
            j7 = j10;
            j8 = j13;
            f6 = f8;
            vu30Var3 = vu30Var4;
        } else {
            x340Var.b0();
            f5 = f;
            f6 = f2;
            j5 = j;
            j6 = j2;
            z3 = z;
            j7 = j4;
            xu30Var3 = xu30Var2;
            vu30Var3 = vu30Var2;
            j8 = j3;
        }
        h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new qxb(j2iVar, iybVar, f5, f6, hw61Var, j5, j6, f3, vu30Var3, z3, xu30Var3, j8, j7, j2iVar2, i, i2, i3);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void b(j2i j2iVar, j2i j2iVar2, j2i j2iVar3, Function0 function0, vy71 vy71Var, b0k b0kVar, int i) {
        Object obj = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1217723575);
        int i2 = i | (x340Var.i((Object) null) ? 4 : 2) | (x340Var.i(function0) ? 16384 : SemanticState.Multiline) | (x340Var.g(vy71Var) ? 131072 : 65536);
        if (x340Var.Y(i2 & 1, (74899 & i2) != 74898)) {
            List listM = p7h.M(new vu30[]{y9i.c, j2iVar, j2iVar2, j2iVar3});
            boolean z = ((i2 & 57344) == 16384) | ((458752 & i2) == 131072);
            Object objT = x340Var.T();
            if (z || objT == obj) {
                objT = new byb(vy71Var, function0);
                x340Var.s0(objT);
            }
            lqm0 lqm0Var = (lqm0) objT;
            j2i j2iVarQ = who1.q(listM);
            boolean zG = x340Var.g(lqm0Var);
            Object objT2 = x340Var.T();
            if (zG || objT2 == obj) {
                objT2 = new mqm0(lqm0Var);
                x340Var.s0(objT2);
            }
            gfh0 gfh0Var = (gfh0) objT2;
            int iK = tgp1.k(x340Var);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, nim0.a);
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
            nko1.H(gfh0Var, x340Var, y580.O0);
            nko1.H(xos0VarM, x340Var, y580.N0);
            llj lljVar = y580.R0;
            if (x340Var.S || !u890.j(x340Var.T(), Integer.valueOf(iK))) {
                z5c.f(iK, x340Var, iK, lljVar);
            }
            nko1.H(qim0VarE, x340Var, y580.Y);
            dv20.l(0, j2iVarQ, x340Var, true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new uxb(j2iVar, j2iVar2, j2iVar3, function0, vy71Var, i);
        }
    }

    public static final void c(int i, max maxVar, Function0 function0, b0k b0kVar, int i2, int i3) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1963583134);
        int i4 = (x340Var.e(i) ? 4 : 2) | i2 | (((i3 & 2) == 0 && x340Var.i(maxVar)) ? 32 : 16);
        if ((i2 & 384) == 0) {
            i4 |= x340Var.i(function0) ? SemanticState.Hidden : SemanticState.Focused;
        }
        if (x340Var.Y(i4 & 1, (i4 & 147) != 146)) {
            x340Var.d0();
            if ((i2 & 1) != 0 && !x340Var.E()) {
                x340Var.b0();
                int i5 = i3 & 2;
            } else if ((i3 & 2) != 0) {
                maxVar = jax.a;
            }
            x340Var.s();
            gfx.b(13, apo.r(1644765335, new tbs0(cwl1.o0(x340Var, i), function0, maxVar, (byte) 28), x340Var), x340Var, 54);
        } else {
            x340Var.b0();
        }
        max maxVar2 = maxVar;
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new gnw0(i, maxVar2, function0, i2, i3);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final sku d(ha4 ha4Var, qe41 qe41Var) {
        View view = (View) ha4Var.getParent();
        Object tag = view.getTag(R.id.compose_view_saveable_id_tag);
        LinkedHashMap linkedHashMap = null;
        String strValueOf = tag instanceof String ? (String) tag : null;
        if (strValueOf == null) {
            strValueOf = String.valueOf(view.getId());
        }
        String strM = l1d.m("SaveableStateRegistry:", strValueOf);
        oe41 oe41VarP = qe41Var.p();
        Bundle bundleA = oe41VarP.a(strM);
        if (bundleA != null) {
            linkedHashMap = new LinkedHashMap();
            for (String str : bundleA.keySet()) {
                linkedHashMap.put(str, bundleA.getParcelableArrayList(str));
            }
        }
        u1c u1cVar = new u1c((byte) 18);
        kiv kivVar = pd41.a;
        final od41 od41Var = new od41(linkedHashMap, u1cVar);
        boolean z = false;
        z = false;
        if (oe41VarP.b(strM) == null) {
            try {
                final byte b2 = z ? (byte) 1 : (byte) 0;
                oe41VarP.c(strM, new ne41() { // from class: p.tku
                    public final Bundle a() {
                        mmr0[] mmr0VarArr;
                        byte b3 = b2;
                        Object obj = od41Var;
                        switch (b3) {
                            case 0:
                                Map mapE = ((od41) obj).e();
                                Bundle bundle = new Bundle();
                                for (Map.Entry entry : mapE.entrySet()) {
                                    String str2 = (String) entry.getKey();
                                    List list = (List) entry.getValue();
                                    bundle.putParcelableArrayList(str2, list instanceof ArrayList ? (ArrayList) list : new ArrayList<>(list));
                                }
                                return bundle;
                            case 1:
                                dg30 dg30Var = (dg30) obj;
                                while (dg30.f0(dg30Var.e0())) {
                                }
                                dg30Var.V0.g(k8c0.ON_STOP);
                                return new Bundle();
                            case 2:
                                Bundle bundleA2 = ((gon0) obj).A();
                                return bundleA2 == null ? Bundle.EMPTY : bundleA2;
                            case 3:
                                int i = ((NavHostFragment) obj).H1;
                                return i != 0 ? mno1.h(new mmr0[]{new mmr0("android-support-nav:fragment:graphId", Integer.valueOf(i))}) : Bundle.EMPTY;
                            case 4:
                                vi11 vi11Var = (vi11) obj;
                                for (Map.Entry entry2 : sqg0.U((LinkedHashMap) vi11Var.e).entrySet()) {
                                    vi11Var.S(((wen0) entry2.getValue()).getValue(), (String) entry2.getKey());
                                }
                                for (Map.Entry entry3 : sqg0.U((LinkedHashMap) vi11Var.c).entrySet()) {
                                    vi11Var.S(((ne41) entry3.getValue()).a(), (String) entry3.getKey());
                                }
                                LinkedHashMap linkedHashMap2 = (LinkedHashMap) vi11Var.b;
                                if (linkedHashMap2.isEmpty()) {
                                    mmr0VarArr = new mmr0[0];
                                } else {
                                    ArrayList arrayList = new ArrayList(linkedHashMap2.size());
                                    for (Map.Entry entry4 : linkedHashMap2.entrySet()) {
                                        arrayList.add(new mmr0((String) entry4.getKey(), entry4.getValue()));
                                    }
                                    mmr0VarArr = (mmr0[]) arrayList.toArray(new mmr0[0]);
                                }
                                return mno1.h((mmr0[]) Arrays.copyOf(mmr0VarArr, mmr0VarArr.length));
                            default:
                                e821 e821Var = (e821) obj;
                                nma0 nma0Var = (nma0) e821Var.a;
                                Object obj2 = e821Var.e;
                                if (obj2 == null) {
                                    u890.C("value");
                                    throw null;
                                }
                                ae41 ae41Var = (ae41) e821Var.c;
                                Bundle bundleH = mno1.h((mmr0[]) Arrays.copyOf(new mmr0[0], 0));
                                new de41(bundleH, ae41Var).i(nma0Var, obj2);
                                return bundleH;
                        }
                    }
                });
                z = true;
            } catch (IllegalArgumentException unused) {
            }
        }
        return new sku(od41Var, new uku(z, oe41VarP, strM));
    }

    public static final void e(qim0 qim0Var, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1691603561);
        int i2 = i | 6;
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            qim0 qim0Var2 = nim0.a;
            qim0 qim0VarF = u291.f(qim0Var2, 1.0f);
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            op71.g(x340Var, dug.f(u291.h(uyn1.x(qim0VarF, 16.0f), 0.5f), u7h.b(cbx.a(x340Var).d.a, 0.3f, 0.0f, 0.0f, 0.0f, 14), d4o1.a));
            qim0Var = qim0Var2;
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new wdk(qim0Var, i, (byte) 13);
        }
    }

    public static final void f(int i, b0k b0kVar, qim0 qim0Var, boolean z) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1883296389);
        int i2 = (x340Var.h(z) ? 4 : 2) | i | (x340Var.g(qim0Var) ? 32 : 16);
        if (!x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            x340Var.b0();
        } else if (z) {
            x340Var.i0(125037958);
            uwr uwrVar = cbx.a;
            zov0 zov0Var = cbx.b(x340Var).g;
            xto1.e(u291.r(qim0Var, 12.0f), 1, cbx.a(x340Var).b.b, 0L, x340Var, 48, 8);
            x340Var.r(false);
        } else {
            x340Var.i0(125217789);
            x340Var.r(false);
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new uc0(z, qim0Var, i, (byte) 14);
        }
    }

    public static final void g(final vy71 vy71Var, float f, float f2, boolean z, hw61 hw61Var, long j, long j2, float f3, vu30 vu30Var, j2i j2iVar, b0k b0kVar, int i) {
        b0k b0kVar2;
        boolean z2;
        qim0 qim0VarL;
        Object obj = fkj0.X;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(-2108849428);
        int i2 = i | (b0kVar3.g(vy71Var) ? 4 : 2) | (b0kVar3.d(f) ? 32 : 16) | (b0kVar3.d(f2) ? SemanticState.Hidden : SemanticState.Focused) | (b0kVar3.h(z) ? SemanticState.Modal : SemanticState.ReadOnly) | (b0kVar3.g(hw61Var) ? TlsSocketProvider.READ_BUFFER_SIZE : SemanticState.Multiline) | (b0kVar3.f(j) ? 131072 : 65536) | (b0kVar3.f(j2) ? 1048576 : 524288) | (b0kVar3.d(0.0f) ? 8388608 : 4194304) | (b0kVar3.d(f3) ? 67108864 : 33554432) | (b0kVar3.i(vu30Var) ? 536870912 : 268435456);
        if (b0kVar3.Y(i2 & 1, ((i2 & 306783379) == 306783378 && ((b0kVar3.i(j2iVar) ? (char) 4 : (char) 2) & 3) == 2) ? false : true)) {
            n8b1 n8b1VarW = w(b0kVar3, 1);
            n8b1 n8b1VarW2 = w(b0kVar3, 1);
            n8b1 n8b1VarW3 = w(b0kVar3, 5);
            int i3 = i2 & 14;
            boolean zI = (i3 == 4) | b0kVar3.i(n8b1VarW2) | b0kVar3.i(n8b1VarW3) | b0kVar3.i(n8b1VarW);
            Object objT = b0kVar3.T();
            if (zI || objT == obj) {
                z2 = false;
                rxb rxbVar = new rxb(vy71Var, n8b1VarW2, n8b1VarW3, n8b1VarW, (byte) 0);
                b0kVar3.s0(rxbVar);
                objT = rxbVar;
            } else {
                z2 = false;
            }
            qxd0.S((Function0) objT, b0kVar3);
            Object objT2 = b0kVar3.T();
            if (objT2 == obj) {
                objT2 = qxd0.M(o6x.a, b0kVar3);
                b0kVar3.s0(objT2);
            }
            c9n c9nVar = (c9n) objT2;
            final float fX0 = ((wat) b0kVar3.k(t4k.h)).X0(f);
            qim0 qim0Var = nim0.a;
            if (z) {
                b0kVar3.i0(2049456610);
                boolean zG = b0kVar3.g(vy71Var.e);
                Object objT3 = b0kVar3.T();
                if (zG || objT3 == obj) {
                    b6 b6Var = new b6(c9nVar, vy71Var, (byte) 13);
                    pxg1 pxg1Var = ly71.a;
                    objT3 = new ky71(vy71Var, b6Var);
                    b0kVar3.s0(objT3);
                }
                qim0VarL = bmq0.L(qim0Var, (d6o0) objT3, (g6o0) null);
                b0kVar3.r(false);
            } else {
                b0kVar3.i0(2049851798);
                b0kVar3.r(z2);
                qim0VarL = qim0Var;
            }
            qim0 qim0VarThen = u291.l(u291.f(u291.x(0.0f, f2, 1, qim0Var), 1.0f), f).then(qim0VarL);
            s24 s24Var = vy71Var.e;
            boolean zD = (i3 == 4) | b0kVar3.d(fX0);
            Object objT4 = b0kVar3.T();
            if (zD || objT4 == obj) {
                objT4 = new vu30() { // from class: p.sxb
                    /* JADX WARN: Code duplicated, block: B:10:0x0048  */
                    /* JADX WARN: Code duplicated, block: B:13:0x0050  */
                    /* JADX WARN: Code duplicated, block: B:16:0x0058  */
                    public final Object invoke(Object obj2, Object obj3) {
                        final float fH = hjl.h(((hjl) obj3).a);
                        final float f4 = (int) (((yr80) obj2).a & 4294967295L);
                        final vy71 vy71Var2 = vy71Var;
                        final float f5 = fX0;
                        zmg0 zmg0VarC = lm5.c(new iu30() { // from class: p.wxb
                            public final Object invoke(Object obj4) {
                                y5v y5vVar = (y5v) obj4;
                                vy71 vy71Var3 = vy71Var2;
                                boolean z3 = vy71Var3.a;
                                float f6 = fH;
                                float f7 = f5;
                                if (!z3) {
                                    y5vVar.a(f6 - f7, xy71.c);
                                }
                                float f8 = f4;
                                if (f8 != f7) {
                                    y5vVar.a(Math.max(f6 - f8, 0.0f), xy71.b);
                                }
                                if (!vy71Var3.c) {
                                    y5vVar.a(f6, xy71.a);
                                }
                                return rih1.a;
                            }
                        });
                        Map map = zmg0VarC.a;
                        xy71 xy71Var = (xy71) ((mdt) vy71Var2.e.X).getValue();
                        int iOrdinal = xy71Var.ordinal();
                        xy71 xy71Var2 = xy71.a;
                        if (iOrdinal != 0) {
                            xy71 xy71Var3 = xy71.c;
                            xy71 xy71Var4 = xy71.b;
                            if (iOrdinal != 1) {
                                if (iOrdinal != 2) {
                                    eg.o();
                                    return null;
                                }
                                if (map.containsKey(xy71Var3)) {
                                    xy71Var = xy71Var3;
                                } else if (map.containsKey(xy71Var4)) {
                                    xy71Var = xy71Var4;
                                } else if (map.containsKey(xy71Var2)) {
                                    xy71Var = xy71Var2;
                                }
                            } else if (map.containsKey(xy71Var4)) {
                                xy71Var = xy71Var4;
                            } else if (map.containsKey(xy71Var3)) {
                                xy71Var = xy71Var3;
                            } else if (map.containsKey(xy71Var2)) {
                                xy71Var = xy71Var2;
                            }
                        } else if (map.containsKey(xy71Var2)) {
                            xy71Var = xy71Var2;
                        }
                        return new mmr0(zmg0VarC, xy71Var);
                    }
                };
                b0kVar3.s0(objT4);
            }
            qim0 qim0VarH = lm5.h(qim0VarThen, s24Var, (vu30) objT4);
            s24 s24Var2 = vy71Var.e;
            b0kVar2 = b0kVar3;
            int i4 = i2 >> 9;
            w3d1.a(x(k6v.b(qim0VarH, (q24) s24Var2.g, qqq0.a, z, null, s24Var2.L(), null, new i14(s24Var2, (lnm) null), false, 32), vy71Var), hw61Var, j, j2, 0.0f, f3, null, apo.r(1508311921, new gyb(vy71Var, vu30Var, j2iVar, c9nVar, z), b0kVar2), b0kVar2, (i4 & 458752) | (i4 & ContentType.LONG_FORM_ON_DEMAND) | 12582912 | (i4 & 896) | (i4 & 7168) | (57344 & i4), 64);
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new txb(vy71Var, f, f2, z, hw61Var, j, j2, f3, vu30Var, j2iVar, i);
        }
    }

    public static boolean h(Collection collection, Iterator it) {
        collection.getClass();
        it.getClass();
        boolean zAdd = false;
        while (it.hasNext()) {
            zAdd |= collection.add(it.next());
        }
        return zAdd;
    }

    public static final u7h i(xkk1 xkk1Var) {
        pp70 pp70Var;
        mq70 mq70Var = xkk1Var.a;
        if (mq70Var == null || (pp70Var = mq70Var.b) == null) {
            return null;
        }
        return new u7h(pp70Var.c.a.b.a());
    }

    public static final boolean j(Object obj) {
        if (obj instanceof uv91) {
            uv91 uv91Var = (uv91) obj;
            if (uv91Var.g() == f331.X0 || uv91Var.g() == kcx0.R0 || uv91Var.g() == c4x0.f) {
                Object value = uv91Var.getValue();
                if (value == null) {
                    return true;
                }
                return j(value);
            }
        } else if (!(obj instanceof cv30) || !(obj instanceof Serializable)) {
            for (int i = 0; i < 7; i++) {
                if (a[i].isInstance(obj)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean k(bgg1 bgg1Var, Object obj) {
        Iterator it = bgg1Var.b;
        if (obj == null) {
            while (it.hasNext()) {
                if (bgg1Var.next() == null) {
                    return true;
                }
            }
            return false;
        }
        while (it.hasNext()) {
            if (obj.equals(bgg1Var.next())) {
                return true;
            }
        }
        return false;
    }

    public static final void l(String str, t45 t45Var) {
        t45Var.g(str);
        (!ihc1.h0("profile", "release", false) ? xco0.a : e95.a).f(str, "cwp");
    }

    public static final n8b1 m(jnm0 jnm0Var, int i) {
        int iC = l1d.C(i);
        if (iC == 0) {
            jnm0Var.getClass();
            return jnm0.b;
        }
        if (iC == 1) {
            jnm0Var.getClass();
            return jnm0.c;
        }
        if (iC == 2) {
            jnm0Var.getClass();
            return jnm0.d;
        }
        if (iC == 3) {
            jnm0Var.getClass();
            return jnm0.e;
        }
        if (iC == 4) {
            jnm0Var.getClass();
            return jnm0.f;
        }
        if (iC == 5) {
            jnm0Var.getClass();
            return jnm0.g;
        }
        eg.o();
        return null;
    }

    public static final Long n(zoy0 zoy0Var, yqg yqgVar) {
        ytw0 ytw0Var = jfv.b;
        long j = zoy0Var.c;
        ngv ngvVar = ngv.e;
        if (jfv.c(fdg1.l0(j, ngvVar), fdg1.l0(yqgVar.b(), ngv.d)) > 0) {
            return Long.valueOf(jfv.h(fdg1.l0(j, ngvVar)));
        }
        return null;
    }

    public static Object o(Iterator it) {
        Object next = it.next();
        if (!it.hasNext()) {
            return next;
        }
        StringBuilder sb = new StringBuilder("expected one element but was: <");
        sb.append(next);
        for (int i = 0; i < 4 && it.hasNext(); i++) {
            sb.append(", ");
            sb.append(it.next());
        }
        if (it.hasNext()) {
            sb.append(", ...");
        }
        sb.append('>');
        throw new IllegalArgumentException(sb.toString());
    }

    public static final Long p(zoy0 zoy0Var, yqg yqgVar) {
        Long lN = n(zoy0Var, yqgVar);
        if (lN != null) {
            return Long.valueOf(lN.longValue());
        }
        xoy0 xoy0Var = (yoy0) zoy0Var.b.b;
        if (!(xoy0Var instanceof xoy0)) {
            return null;
        }
        Calendar calendarD = yqgVar.d();
        xoy0 xoy0Var2 = xoy0Var;
        calendarD.set(xoy0Var2.a, xoy0Var2.b - 1, xoy0Var2.c);
        return Long.valueOf(calendarD.getTimeInMillis());
    }

    public static String q(URL url) {
        Uri uri = Uri.parse(url.toExternalForm());
        List<String> pathSegments = uri.getPathSegments();
        return f4i1.e(uri.getHost(), pathSegments.isEmpty() ? "" : pathSegments.get(0));
    }

    public static s7s0 r(Context context, ViewGroup viewGroup, int i) {
        s7s0 s7s0Var = new s7s0(context, null, 0);
        View viewInflate = LayoutInflater.from(context).inflate(i, viewGroup, false);
        viewInflate.setDuplicateParentStateEnabled(true);
        viewInflate.setId(2131430720);
        ViewGroup.LayoutParams layoutParams = viewInflate.getLayoutParams();
        if (layoutParams != null) {
            s7s0Var.setLayoutParams(layoutParams);
            viewInflate.setLayoutParams(new FrameLayout.LayoutParams(layoutParams));
        }
        s7s0Var.addView(viewInflate);
        return s7s0Var;
    }

    public static final iyb s(vy71 vy71Var, bs91 bs91Var, b0k b0kVar, int i, int i2) {
        b0k b0kVar2;
        Object obj = fkj0.X;
        if ((i2 & 1) != 0) {
            x340 x340Var = (x340) b0kVar;
            Object objT = x340Var.T();
            if (objT == obj) {
                objT = new z9((byte) 28);
                x340Var.s0(objT);
            }
            b0kVar2 = b0kVar;
            vy71Var = ly71.c(false, (iu30) objT, xy71.c, b0kVar2, 0, 49);
        } else {
            b0kVar2 = b0kVar;
        }
        if ((i2 & 2) != 0) {
            x340 x340Var2 = (x340) b0kVar2;
            Object objT2 = x340Var2.T();
            if (objT2 == obj) {
                objT2 = new bs91();
                x340Var2.s0(objT2);
            }
            bs91Var = (bs91) objT2;
        }
        boolean zG = ((x340) b0kVar2).g(vy71Var) | ((((i & ContentType.LONG_FORM_ON_DEMAND) ^ 48) > 32 && ((x340) b0kVar2).g(bs91Var)) || (i & 48) == 32);
        x340 x340Var3 = (x340) b0kVar2;
        Object objT3 = x340Var3.T();
        if (zG || objT3 == obj) {
            objT3 = new iyb(vy71Var, bs91Var);
            x340Var3.s0(objT3);
        }
        return (iyb) objT3;
    }

    public static fo90 t(Object obj) {
        return new fo90(obj);
    }

    public static final void u(String str, t45 t45Var) {
        t45.m(t45Var, str, 4);
        tif1.a(!ihc1.h0("profile", "release", false) ? xco0.a : e95.a, str, "cwp", 4);
    }

    public static Next v(kak0 kak0Var, b4k0 b4k0Var) {
        odm0 odm0Var = kak0Var.e;
        Object obj = null;
        odm0 odm0Var2 = odm0Var instanceof odm0 ? odm0Var : null;
        if (odm0Var2 == null) {
            return Next.j();
        }
        List list = odm0Var2.c;
        sr10 sr10Var = (sr10) o7h.t0(b4k0Var.a, list);
        if (sr10Var == null) {
            return Next.j();
        }
        String str = sr10Var.b;
        f1k0 f1k0Var = new f1k0(odm0Var2.a, list, odm0Var2.b, str);
        lhg1 lhg1Var = sr10Var.c;
        for (Object obj2 : kak0Var.Y) {
            if (((sr10) obj2).d) {
                obj = obj2;
                break;
            }
        }
        sr10 sr10Var2 = (sr10) obj;
        boolean zEquals = str.equals((!kak0Var.O0 || sr10Var2 == null) ? "core" : sr10Var2.b);
        ndm0 ndm0Var = ndm0.a;
        return x1p1.t(x1p1.C(Next.i(zEquals ? kak0.a(kak0Var, ndm0Var, (Boolean) null, (ycu0) null, lhg1Var, (lhg1) null, (lhg1) null, str.equals("core") ? xx8.a : xx8.b, (List) null, (List) null, (Float) null, (lhg1) null, (lhg1) null, lhg1Var, (String) null, (String) null, (lhg1) null, j8w0.a, false, 0, 0, 0, (giq0) null, (uia) null, (uia) null, (Float) null, (Float) null, (Float) null, (Float) null, false, false, (String) null, false, (lhg1) null, (Boolean) null, (Integer) null, (lyj0) null, 0L, (Integer) null, (Integer) null, -4457617, 1048575) : kak0.a(kak0Var, ndm0Var, (Boolean) null, (ycu0) null, (lhg1) null, (lhg1) null, (lhg1) null, (xx8) null, (List) null, (List) null, (Float) null, (lhg1) null, lhg1Var, lhg1Var, (String) null, (String) null, (lhg1) null, k8w0.a, false, 0, 0, 0, (giq0) null, (uia) null, (uia) null, (Float) null, (Float) null, (Float) null, (Float) null, false, false, (String) null, false, (lhg1) null, (Boolean) null, (Integer) null, (lyj0) null, 0L, (Integer) null, (Integer) null, -4587537, 1048575), Collections.singleton(f1k0Var))), 3);
    }

    public static final n8b1 w(b0k b0kVar, int i) {
        return m((jnm0) ((x340) b0kVar).k(ich0.a), i);
    }

    public static final qim0 x(qim0 qim0Var, vy71 vy71Var) {
        return i541.C(qim0Var, new vxb(vy71Var, (byte) 1));
    }
}
