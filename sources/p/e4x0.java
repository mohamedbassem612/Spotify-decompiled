package p;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.os.Bundle;
import com.spotify.base.java.logging.Logger;
import com.spotify.mobius.Effects;
import com.spotify.mobius.First;
import com.spotify.mobius.Init;
import com.spotify.mobius.Next;
import com.spotify.player.model.ContextTrack;
import com.spotify.puffin_esperanto.proto.PuffinErrorOuterClass;
import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.functions.Function4;
import io.reactivex.rxjava3.functions.Predicate;
import io.reactivex.rxjava3.internal.operators.completable.CompletableEmpty;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final /* synthetic */ class e4x0 implements Function, m1h1, Predicate, g4u, s2i1, Function4, av30, Init {
    public final /* synthetic */ byte a;
    public static final e4x0 b = new e4x0(0);
    public static final e4x0 c = new e4x0(1);
    public static final e4x0 d = new e4x0(2);
    public static final e4x0 e = new e4x0(3);
    public static final e4x0 f = new e4x0(4);
    public static final e4x0 g = new e4x0(5);
    public static final e4x0 h = new e4x0(6);
    public static final e4x0 i = new e4x0(7);
    public static final e4x0 t = new e4x0(8);
    public static final e4x0 X = new e4x0(10);
    public static final e4x0 Y = new e4x0(11);
    public static final e4x0 Z = new e4x0(12);
    public static final e4x0 N0 = new e4x0(13);
    public static final e4x0 O0 = new e4x0(14);
    public static final e4x0 P0 = new e4x0(15);
    public static final e4x0 Q0 = new e4x0(16);
    public static final e4x0 R0 = new e4x0(17);
    public static final e4x0 S0 = new e4x0(18);
    public static final e4x0 T0 = new e4x0(19);
    public static final e4x0 U0 = new e4x0(20);
    public static final e4x0 V0 = new e4x0(22);
    public static final e4x0 W0 = new e4x0(23);
    public static final e4x0 X0 = new e4x0(24);
    public static final e4x0 Y0 = new e4x0(25);
    public static final e4x0 Z0 = new e4x0(26);

    public /* synthetic */ e4x0(byte b2) {
        this.a = b2;
    }

    public static final md50 r0(xd xdVar, ge geVar) {
        Bundle bundleG = cy30.g("fields", "permission,status");
        String str = md50.j;
        md50 md50VarQ = cwl1.Q(xdVar, "me/permissions", geVar);
        md50VarQ.d = bundleG;
        md50VarQ.h = a370.a;
        return md50VarQ;
    }

    public static final boolean s0(Context context, String str) {
        PackageInfo packageInfo;
        PackageInfo packageInfo2;
        try {
            packageInfo = context.getPackageManager().getPackageInfo("android", 64);
        } catch (PackageManager.NameNotFoundException unused) {
            Logger.d("MBS: Package %s is not found", new Object[]{"android"});
            packageInfo = null;
        }
        if ((packageInfo != null ? packageInfo.signatures : null) != null) {
            Signature[] signatureArr = packageInfo.signatures;
            signatureArr.getClass();
            if (signatureArr.length != 0) {
                try {
                    packageInfo2 = context.getPackageManager().getPackageInfo(str, 64);
                } catch (PackageManager.NameNotFoundException unused2) {
                    Logger.d("MBS: Package %s is not found", new Object[]{str});
                    packageInfo2 = null;
                }
                if ((packageInfo2 != null ? packageInfo2.signatures : null) != null) {
                    Signature[] signatureArr2 = packageInfo2.signatures;
                    signatureArr2.getClass();
                    if (signatureArr2.length != 0) {
                        Signature[] signatureArr3 = packageInfo2.signatures;
                        signatureArr3.getClass();
                        int length = signatureArr3.length;
                        Signature[] signatureArr4 = packageInfo.signatures;
                        signatureArr4.getClass();
                        if (length == signatureArr4.length) {
                            Signature[] signatureArr5 = packageInfo2.signatures;
                            signatureArr5.getClass();
                            int length2 = signatureArr5.length;
                            for (int i2 = 0; i2 < length2; i2++) {
                                Signature[] signatureArr6 = packageInfo.signatures;
                                signatureArr6.getClass();
                                Signature signature = signatureArr6[i2];
                                Signature[] signatureArr7 = packageInfo2.signatures;
                                signatureArr7.getClass();
                                if (u890.j(signature, signatureArr7[i2])) {
                                }
                            }
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public static jd61 v0() {
        return (jd61) wi20.c().b(jd61.class);
    }

    public static Next w0(fdj1 fdj1Var, String str) {
        return Next.a(Effects.a(new mjb0[]{new mjb0(str, fdj1Var.a)}));
    }

    public static final md50 x(xd xdVar, he heVar) {
        String str = xdVar.X;
        if (str == null) {
            str = "facebook";
        }
        i5x0 i5x0Var = str.equals("instagram") ? new i5x0((byte) 27) : new f4x0((byte) 27);
        Bundle bundle = new Bundle();
        bundle.putString("grant_type", i5x0Var.b());
        bundle.putString("client_id", xdVar.h);
        bundle.putString("fields", "access_token,expires_at,expires_in,data_access_expiration_time,graph_domain");
        String str2 = md50.j;
        md50 md50VarQ = cwl1.Q(xdVar, i5x0Var.d(), heVar);
        md50VarQ.d = bundle;
        md50VarQ.h = a370.a;
        return md50VarQ;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: p.i9n */
    public static void x0(Object obj) throws i9n {
        throw new i9n(cy30.m("This method should not be called on ", obj, " with a new kotlin-reflect implementation. Please file an issue at https://kotl.in/issue"));
    }

    public int A(wod wodVar) {
        return 1;
    }

    public int B(c0h1 c0h1Var) {
        if (c0h1Var instanceof qh31) {
            return f0((e8b0) c0h1Var);
        }
        if (c0h1Var instanceof x26) {
            return ((x26) c0h1Var).size();
        }
        StringBuilder sb = new StringBuilder("unknown type argument list type: ");
        sb.append(c0h1Var);
        nkx0.r(rc11.a.b(c0h1Var.getClass()), sb);
        return 0;
    }

    public boolean D(i0h1 i0h1Var) {
        return i0h1Var instanceof tka0;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: p.i9n */
    public e8b0 E(e8b0 e8b0Var) throws i9n {
        x0(e8b0Var);
        throw null;
    }

    public boolean F(e8b0 e8b0Var) {
        return !u890.j(q(X(e8b0Var)), q(O(e8b0Var)));
    }

    public i0h1 G(e8b0 e8b0Var) {
        qh31 qh31VarJ0 = j0(e8b0Var);
        if (qh31VarJ0 == null) {
            qh31VarJ0 = X(e8b0Var);
        }
        return q(qh31VarJ0);
    }

    public c0h1 H(qh31 qh31Var) {
        return (c0h1) qh31Var;
    }

    public boolean I(e8b0 e8b0Var) {
        qh31 qh31VarJ0 = j0(e8b0Var);
        return (qh31VarJ0 != null ? t0(qh31VarJ0) : null) != null;
    }

    public boolean J(d0h1 d0h1Var) {
        tma0 tma0Var = ((uma0) d0h1Var).a;
        tma0 tma0Var2 = tma0.c;
        return u890.j(tma0Var, tma0.c);
    }

    public boolean K(qh31 qh31Var) {
        return t0(qh31Var) != null;
    }

    public gq20 L(e8b0 e8b0Var) {
        if (!(e8b0Var instanceof b7) || ((b7) e8b0Var).y() == null) {
            return null;
        }
        return (gq20) e8b0Var;
    }

    public vod M(wod wodVar) {
        return ((kod) wodVar).c;
    }

    public Object N(Object obj, Object obj2, Object obj3, Object obj4) {
        return new rpf1((ContextTrack) obj, (l4m) obj2, ((Boolean) obj3).booleanValue(), (c2l) obj4);
    }

    public qh31 O(e8b0 e8b0Var) {
        gq20 gq20VarL = L(e8b0Var);
        if (gq20VarL != null) {
            return ((b7) gq20VarL).B();
        }
        qh31 qh31VarJ0 = j0(e8b0Var);
        qh31VarJ0.getClass();
        return qh31VarJ0;
    }

    public boolean P(e8b0 e8b0Var) {
        return ((oma0) X(e8b0Var)).i() != ((oma0) O(e8b0Var)).i();
    }

    public boolean Q(wod wodVar) {
        return false;
    }

    public int R(i0h1 i0h1Var) {
        if (i0h1Var instanceof tka0) {
            return mod.f((tka0) i0h1Var).size();
        }
        return 0;
    }

    public wod S(sx81 sx81Var) {
        if (sx81Var instanceof wod) {
            return (wod) sx81Var;
        }
        return null;
    }

    public qh31 U(qh31 qh31Var, boolean z) {
        return ((b7) qh31Var).A(z);
    }

    public int V(d0h1 d0h1Var) {
        int i2 = ((uma0) d0h1Var).a.a;
        if (i2 == 0) {
            return 2;
        }
        int iC = l1d.C(i2);
        if (iC == 0) {
            return 3;
        }
        if (iC == 1) {
            return 1;
        }
        if (iC == 2) {
            return 2;
        }
        eg.o();
        return 0;
    }

    public boolean W(i0h1 i0h1Var, i0h1 i0h1Var2) {
        return i0h1Var.equals(i0h1Var2);
    }

    public qh31 X(e8b0 e8b0Var) {
        gq20 gq20VarL = L(e8b0Var);
        if (gq20VarL != null) {
            return ((b7) gq20VarL).y();
        }
        qh31 qh31VarJ0 = j0(e8b0Var);
        qh31VarJ0.getClass();
        return qh31VarJ0;
    }

    public boolean Y(i0h1 i0h1Var) {
        return !(i0h1Var instanceof lod);
    }

    public qh31 Z(qh31 qh31Var) {
        int i2;
        oma0 oma0Var = (oma0) qh31Var;
        tka0 tka0VarK = oma0Var.k();
        tka0 tka0Var = tka0VarK instanceof tka0 ? tka0VarK : null;
        if (tka0Var != null) {
            List listV = oma0Var.v();
            List list = listV;
            if (!(list instanceof Collection) || !list.isEmpty()) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    if (((tma0) it.next()).a != 1) {
                        List listF = mod.f(tka0Var);
                        if (listF.size() != listV.size()) {
                            break;
                        }
                        List list2 = listV;
                        ArrayList arrayList = new ArrayList(q7h.U(list2, 10));
                        Iterator it2 = list2.iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                break;
                            }
                            tma0 tma0VarY = (tma0) it2.next();
                            int i3 = tma0VarY.a;
                            if (i3 != 1) {
                                oma0 oma0Var2 = tma0VarY.b;
                                if (i3 != 2) {
                                    oma0Var2 = null;
                                }
                                tma0 tma0Var = tma0.c;
                                tma0VarY = bqn1.y(new kod(oma0Var2, new lod(tma0VarY), false));
                            }
                            arrayList.add(tma0VarY);
                        }
                        vma0 vma0Var = vma0.b;
                        vma0 vma0Var2 = new vma0(sqg0.T(o7h.v1(mod.f(tka0Var), arrayList)));
                        int size = listV.size();
                        for (i2 = 0; i2 < size; i2++) {
                            tma0 tma0Var2 = (tma0) listV.get(i2);
                            if (tma0Var2.a != 1) {
                                List upperBounds = ((qma0) listF.get(i2)).getUpperBounds();
                                ArrayList arrayList2 = new ArrayList();
                                Iterator it3 = upperBounds.iterator();
                                while (it3.hasNext()) {
                                    oma0 oma0Var3 = vma0Var2.a(1, (oma0) it3.next()).b;
                                    oma0Var3.getClass();
                                    arrayList2.add(oma0Var3);
                                }
                                if (tma0Var2.a == 3) {
                                    oma0 oma0Var4 = tma0Var2.b;
                                    oma0Var4.getClass();
                                    arrayList2.add(oma0Var4);
                                }
                                ((tma0) arrayList.get(i2)).b.c.b = arrayList2;
                            }
                        }
                        boolean zI = oma0Var.i();
                        List annotations = oma0Var.getAnnotations();
                        boolean z = oma0Var instanceof b7;
                        b7 b7Var = z ? (b7) oma0Var : null;
                        oma0 oma0VarE = b7Var != null ? b7Var.e() : null;
                        b7 b7Var2 = z ? (b7) oma0Var : null;
                        return new ax81(tka0Var, arrayList, zI, annotations, oma0VarE, false, false, false, b7Var2 != null ? b7Var2.n() : null, null);
                    }
                }
            }
        }
        return null;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: p.i9n */
    public wod a(qh31 qh31Var) throws i9n {
        h4t h4tVarT0 = t0(qh31Var);
        if (h4tVarT0 == null) {
            return S((sx81) qh31Var);
        }
        x0(h4tVarT0);
        throw null;
    }

    public /* bridge */ boolean a0(e8b0 e8b0Var) {
        return false;
    }

    public Object apply(Object obj) {
        switch (this.a) {
            case 0:
                return Boolean.valueOf(y7y0.t("apply-child-content-restrictions", (Map) obj));
            case 1:
                int i2 = hpy0.a[((PuffinErrorOuterClass.PuffinError) obj).n().ordinal()];
                if (i2 != 1) {
                    return i2 != 2 ? fpy0.b : fpy0.d;
                }
                return fpy0.c;
            case 2:
                return Boolean.valueOf(((vo50) obj).a);
            case 3:
                rk21 rk21Var = (sk21) obj;
                if (rk21Var instanceof rk21) {
                    return new w901(rk21Var.a);
                }
                if (rk21Var.equals(qk21.a)) {
                    return v901.a;
                }
                eg.o();
                return null;
            case 4:
            case 5:
            case 8:
            case 9:
            case 12:
            case 15:
            case 17:
            case 18:
            case 21:
            default:
                qrm1 qrm1Var = (qrm1) ((Map) qrm1.g.getValue()).get((String) obj);
                if (qrm1Var == null) {
                    qrm1Var = qrm1.i;
                }
                return qrm1Var.c;
            case 6:
                beh behVar = (feh) obj;
                if (!(behVar instanceof beh)) {
                    return CompletableEmpty.a;
                }
                String str = behVar.a;
                n57.s("[Puffin] Could not resume player after onboarding: " + str);
                return Completable.j(new r9n(str));
            case 7:
                eww0 eww0Var = (eww0) obj;
                String str2 = eww0Var.f;
                String str3 = eww0Var.b;
                if (str2 == null) {
                    str2 = "";
                }
                return new fb41(true, str3, str2);
            case 10:
                return Boolean.valueOf(yto.j((String) obj));
            case 11:
                return ((mo81) obj).c;
            case 13:
                return ((th61) obj).a;
            case 14:
                return new wk91((y0a1) obj);
            case 16:
                return new zac1((u4c1) obj);
            case 19:
                return ((a5g1) obj).a;
            case 20:
                beh behVar2 = (feh) obj;
                return behVar2 instanceof beh ? new w7z0(behVar2.a) : x7z0.a;
            case 22:
                return rih1.a;
        }
    }

    public int b(a1h1 a1h1Var) {
        int iC = l1d.C(((qma0) a1h1Var).d);
        if (iC == 0) {
            return 3;
        }
        if (iC == 1) {
            return 1;
        }
        if (iC == 2) {
            return 2;
        }
        eg.o();
        return 0;
    }

    public boolean b0(i0h1 i0h1Var) {
        return false;
    }

    public d0h1 c(vod vodVar) {
        return new uma0(((lod) vodVar).a);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: p.i9n */
    public e8b0 c0(e8b0 e8b0Var) throws i9n {
        x0(e8b0Var);
        throw null;
    }

    public boolean d(wod wodVar) {
        return false;
    }

    public /* bridge */ boolean d0(qh31 qh31Var, qh31 qh31Var2) {
        return false;
    }

    public First e0(Object obj) {
        return First.b((o88) obj);
    }

    public qh31 f(gq20 gq20Var) {
        return ((b7) gq20Var).y();
    }

    public int f0(e8b0 e8b0Var) {
        return ((oma0) e8b0Var).v().size();
    }

    public qh31 g(gq20 gq20Var) {
        return ((b7) gq20Var).B();
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: p.i9n */
    public Collection h(qh31 qh31Var) throws i9n {
        x0(qh31Var);
        throw null;
    }

    public a1h1 h0(i0h1 i0h1Var, int i2) {
        return (qma0) mod.f((tka0) i0h1Var).get(i2);
    }

    public v5b1 i(String str, LinkedHashMap linkedHashMap, xkg0 xkg0Var, String str2) {
        return new twd1(str2, str, xkg0Var);
    }

    public ltn1 j(qh31 qh31Var) {
        vma0 vma0Var = vma0.b;
        return new nc11(eqn1.p((oma0) qh31Var));
    }

    public qh31 j0(e8b0 e8b0Var) {
        if (L(e8b0Var) != null) {
            return null;
        }
        return (qh31) e8b0Var;
    }

    public boolean k(qh31 qh31Var) {
        a8b0 a8b0Var;
        if (!(qh31Var instanceof b7) || !(((b7) qh31Var).k() instanceof akz)) {
            rgt rgtVar = qh31Var instanceof rgt ? (rgt) qh31Var : null;
            if (rgtVar == null || (a8b0Var = rgtVar.b) == null || !d4o1.i(a8b0Var)) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: p.i9n */
    public boolean k0(qh31 qh31Var) throws i9n {
        if (!G(qh31Var).equals(ajo0.b)) {
            return false;
        }
        x0(qh31Var);
        throw null;
    }

    public boolean l(qh31 qh31Var) {
        q(qh31Var);
        return false;
    }

    public boolean l0(qh31 qh31Var) {
        return q(qh31Var) instanceof tka0;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: p.i9n */
    public d0h1 m(e8b0 e8b0Var) throws i9n {
        x0(e8b0Var);
        throw null;
    }

    public d0h1 m0(e8b0 e8b0Var, int i2) {
        return new uma0((tma0) ((oma0) e8b0Var).v().get(i2));
    }

    public e8b0 n(d0h1 d0h1Var) {
        return (e8b0) ((uma0) d0h1Var).a.b;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: p.i9n */
    public boolean n0(a1h1 a1h1Var, i0h1 i0h1Var) throws i9n {
        x0(a1h1Var);
        throw null;
    }

    public boolean o(qh31 qh31Var) {
        qh31 qh31VarJ0 = j0(qh31Var);
        return (qh31VarJ0 != null ? a(qh31VarJ0) : null) != null;
    }

    public boolean o0(i0h1 i0h1Var) {
        return i0h1Var.equals(rc11.a.b(Object.class));
    }

    public Collection p(i0h1 i0h1Var) {
        if (i0h1Var instanceof tka0) {
            List listD = ((tka0) i0h1Var).d();
            ArrayList arrayList = new ArrayList(q7h.U(listD, 10));
            Iterator it = listD.iterator();
            while (it.hasNext()) {
                arrayList.add((e8b0) ((oma0) it.next()));
            }
            return arrayList;
        }
        if (i0h1Var instanceof qma0) {
            List upperBounds = ((qma0) i0h1Var).getUpperBounds();
            ArrayList arrayList2 = new ArrayList(q7h.U(upperBounds, 10));
            Iterator it2 = upperBounds.iterator();
            while (it2.hasNext()) {
                arrayList2.add((e8b0) ((oma0) it2.next()));
            }
            return arrayList2;
        }
        if (!(i0h1Var instanceof lod)) {
            StringBuilder sbJ = ktd.j("Unsupported type constructor: ", i0h1Var, " (");
            sbJ.append(i0h1Var.getClass().getName());
            sbJ.append(')');
            throw new IllegalStateException(sbJ.toString().toString());
        }
        ArrayList arrayList3 = ((lod) i0h1Var).b;
        if (arrayList3 == null) {
            u890.C("supertypes");
            throw null;
        }
        ArrayList arrayList4 = new ArrayList(q7h.U(arrayList3, 10));
        Iterator it3 = arrayList3.iterator();
        while (it3.hasNext()) {
            arrayList4.add((e8b0) ((oma0) it3.next()));
        }
        return arrayList4;
    }

    public i0h1 q(qh31 qh31Var) {
        Class<?> componentType;
        if (qh31Var instanceof kod) {
            return ((kod) qh31Var).c;
        }
        b7 b7Var = (b7) qh31Var;
        if (b7Var.t()) {
            return ajo0.b;
        }
        bla0 bla0VarK = b7Var.k();
        bla0 bla0Var = bla0VarK instanceof bla0 ? bla0VarK : null;
        if (bla0Var != null && (componentType = bla0Var.b.getComponentType()) != null && !componentType.isPrimitive()) {
            return rc11.a.b(Object[].class);
        }
        jla0 jla0VarN = b7Var.n();
        if (jla0VarN == null) {
            jla0VarN = b7Var.k();
        }
        return (i0h1) jla0VarN;
    }

    public d0h1 q0(c0h1 c0h1Var, int i2) {
        if (c0h1Var instanceof sx81) {
            return m0((e8b0) c0h1Var, i2);
        }
        if (c0h1Var instanceof x26) {
            return (d0h1) ((x26) c0h1Var).get(i2);
        }
        StringBuilder sb = new StringBuilder("unknown type argument list type: ");
        sb.append(c0h1Var);
        nkx0.r(rc11.a.b(c0h1Var.getClass()), sb);
        return null;
    }

    public d0h1 r(qh31 qh31Var, int i2) {
        if (i2 < 0 || i2 >= f0(qh31Var)) {
            return null;
        }
        return m0(qh31Var, i2);
    }

    public boolean t(e8b0 e8b0Var) {
        return ((oma0) e8b0Var).i();
    }

    public h4t t0(qh31 qh31Var) {
        if ((qh31Var instanceof b7) && ((b7) qh31Var).s()) {
            return (h4t) qh31Var;
        }
        return null;
    }

    public boolean test(Object obj) {
        switch (this.a) {
            case 5:
                return ((ln41) obj) instanceof jn41;
            case 12:
                return !jfv.o(((jfv) obj).a);
            default:
                return ((spq0) obj).c();
        }
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0096  */
    /* JADX WARN: Code duplicated, block: B:8:0x001d  */
    public boolean u(i0h1 i0h1Var) {
        dfm0 dfm0Var;
        if (!(i0h1Var instanceof bla0)) {
            return false;
        }
        bla0 bla0Var = (bla0) i0h1Var;
        Class cls = bla0Var.b;
        l3b0 l3b0VarP = bla0Var.P();
        if (l3b0VarP != null) {
            yzu yzuVar = xm7.b;
            mma0 mma0Var = xm7.a[7];
            dfm0Var = (dfm0) yzuVar.y(l3b0VarP);
            if (dfm0Var == null) {
                if (!cls.isAnnotation() || cls.isEnum()) {
                    dfm0Var = dfm0.FINAL;
                } else {
                    o860 o860Var = i541.c;
                    if (o860Var == null) {
                        try {
                            o860Var = new o860(Class.class.getMethod("isSealed", null), Class.class.getMethod("getPermittedSubclasses", null), Class.class.getMethod("isRecord", null), Class.class.getMethod("getRecordComponents", null), (byte) 17);
                        } catch (NoSuchMethodException unused) {
                            o860Var = new o860((Object) null, (Object) null, (Object) null, (Object) null, (byte) 17);
                        }
                        i541.c = o860Var;
                    }
                    Method method = (Method) o860Var.b;
                    if (u890.j(method != null ? (Boolean) method.invoke(cls, null) : null, Boolean.TRUE)) {
                        dfm0Var = dfm0.SEALED;
                    } else if (Modifier.isAbstract(cls.getModifiers())) {
                        dfm0Var = dfm0.ABSTRACT;
                    } else {
                        dfm0Var = !Modifier.isFinal(cls.getModifiers()) ? dfm0.OPEN : dfm0.FINAL;
                    }
                }
            }
        } else if (cls.isAnnotation()) {
            dfm0Var = dfm0.FINAL;
        } else {
            dfm0Var = dfm0.FINAL;
        }
        return (dfm0Var != dfm0.FINAL || bla0Var.N() == ieg.ENUM_CLASS || bla0Var.N() == ieg.ENUM_ENTRY || bla0Var.N() == ieg.ANNOTATION_CLASS) ? false : true;
    }

    public ne u0() {
        ne neVar;
        ne neVar2 = ne.g;
        if (neVar2 != null) {
            return neVar2;
        }
        synchronized (this) {
            neVar = ne.g;
            if (neVar == null) {
                zce0 zce0VarA = zce0.a(wf10.a());
                ae aeVar = new ae((byte) 0);
                ne neVar3 = new ne();
                neVar3.a = zce0VarA;
                neVar3.b = aeVar;
                neVar3.d = new AtomicBoolean(false);
                neVar3.e = new Date(0L);
                ne.g = neVar3;
                neVar = neVar3;
            }
        }
        return neVar;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: p.i9n */
    public e8b0 v(ArrayList arrayList) throws i9n {
        x0(this);
        throw null;
    }

    public boolean w(i0h1 i0h1Var) {
        return false;
    }

    public boolean y(i0h1 i0h1Var) {
        return i0h1Var.equals(ajo0.b);
    }

    public e8b0 z(wod wodVar) {
        return (e8b0) ((kod) wodVar).b;
    }

    public boolean test(Object obj, Object obj2) {
        return !u890.j(((od51) obj).a, ((od51) obj2).a);
    }

    public void T(e8b0 e8b0Var) {
    }

    public void g0(qh31 qh31Var) {
    }

    public void p0(qh31 qh31Var) {
    }
}
