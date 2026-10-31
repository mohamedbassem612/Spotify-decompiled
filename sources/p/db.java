package p;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.ComposeShader;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Shader;
import android.net.Uri;
import android.os.Build;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.spotify.listplatform.filteringimpl.ListFilteringProto$StoredFilter;
import com.spotify.nowplaying.scroll.ScrollCardType;
import io.reactivex.rxjava3.disposables.CompositeDisposable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class db extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public db(Bitmap bitmap, Function0 function0, b4g1 b4g1Var, xd6 xd6Var) {
        super(1);
        this.a = (byte) 16;
        this.d = bitmap;
        this.e = function0;
        this.b = b4g1Var;
        this.c = xd6Var;
    }

    /* JADX WARN: Code duplicated, block: B:319:0x011d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:35:0x0102  */
    /* JADX WARN: Code duplicated, block: B:36:0x0104  */
    /* JADX WARN: Code duplicated, block: B:38:0x0113  */
    /* JADX WARN: Code duplicated, block: B:41:0x011f A[LOOP:7: B:37:0x0111->B:41:0x011f, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:45:0x0132  */
    /* JADX WARN: Code duplicated, block: B:63:0x01ab  */
    public final Object invoke(Object obj) {
        Shader.TileMode tileMode;
        LinearGradient linearGradient;
        ComposeShader composeShader;
        int iMin;
        int i;
        int i2;
        yvg1 yvg1Var;
        w120 w120Var;
        byte b = this.a;
        b7x b7xVar = b7x.a;
        rih1 rih1Var = rih1.a;
        Object obj2 = this.d;
        Object obj3 = this.b;
        Object obj4 = this.c;
        Object obj5 = this.e;
        switch (b) {
            case 0:
                g2z g2zVar = ((eb) obj2).a;
                String str = (String) obj3;
                Function0 function0 = (Function0) obj5;
                Set set = s4b1.f;
                g2zVar.A(str, 2131951663, new jzm(g2zVar, (String) obj4, function0, uic.x(str).s(), (byte) 19), new vn30(g2zVar, null, (byte) 0));
                return rih1Var;
            case 1:
                e261 e261Var = (e261) obj;
                j171 j171Var = (j171) obj2;
                String str2 = (String) obj4;
                iu30 iu30Var = (iu30) obj5;
                smc0 smc0VarN = k4p1.n();
                smc0VarN.add(new epo((String) obj3, new vf((byte) 0, iu30Var, j171Var)));
                if (j171Var.b instanceof h171) {
                    smc0VarN.add(new epo(str2, new p1(iu30Var, (byte) 3)));
                }
                b261.p(e261Var, k4p1.k(smc0VarN));
                return rih1Var;
            case 2:
                ((qtr) obj).b(new ar0((iu30) obj2, (br0) obj3, (pxc) obj4, (mr20) obj5, (lnm) null));
                return rih1Var;
            case 3:
                iz0 iz0Var = (iz0) obj2;
                return h5p1.q((fu20) iz0Var.f, (gk) iz0Var.e, (mr20) obj3, (mr20) obj4, (mr20) obj5, new fz0((lnm) null));
            case 4:
                ((abc0) obj).c = new zk1((el1) obj2, (o0i) obj3, (xk1) obj4, (ven0) obj5, (lnm) null, (byte) 0);
                return rih1Var;
            case 5:
                rl1 rl1Var = (rl1) obj2;
                fn31.T(cto1.q((dg30) rl1Var.c), (o8n) null, 0, new af0(rl1Var, (String) obj3, (lik1) obj5, (tv80) obj, (String) obj4, (lnm) null), 3);
                return rih1Var;
            case 6:
                vu1.b((vu1) ((kr60) obj2).b, Collections.singletonList((String) obj3), ((lik1) obj5).a, (String) obj4, (tv80) obj, (dy1) null, 16);
                return rih1Var;
            case 7:
                ven0 ven0Var = (ven0) obj4;
                iu30 iu30Var2 = (iu30) ((ven0) obj2).getValue();
                String str3 = ((qqc1) obj3).b;
                iu30Var2.invoke(str3);
                if (!nhc1.Y(str3, "spotify:", false) || ven0Var.getValue() == null) {
                    Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str3));
                    intent.addFlags(268435456);
                    ((Context) ((ven0) obj5).getValue()).startActivity(intent);
                } else {
                    iu30 iu30Var3 = (iu30) ven0Var.getValue();
                    if (iu30Var3 != null) {
                        iu30Var3.invoke(str3);
                    }
                }
                return rih1Var;
            case 8:
                x83 x83Var = (x83) obj2;
                wto wtoVar = (wto) obj4;
                oj2 oj2Var = new oj2(x83Var, (y1c1) obj3, wtoVar, (byte) 9);
                Set setI = c13.i(hll.class);
                k83 k83Var = new k83(wtoVar, (byte) 6);
                p83 p83Var = p83.c;
                LinkedHashMap linkedHashMap = ((ji50) obj).b;
                linkedHashMap.put(q53.class, r4o1.Q(k83Var, setI, oj2Var, p83Var));
                linkedHashMap.put(t53.class, r4o1.Q(q83.c, as10.f(8, false, false, false, false), new r83((byte) 1, x83Var, wtoVar), p83.d));
                uto utoVar = (uto) obj5;
                linkedHashMap.put(p53.class, new vw21(new jm1(utoVar, (byte) 20), sqg0.J(new mmr0[]{new mmr0(f83.b, f46.S0(new yp21[]{new yp21(j6k.class), new yp21(lhe0.class)})), new mmr0(f83.a, f46.S0(new yp21[]{new yp21(jo70.class), new yp21(xkk1.class)}))}), new fc3(new n2(x83Var, utoVar, (byte) 27), (byte) 5), p83.e, (vu30) null));
                l83 l83Var = new l83(x83Var, (byte) 3);
                q83 q83Var = q83.d;
                p83 p83Var2 = p83.f;
                w7x w7xVar = w7x.a;
                linkedHashMap.put(s53.class, r4o1.Q(q83Var, w7xVar, l83Var, p83Var2));
                linkedHashMap.put(w53.class, r4o1.Q(b03.c1, f46.S0(new yp21[]{new yp21(jo70.class), new yp21(zoy0.class), new yp21(xkk1.class)}), new r83((byte) 2, x83Var, wtoVar), p83.g));
                linkedHashMap.put(v53.class, r4o1.Q(b03.d1, f46.S0(new yp21[]{new yp21(gw81.class), new yp21(xkk1.class)}), new l83(x83Var, (byte) 1), p83.h));
                linkedHashMap.put(r53.class, r4o1.Q(new k83(wtoVar, (byte) 3), c13.i(zoy0.class), new m83(wtoVar, (byte) 1), p83.i));
                linkedHashMap.put(x53.class, r4o1.Q(q83.b, w7xVar, new l83(x83Var, (byte) 2), p83.t));
                linkedHashMap.put(u53.class, r4o1.Q(new k83(wtoVar, (byte) 5), l1d.u(myv0.class), new r83((byte) 0, x83Var, wtoVar), p83.X));
                return rih1Var;
            case 9:
                return cso1.y(new bs0((d0r) obj3, (o3r) obj4, (vu30) p83.Z, f6o1.A(new ldo((bzo) ((e93) obj2).X, new dgy(3, null, null)), (ViewGroup.LayoutParams) null, (ScrollCardType) null, 3)), (xe01) obj5, p83.N0);
            case 10:
                return new jpg0(cso1.y(new u63((tzv0) ((q01) obj2).invoke(), (q01) obj3), (xe01) obj4, p83.O0), new jm1((Long) obj5, (byte) 21));
            case 11:
                gxb gxbVar = (hxb) obj;
                i8h1 i8h1Var = (i8h1) obj2;
                String str4 = (String) obj3;
                c2b0 c2b0Var = (c2b0) obj4;
                if (!((AtomicBoolean) obj5).get()) {
                    int iR = cbp1.r(c2b0Var);
                    y6h1 y6h1Var = y6h1.i;
                    x6h1 x6h1VarI = i3o1.i();
                    x6h1VarI.h = "music";
                    x6h1VarI.a = "mobile-gen-alpha-parental-control-make-allowlisting-request-bottom-sheet";
                    x6h1VarI.f = "1.2.0";
                    x6h1VarI.g = "22.0.0";
                    x6h1VarI.e = s7l0.g(iR);
                    x6h1VarI.d = str4;
                    y6h1 y6h1VarA = x6h1VarI.a();
                    Collections.singletonList("parental-control/make-allowlisting-request");
                    if (gxbVar instanceof gxb) {
                        int iC = l1d.C(gxbVar.a);
                        if (iC == 0) {
                            i8h1Var.m(new w7h1("", "", new z7h1("drag", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), y6h1VarA, r6h1.c, System.currentTimeMillis()), (xj61) null);
                        } else {
                            if (iC != 1 && iC != 2) {
                                eg.o();
                                return null;
                            }
                            i8h1Var.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), y6h1VarA, r6h1.c, System.currentTimeMillis()), (xj61) null);
                        }
                    }
                }
                return rih1Var;
            case 12:
                uac0 uac0Var = (uac0) obj;
                return new uc5(uac0Var, fn31.T(cto1.q(uac0Var), (fns) obj2, 0, new tc5((cqs0) obj3, (ven0) obj4, (ven0) obj5, (lnm) null), 2), (byte) 0);
            case 13:
                String str5 = (String) obj;
                l96 l96Var = (l96) obj2;
                ((ven0) obj5).setValue(str5);
                r4o1.R(l96Var.g.i(), str5, ((fa6) obj3).a.k, l96Var.a, (iu30) obj4);
                return rih1Var;
            case 14:
                ArrayList arrayList = ((ac6) obj2).a;
                ((rtb0) obj).e(arrayList.size(), new ry4(arrayList, (byte) 1), new ry4(arrayList, (byte) 2), new j2i(802480018, new oi1(arrayList, (kko) obj3, (rzo) obj4, (iu30) obj5, (byte) 1), true));
                return rih1Var;
            case 15:
                return new ht0((xf6) obj5, (obj2 == null || !((Boolean) ((tob1) obj3).getValue()).booleanValue()) ? null : (t480) ((iu30) ((ven0) obj4).getValue()).invoke(obj2), (byte) 5);
            case 16:
                eqc eqcVar = (eqc) obj;
                Bitmap bitmap = (Bitmap) obj2;
                boolean z = eqcVar.a.getLayoutDirection() == flb0.b;
                boolean z2 = Build.VERSION.SDK_INT >= 28;
                Shader.TileMode tileMode2 = Shader.TileMode.CLAMP;
                BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode2, tileMode2);
                float fIntBitsToFloat = Float.intBitsToFloat((int) (eqcVar.a.j() >> 32));
                float fIntBitsToFloat2 = Float.intBitsToFloat((int) (eqcVar.a.j() & 4294967295L));
                Matrix matrix = new Matrix();
                int width = bitmap.getWidth();
                if (width < 1) {
                    width = 1;
                }
                float f = fIntBitsToFloat / width;
                int height = bitmap.getHeight();
                if (height < 1) {
                    height = 1;
                }
                float f2 = fIntBitsToFloat2 / height;
                if (z) {
                    f = -f;
                }
                if (!z) {
                    fIntBitsToFloat = 0.0f;
                }
                matrix.setValues(new float[]{f, 0.0f, fIntBitsToFloat, 0.0f, f2, 0.0f, 0.0f, 0.0f, 1.0f});
                bitmapShader.setLocalMatrix(matrix);
                if (z2) {
                    tileMode = tileMode2;
                    linearGradient = new LinearGradient(0.0f, 0.0f, 0.0f, Float.intBitsToFloat((int) (eqcVar.a.j() & 4294967295L)), oi6.a, oi6.b, tileMode);
                } else {
                    tileMode = tileMode2;
                    linearGradient = null;
                }
                LinearGradient linearGradient2 = new LinearGradient(Float.intBitsToFloat((int) (eqcVar.a.j() >> 32)) * (z ? 1.2f : -0.2f), Float.intBitsToFloat((int) (eqcVar.a.j() & 4294967295L)) * (-0.285f), Float.intBitsToFloat((int) (eqcVar.a.j() >> 32)) * (z ? -0.20000005f : 1.2f), Float.intBitsToFloat((int) (eqcVar.a.j() & 4294967295L)) * 1.285f, z2 ? oi6.c : oi6.e, oi6.d, tileMode);
                Matrix matrix2 = new Matrix();
                Paint paint = new Paint(3);
                paint.setDither(true);
                paint.setAlpha(jch0.U(127.5f));
                if (!z2) {
                    composeShader = new ComposeShader(linearGradient2, bitmapShader, PorterDuff.Mode.DST_IN);
                } else {
                    if (linearGradient == null) {
                        eg.m("Required value was null.");
                        return null;
                    }
                    PorterDuff.Mode mode = PorterDuff.Mode.DST_IN;
                    composeShader = new ComposeShader(new ComposeShader(linearGradient, linearGradient2, mode), bitmapShader, mode);
                }
                paint.setShader(composeShader);
                return eqcVar.a(new j96((Function0) obj5, (b4g1) obj3, (xd6) obj4, matrix2, linearGradient2, paint, (byte) 1));
            case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                h98 h98Var = new h98(((xfx) obj2).f.a, (byte) 7);
                o5m o5mVar = (o5m) obj3;
                h98Var.n(new xg6((em3) obj4, (iu30) obj5, (byte) 9));
                h98Var.u(new fgz(ggz.g, new dgz(o5mVar.a, o5mVar.b, new cgz(o5mVar.c, o5mVar.d), false, 24), 2));
                return (ConstraintLayout) ((tjq) h98Var.c).b;
            case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
                rtb0 rtb0Var = (rtb0) obj;
                rtb0.c(rtb0Var, "artist_list_sheet_title", new j2i(-1153025241, new wf((cvx) obj4, (String) obj3, (byte) 20), true), 2);
                List list = (List) obj2;
                rtb0Var.e(list.size(), new qf1(list, (byte) 14), new qf1(list, (byte) 15), new j2i(802480018, new ki1(list, (iu30) obj5, (byte) 1), true));
                return rih1Var;
            case ListFilteringProto$StoredFilter.EXCLUDE_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 19 */:
                ad5 ad5Var = ad5.U0;
                LinkedHashMap linkedHashMap2 = ((ji50) obj).b;
                linkedHashMap2.put(yq11.class, new r3r((tyq) obj2, ad5Var, 4));
                linkedHashMap2.put(uq11.class, new r3r((tyq) obj3, ad5.V0, 4));
                linkedHashMap2.put(zq11.class, new r3r((tyq) obj4, ad5.W0, 4));
                linkedHashMap2.put(wq11.class, new b7t0(new cdk1((xpw) obj5), ad5.X0));
                linkedHashMap2.put(xq11.class, new b7t0(new cdk1(new xv81((byte) 1)), ad5.Y0));
                return rih1Var;
            case ListFilteringProto$StoredFilter.FORMAT_LIST_ATTRIBUTE_KEYS_FIELD_NUMBER /* 20 */:
                u77 u77Var = (u77) obj2;
                List list2 = u77Var.c;
                ((rtb0) obj).e(list2.size(), new qf1(list2, (byte) 16), new qf1(list2, (byte) 17), new j2i(2039820996, new a87(list2, (b87) obj3, u77Var, (n8b1) obj4, (tob1) obj5, (byte) 0), true));
                return rih1Var;
            case ListFilteringProto$StoredFilter.TAG_IDS_FIELD_NUMBER /* 21 */:
                ((qtr) obj).b(new z78((iu30) obj2, (e8r0) obj3, (k781) obj4, (i4q) obj5, (lnm) null));
                return rih1Var;
            case 22:
                ((d7b) obj2).a.a((String) obj3, (String) obj4, (h7b) obj5);
                return rih1Var;
            case 23:
                if (((wz20) obj).b()) {
                    Function0 function1 = (Function0) obj5;
                    if (function1 != null) {
                        function1.invoke();
                    }
                    md80 md80Var = (md80) ((ven0) obj2).getValue();
                    if (md80Var != null) {
                        ((iu30) obj3).invoke(new gg80((at80) obj4, md80Var, cg80.b));
                    }
                }
                return rih1Var;
            case ListFilteringProto$StoredFilter.VIDEO_NOT_AVAILABLE_OFFLINE_ONLY_FIELD_NUMBER /* 24 */:
                gmw0 gmw0Var = (gmw0) obj;
                gmw0Var.setImplementationMode((dmw0) obj2);
                ((ven0) obj5).setValue(gmw0Var);
                haw0 surfaceProvider = gmw0Var.getSurfaceProvider();
                ((iu30) obj3).invoke(surfaceProvider);
                ((iu30) obj4).invoke(new u3d(surfaceProvider));
                return rih1Var;
            case 25:
                ((ji50) obj).b.put(kic1.class, new r3r(new xzq((tyq) obj2, new o0d((iu30) obj3, obj4, obj5, (byte) 3)), wnb.Q0, 4));
                return rih1Var;
            case 26:
                r6h1 r6h1Var = (r6h1) obj4;
                cab cabVar = (cab) obj2;
                CompositeDisposable compositeDisposable = new CompositeDisposable();
                int iOrdinal = ((yae) obj).ordinal();
                if (iOrdinal == 0) {
                    String str6 = (String) obj3;
                    wqk0 wqk0Var = r6h1Var != null ? new wqk0(r6h1Var, (byte) 20) : null;
                    if (wqk0Var != null) {
                        x6h1 x6h1VarC = wqk0Var.c.c();
                        x6h1VarC.i.add(new a7h1("settings_button", (String) null, (Integer) null, (String) null, (String) null));
                        x6h1VarC.j = false;
                        x6h1VarC.a();
                        new z7h1("hit", 1, b7xVar);
                        new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str6));
                        System.currentTimeMillis();
                    }
                    ((lzn0) cabVar.b).h(pro1.t("downloadOver3g"));
                    compositeDisposable.dispose();
                } else {
                    if (iOrdinal != 1) {
                        eg.o();
                        return null;
                    }
                    wqk0 wqk0Var2 = r6h1Var != null ? new wqk0(r6h1Var, (byte) 20) : null;
                    if (wqk0Var2 != null) {
                        x6h1 x6h1VarC2 = wqk0Var2.c.c();
                        x6h1VarC2.i.add(new a7h1("cancel_button", (String) null, (Integer) null, (String) null, (String) null));
                        x6h1VarC2.j = false;
                        x6h1VarC2.a();
                        new z7h1("hit", 1, b7xVar);
                        new x7h1("ui_hide", 1, b7xVar);
                        System.currentTimeMillis();
                    }
                    compositeDisposable.dispose();
                }
                ((ohd) obj5).resumeWith(Boolean.FALSE);
                return rih1Var;
            case 27:
                krm0 krm0Var = (krm0) obj;
                ven0 ven0Var2 = (ven0) obj4;
                ven0 ven0Var3 = (ven0) obj2;
                boolean z3 = ((krm0) ven0Var3.getValue()) == krm0.b;
                ven0Var3.setValue(krm0Var);
                if (krm0Var == krm0.a) {
                    Boolean bool = Boolean.FALSE;
                    ((ven0) obj3).setValue(bool);
                    if (z3 && !((Boolean) ven0Var2.getValue()).booleanValue()) {
                        ((iu30) ((ven0) obj5).getValue()).invoke(kpe.a);
                    }
                    ven0Var2.setValue(bool);
                }
                return rih1Var;
            case 28:
                List list3 = (List) ((ven0) obj2).getValue();
                ((kex) obj).b(list3.size(), new j2i(-1673449743, new k8(list3, (Map) obj3, (m3g) obj4, (cxc0) obj5, (byte) 19), true), new s6(list3, (byte) 18));
                return rih1Var;
            default:
                c8e1 c8e1Var = (c8e1) obj;
                ven0 ven0Var4 = (ven0) obj5;
                ven0 ven0Var5 = (ven0) obj4;
                long jE = c8e1Var.b;
                ven0 ven0Var6 = (ven0) obj3;
                String str7 = ((c8e1) ven0Var6.getValue()).a.b;
                af5 af5Var = c8e1Var.a;
                if (u890.j(af5Var.b, str7)) {
                    List list4 = (List) ven0Var5.getValue();
                    int i3 = nbe1.c;
                    int i4 = (int) (jE >> 32);
                    int iE = phg.e(i4, list4);
                    int i5 = (int) (jE & 4294967295L);
                    int iE2 = phg.e(i5, list4);
                    if (iE != i4 || iE2 != i5) {
                        jE = e6p1.e(iE, iE2);
                    }
                    ven0Var6.setValue(c8e1.a(c8e1Var, (af5) null, jE, 5));
                } else {
                    List list5 = (List) ven0Var5.getValue();
                    String str8 = af5Var.b;
                    int length = str8.length() - str7.length();
                    int i6 = (int) (jE >> 32);
                    if (!nbe1.d(jE)) {
                        iMin = Math.min(str7.length(), str8.length());
                        for (i = 0; i < iMin; i++) {
                            if (str7.charAt(i) != str8.charAt(i)) {
                                iMin = i;
                                i2 = 0;
                                while (i2 < Math.min(str7.length(), str8.length()) - iMin && str7.charAt((str7.length() - 1) - i2) == str8.charAt((str8.length() - 1) - i2)) {
                                    i2++;
                                }
                                yvg1Var = new yvg1(Integer.valueOf(iMin), Integer.valueOf(str7.length() - i2), cy30.h(i2, iMin, str8));
                            }
                        }
                        i2 = 0;
                        while (i2 < Math.min(str7.length(), str8.length()) - iMin) {
                            i2++;
                        }
                        yvg1Var = new yvg1(Integer.valueOf(iMin), Integer.valueOf(str7.length() - i2), cy30.h(i2, iMin, str8));
                    } else if (length > 0) {
                        int i7 = i6 - length;
                        if (i7 >= 0) {
                            if (i7 <= str7.length() && i6 <= str8.length()) {
                                if ((str7.substring(0, i7) + str8.substring(i7, i6) + str7.substring(i7)).equals(str8)) {
                                    yvg1Var = new yvg1(Integer.valueOf(i7), Integer.valueOf(i7), str8.substring(i7, i6));
                                }
                            }
                        }
                        iMin = Math.min(str7.length(), str8.length());
                        while (i < iMin) {
                            if (str7.charAt(i) != str8.charAt(i)) {
                                iMin = i;
                                i2 = 0;
                                while (i2 < Math.min(str7.length(), str8.length()) - iMin) {
                                    i2++;
                                }
                                yvg1Var = new yvg1(Integer.valueOf(iMin), Integer.valueOf(str7.length() - i2), cy30.h(i2, iMin, str8));
                            }
                        }
                        i2 = 0;
                        while (i2 < Math.min(str7.length(), str8.length()) - iMin) {
                            i2++;
                        }
                        yvg1Var = new yvg1(Integer.valueOf(iMin), Integer.valueOf(str7.length() - i2), cy30.h(i2, iMin, str8));
                    } else if (length < 0) {
                        int i8 = i6 - length;
                        if (i6 < 0 || i6 > str7.length() || i8 > str7.length() || !u890.j(ihc1.I0(i6, i8, str7).toString(), str8)) {
                            iMin = Math.min(str7.length(), str8.length());
                            while (i < iMin) {
                                if (str7.charAt(i) != str8.charAt(i)) {
                                    iMin = i;
                                    i2 = 0;
                                    while (i2 < Math.min(str7.length(), str8.length()) - iMin) {
                                        i2++;
                                    }
                                    yvg1Var = new yvg1(Integer.valueOf(iMin), Integer.valueOf(str7.length() - i2), cy30.h(i2, iMin, str8));
                                }
                            }
                            i2 = 0;
                            while (i2 < Math.min(str7.length(), str8.length()) - iMin) {
                                i2++;
                            }
                            yvg1Var = new yvg1(Integer.valueOf(iMin), Integer.valueOf(str7.length() - i2), cy30.h(i2, iMin, str8));
                        } else {
                            yvg1Var = new yvg1(Integer.valueOf(i6), Integer.valueOf(i8), "");
                        }
                    } else {
                        iMin = Math.min(str7.length(), str8.length());
                        while (i < iMin) {
                            if (str7.charAt(i) != str8.charAt(i)) {
                                iMin = i;
                                i2 = 0;
                                while (i2 < Math.min(str7.length(), str8.length()) - iMin) {
                                    i2++;
                                }
                                yvg1Var = new yvg1(Integer.valueOf(iMin), Integer.valueOf(str7.length() - i2), cy30.h(i2, iMin, str8));
                            }
                        }
                        i2 = 0;
                        while (i2 < Math.min(str7.length(), str8.length()) - iMin) {
                            i2++;
                        }
                        yvg1Var = new yvg1(Integer.valueOf(iMin), Integer.valueOf(str7.length() - i2), cy30.h(i2, iMin, str8));
                    }
                    int iIntValue = ((Number) yvg1Var.a).intValue();
                    int iIntValue2 = ((Number) yvg1Var.b).intValue();
                    String str9 = (String) yvg1Var.c;
                    List<i220> list6 = list5;
                    ArrayList arrayList2 = new ArrayList();
                    for (Object obj6 : list6) {
                        long j = jE;
                        i220 i220Var = (i220) obj6;
                        if (iIntValue == iIntValue2) {
                            tr80 tr80Var = i220Var.a;
                            if (iIntValue > ((rr80) tr80Var).a && iIntValue <= ((rr80) tr80Var).b) {
                                arrayList2.add(obj6);
                            }
                        } else {
                            tr80 tr80Var2 = i220Var.a;
                            if (((rr80) tr80Var2).a < iIntValue2 && ((rr80) tr80Var2).b + 1 > iIntValue) {
                                arrayList2.add(obj6);
                            }
                        }
                        jE = j;
                    }
                    long j2 = jE;
                    if (!arrayList2.isEmpty()) {
                        Iterator it = arrayList2.iterator();
                        if (it.hasNext()) {
                            int i9 = ((rr80) ((i220) it.next()).a).a;
                            while (it.hasNext()) {
                                int i10 = ((rr80) ((i220) it.next()).a).a;
                                if (i9 > i10) {
                                    i9 = i10;
                                }
                            }
                            int iMin2 = Math.min(iIntValue, i9);
                            Iterator it2 = arrayList2.iterator();
                            if (it2.hasNext()) {
                                int i11 = ((rr80) ((i220) it2.next()).a).b + 1;
                                while (it2.hasNext()) {
                                    int i12 = ((rr80) ((i220) it2.next()).a).b + 1;
                                    if (i11 < i12) {
                                        i11 = i12;
                                    }
                                }
                                int iMax = Math.max(iIntValue2, i11);
                                String strF = f4i1.f(str7.substring(0, iMin2), str9, str7.substring(iMax));
                                int length2 = str9.length() - (iMax - iMin2);
                                ArrayList<i220> arrayList3 = new ArrayList();
                                for (Object obj7 : list6) {
                                    if (!arrayList2.contains((i220) obj7)) {
                                        arrayList3.add(obj7);
                                    }
                                }
                                ArrayList arrayList4 = new ArrayList(q7h.U(arrayList3, 10));
                                for (i220 i220Var2 : arrayList3) {
                                    tr80 tr80Var3 = i220Var2.a;
                                    int i13 = ((rr80) tr80Var3).a;
                                    if (i13 >= iMax) {
                                        i220Var2 = new i220(yoi1.Q(i13 + length2, ((rr80) tr80Var3).b + 1 + length2), i220Var2.b);
                                    }
                                    arrayList4.add(i220Var2);
                                }
                                int length3 = str9.length() + iMin2;
                                w120Var = new w120(new c8e1(e6p1.e(length3, length3), 4, strF), arrayList4);
                            } else {
                                hhg1.k();
                            }
                        } else {
                            hhg1.k();
                        }
                        return null;
                    }
                    int length4 = str9.length() - (iIntValue2 - iIntValue);
                    ArrayList arrayList5 = new ArrayList(q7h.U(list6, 10));
                    for (i220 i220Var3 : list6) {
                        tr80 tr80Var4 = i220Var3.a;
                        int i14 = ((rr80) tr80Var4).a;
                        if (i14 >= iIntValue2) {
                            i220Var3 = new i220(yoi1.Q(i14 + length4, ((rr80) tr80Var4).b + 1 + length4), i220Var3.b);
                        }
                        arrayList5.add(i220Var3);
                    }
                    int i15 = nbe1.c;
                    int iE3 = phg.e(i6, arrayList5);
                    int i16 = (int) (j2 & 4294967295L);
                    int iE4 = phg.e(i16, arrayList5);
                    w120Var = new w120(c8e1.a(c8e1Var, (af5) null, (iE3 == i6 && iE4 == i16) ? j2 : e6p1.e(iE3, iE4), 5), arrayList5);
                    ArrayList arrayList6 = w120Var.b;
                    ven0Var5.setValue(arrayList6);
                    c8e1 c8e1Var2 = w120Var.a;
                    ven0Var6.setValue(c8e1Var2);
                    String str10 = c8e1Var2.a.b;
                    StringBuilder sb = new StringBuilder();
                    int iP = 0;
                    for (i220 i220Var4 : o7h.a1(arrayList6, new p0d((byte) 9))) {
                        int iP2 = yoi1.p(((rr80) i220Var4.a).a, iP, str10.length());
                        sb.append(phg.c(str10.substring(iP, iP2)));
                        sb.append(i220Var4.b.s);
                        iP = yoi1.p(((rr80) i220Var4.a).b + 1, iP2, str10.length());
                    }
                    sb.append(phg.c(str10.substring(iP)));
                    ven0Var4.setValue(sb.toString());
                    ((iu30) obj2).invoke((String) ven0Var4.getValue());
                }
                return rih1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ db(Object obj, Object obj2, Object obj3, Object obj4, byte b) {
        super(1);
        this.a = b;
        this.d = obj;
        this.b = obj2;
        this.c = obj3;
        this.e = obj4;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ db(Object obj, String str, lik1 lik1Var, String str2, byte b) {
        super(1);
        this.a = b;
        this.d = obj;
        this.b = str;
        this.e = lik1Var;
        this.c = str2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public db(String str, j171 j171Var, String str2, iu30 iu30Var) {
        super(1);
        this.a = (byte) 1;
        this.b = str;
        this.d = j171Var;
        this.c = str2;
        this.e = iu30Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public db(List list, cvx cvxVar, String str, iu30 iu30Var) {
        super(1);
        this.a = (byte) 18;
        this.d = list;
        this.c = cvxVar;
        this.b = str;
        this.e = iu30Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public db(Function0 function0, ven0 ven0Var, iu30 iu30Var, at80 at80Var) {
        super(1);
        this.a = (byte) 23;
        this.e = function0;
        this.d = ven0Var;
        this.b = iu30Var;
        this.c = at80Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public db(hwx0 hwx0Var, l96 l96Var, fa6 fa6Var, iu30 iu30Var, ven0 ven0Var) {
        super(1);
        this.a = (byte) 13;
        this.d = l96Var;
        this.b = fa6Var;
        this.c = iu30Var;
        this.e = ven0Var;
    }
}
