package p;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import androidx.car.app.navigation.model.Maneuver;
import androidx.compose.ui.geometry.Offset;
import app.p000rive.runtime.kotlin.renderers.RendererMetrics;
import coil3.request.NullRequestDataException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final /* synthetic */ class d5e1 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ d5e1(iu30 iu30Var, iu30 iu30Var2, iu30 iu30Var3) {
        this.a = (byte) 8;
        this.c = iu30Var;
        this.b = iu30Var2;
        this.d = iu30Var3;
    }

    public final Object invoke(Object obj) throws Exception {
        Integer numE;
        Integer numD;
        Integer numD2;
        Integer numE2;
        y9e1 y9e1Var;
        y9e1 y9e1Var2;
        z9e1 z9e1Var;
        z9e1 z9e1Var2;
        y9e1 y9e1Var3;
        y9e1 y9e1Var4;
        z9e1 z9e1Var3;
        z9e1 z9e1Var4;
        Integer numD3;
        Integer numE3;
        Integer numE4;
        Integer numD4;
        c8e1 c8e1Var;
        ptf1 ptf1Var;
        c8e1 c8e1Var2;
        boolean z;
        byte b = this.a;
        Object obj2 = eko1.b;
        Object obj3 = eko1.a;
        int i = 8;
        int i2 = 7;
        int i3 = 17;
        int i4 = 4;
        int i5 = 3;
        final byte b2 = 2;
        rih1 rih1Var = rih1.a;
        Object obj4 = this.d;
        Object obj5 = this.c;
        Object obj6 = this.b;
        final byte b3 = 0;
        int i6 = 1;
        switch (b) {
            case 0:
                iu30 iu30Var = (iu30) obj5;
                c9e1 c9e1Var = (c9e1) ((p811) obj4).a;
                c8e1 c8e1VarD = ((jut) obj6).d((List) obj);
                if (c9e1Var != null) {
                    c9e1Var.a(null, c8e1VarD);
                }
                iu30Var.invoke(c8e1VarD);
                return rih1Var;
            case 1:
                q5e1 q5e1Var = (q5e1) obj5;
                l811 l811Var = (l811) obj4;
                n6e1 n6e1Var = (n6e1) obj;
                switch (((woa0) obj6).ordinal()) {
                    case 0:
                        n6e1Var.e.a = null;
                        if (n6e1Var.g.b.length() > 0) {
                            if (!nbe1.d(n6e1Var.f)) {
                                boolean zF = n6e1Var.f();
                                long j = n6e1Var.f;
                                if (!zF) {
                                    int iF = nbe1.f(j);
                                    n6e1Var.q(iF, iF);
                                } else {
                                    int iG = nbe1.g(j);
                                    n6e1Var.q(iG, iG);
                                }
                            } else {
                                n6e1Var.i();
                            }
                        }
                        break;
                    case 1:
                        n6e1Var.e.a = null;
                        if (n6e1Var.g.b.length() > 0) {
                            if (!nbe1.d(n6e1Var.f)) {
                                boolean zF2 = n6e1Var.f();
                                long j2 = n6e1Var.f;
                                if (!zF2) {
                                    int iG2 = nbe1.g(j2);
                                    n6e1Var.q(iG2, iG2);
                                } else {
                                    int iF2 = nbe1.f(j2);
                                    n6e1Var.q(iF2, iF2);
                                }
                            } else {
                                n6e1Var.m();
                            }
                        }
                        break;
                    case 2:
                        jbe1 jbe1Var = n6e1Var.e;
                        jbe1Var.a = null;
                        af5 af5Var = n6e1Var.g;
                        String str = af5Var.b;
                        String str2 = af5Var.b;
                        if (str.length() > 0) {
                            if (!n6e1Var.f()) {
                                jbe1Var.a = null;
                                if (str2.length() > 0 && (numE = n6e1Var.e()) != null) {
                                    int iIntValue = numE.intValue();
                                    n6e1Var.q(iIntValue, iIntValue);
                                }
                            } else {
                                jbe1Var.a = null;
                                if (str2.length() > 0 && (numD = n6e1Var.d()) != null) {
                                    int iIntValue2 = numD.intValue();
                                    n6e1Var.q(iIntValue2, iIntValue2);
                                }
                            }
                        }
                        break;
                    case 3:
                        jbe1 jbe1Var2 = n6e1Var.e;
                        jbe1Var2.a = null;
                        af5 af5Var2 = n6e1Var.g;
                        String str3 = af5Var2.b;
                        String str4 = af5Var2.b;
                        if (str3.length() > 0) {
                            if (!n6e1Var.f()) {
                                jbe1Var2.a = null;
                                if (str4.length() > 0 && (numD2 = n6e1Var.d()) != null) {
                                    int iIntValue3 = numD2.intValue();
                                    n6e1Var.q(iIntValue3, iIntValue3);
                                }
                            } else {
                                jbe1Var2.a = null;
                                if (str4.length() > 0 && (numE2 = n6e1Var.e()) != null) {
                                    int iIntValue4 = numE2.intValue();
                                    n6e1Var.q(iIntValue4, iIntValue4);
                                }
                            }
                        }
                        break;
                    case 4:
                        n6e1Var.j();
                        break;
                    case 5:
                        n6e1Var.l();
                        break;
                    case 6:
                        n6e1Var.o();
                        break;
                    case 7:
                        n6e1Var.n();
                        break;
                    case 8:
                        n6e1Var.e.a = null;
                        if (n6e1Var.g.b.length() > 0) {
                            if (!n6e1Var.f()) {
                                n6e1Var.n();
                            } else {
                                n6e1Var.o();
                            }
                        }
                        break;
                    case 9:
                        n6e1Var.e.a = null;
                        if (n6e1Var.g.b.length() > 0) {
                            if (!n6e1Var.f()) {
                                n6e1Var.o();
                            } else {
                                n6e1Var.n();
                            }
                        }
                        break;
                    case 10:
                        if (n6e1Var.g.b.length() > 0 && (y9e1Var = n6e1Var.c) != null) {
                            int iG3 = n6e1Var.g(y9e1Var, -1);
                            n6e1Var.q(iG3, iG3);
                        }
                        break;
                    case 11:
                        if (n6e1Var.g.b.length() > 0 && (y9e1Var2 = n6e1Var.c) != null) {
                            int iG4 = n6e1Var.g(y9e1Var2, 1);
                            n6e1Var.q(iG4, iG4);
                        }
                        break;
                    case 12:
                    case 48:
                        break;
                    case 13:
                        if (n6e1Var.g.b.length() > 0 && (z9e1Var = n6e1Var.i) != null) {
                            int iH = n6e1Var.h(z9e1Var, -1);
                            n6e1Var.q(iH, iH);
                        }
                        break;
                    case 14:
                        if (n6e1Var.g.b.length() > 0 && (z9e1Var2 = n6e1Var.i) != null) {
                            int iH2 = n6e1Var.h(z9e1Var2, 1);
                            n6e1Var.q(iH2, iH2);
                        }
                        break;
                    case 15:
                        n6e1Var.e.a = null;
                        if (n6e1Var.g.b.length() > 0) {
                            n6e1Var.q(0, 0);
                        }
                        break;
                    case 16:
                        n6e1Var.e.a = null;
                        af5 af5Var3 = n6e1Var.g;
                        if (af5Var3.b.length() > 0) {
                            int length = af5Var3.b.length();
                            n6e1Var.q(length, length);
                        }
                        break;
                    case 17:
                        q5e1Var.b.a(false);
                        break;
                    case 18:
                        q5e1Var.b.o();
                        break;
                    case 19:
                        q5e1Var.b.c();
                        break;
                    case 20:
                        List listA = n6e1Var.a(new p5e1((byte) 0));
                        if (listA != null) {
                            q5e1Var.a(listA);
                        }
                        break;
                    case 21:
                        List listA2 = n6e1Var.a(new p5e1((byte) 1));
                        if (listA2 != null) {
                            q5e1Var.a(listA2);
                        }
                        break;
                    case 22:
                        List listA3 = n6e1Var.a(new p5e1((byte) 2));
                        if (listA3 != null) {
                            q5e1Var.a(listA3);
                        }
                        break;
                    case 23:
                        List listA4 = n6e1Var.a(new p5e1((byte) 3));
                        if (listA4 != null) {
                            q5e1Var.a(listA4);
                        }
                        break;
                    case 24:
                        List listA5 = n6e1Var.a(new p5e1((byte) 4));
                        if (listA5 != null) {
                            q5e1Var.a(listA5);
                        }
                        break;
                    case 25:
                        List listA6 = n6e1Var.a(new p5e1((byte) 5));
                        if (listA6 != null) {
                            q5e1Var.a(listA6);
                        }
                        break;
                    case 26:
                        n6e1Var.e.a = null;
                        af5 af5Var4 = n6e1Var.g;
                        if (af5Var4.b.length() > 0) {
                            n6e1Var.q(0, af5Var4.b.length());
                        }
                        break;
                    case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                        n6e1Var.i();
                        n6e1Var.p();
                        break;
                    case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                        n6e1Var.m();
                        n6e1Var.p();
                        break;
                    case Maneuver.TYPE_MERGE_SIDE_UNSPECIFIED /* 29 */:
                        if (n6e1Var.g.b.length() > 0 && (y9e1Var3 = n6e1Var.c) != null) {
                            int iG5 = n6e1Var.g(y9e1Var3, -1);
                            n6e1Var.q(iG5, iG5);
                        }
                        n6e1Var.p();
                        break;
                    case RendererMetrics.SAMPLES /* 30 */:
                        if (n6e1Var.g.b.length() > 0 && (y9e1Var4 = n6e1Var.c) != null) {
                            int iG6 = n6e1Var.g(y9e1Var4, 1);
                            n6e1Var.q(iG6, iG6);
                        }
                        n6e1Var.p();
                        break;
                    case 31:
                        if (n6e1Var.g.b.length() > 0 && (z9e1Var3 = n6e1Var.i) != null) {
                            int iH3 = n6e1Var.h(z9e1Var3, -1);
                            n6e1Var.q(iH3, iH3);
                        }
                        n6e1Var.p();
                        break;
                    case 32:
                        if (n6e1Var.g.b.length() > 0 && (z9e1Var4 = n6e1Var.i) != null) {
                            int iH4 = n6e1Var.h(z9e1Var4, 1);
                            n6e1Var.q(iH4, iH4);
                        }
                        n6e1Var.p();
                        break;
                    case Maneuver.TYPE_ROUNDABOUT_ENTER_AND_EXIT_CW_WITH_ANGLE /* 33 */:
                        n6e1Var.e.a = null;
                        if (n6e1Var.g.b.length() > 0) {
                            n6e1Var.q(0, 0);
                        }
                        n6e1Var.p();
                        break;
                    case Maneuver.TYPE_ROUNDABOUT_ENTER_AND_EXIT_CCW /* 34 */:
                        n6e1Var.e.a = null;
                        af5 af5Var5 = n6e1Var.g;
                        if (af5Var5.b.length() > 0) {
                            int length2 = af5Var5.b.length();
                            n6e1Var.q(length2, length2);
                        }
                        n6e1Var.p();
                        break;
                    case Maneuver.TYPE_ROUNDABOUT_ENTER_AND_EXIT_CCW_WITH_ANGLE /* 35 */:
                        jbe1 jbe1Var3 = n6e1Var.e;
                        jbe1Var3.a = null;
                        af5 af5Var6 = n6e1Var.g;
                        String str5 = af5Var6.b;
                        String str6 = af5Var6.b;
                        if (str5.length() > 0) {
                            if (n6e1Var.f()) {
                                jbe1Var3.a = null;
                                if (str6.length() > 0 && (numE3 = n6e1Var.e()) != null) {
                                    int iIntValue5 = numE3.intValue();
                                    n6e1Var.q(iIntValue5, iIntValue5);
                                }
                            } else {
                                jbe1Var3.a = null;
                                if (str6.length() > 0 && (numD3 = n6e1Var.d()) != null) {
                                    int iIntValue6 = numD3.intValue();
                                    n6e1Var.q(iIntValue6, iIntValue6);
                                }
                            }
                        }
                        n6e1Var.p();
                        break;
                    case Maneuver.TYPE_STRAIGHT /* 36 */:
                        jbe1 jbe1Var4 = n6e1Var.e;
                        jbe1Var4.a = null;
                        af5 af5Var7 = n6e1Var.g;
                        String str7 = af5Var7.b;
                        String str8 = af5Var7.b;
                        if (str7.length() > 0) {
                            if (n6e1Var.f()) {
                                jbe1Var4.a = null;
                                if (str8.length() > 0 && (numD4 = n6e1Var.d()) != null) {
                                    int iIntValue7 = numD4.intValue();
                                    n6e1Var.q(iIntValue7, iIntValue7);
                                }
                            } else {
                                jbe1Var4.a = null;
                                if (str8.length() > 0 && (numE4 = n6e1Var.e()) != null) {
                                    int iIntValue8 = numE4.intValue();
                                    n6e1Var.q(iIntValue8, iIntValue8);
                                }
                            }
                        }
                        n6e1Var.p();
                        break;
                    case Maneuver.TYPE_FERRY_BOAT /* 37 */:
                        n6e1Var.j();
                        n6e1Var.p();
                        break;
                    case Maneuver.TYPE_FERRY_TRAIN /* 38 */:
                        n6e1Var.l();
                        n6e1Var.p();
                        break;
                    case Maneuver.TYPE_DESTINATION /* 39 */:
                        n6e1Var.o();
                        n6e1Var.p();
                        break;
                    case Maneuver.TYPE_DESTINATION_STRAIGHT /* 40 */:
                        n6e1Var.n();
                        n6e1Var.p();
                        break;
                    case Maneuver.TYPE_DESTINATION_LEFT /* 41 */:
                        n6e1Var.e.a = null;
                        if (n6e1Var.g.b.length() > 0) {
                            if (n6e1Var.f()) {
                                n6e1Var.o();
                            } else {
                                n6e1Var.n();
                            }
                        }
                        n6e1Var.p();
                        break;
                    case Maneuver.TYPE_DESTINATION_RIGHT /* 42 */:
                        n6e1Var.e.a = null;
                        if (n6e1Var.g.b.length() > 0) {
                            if (n6e1Var.f()) {
                                n6e1Var.n();
                            } else {
                                n6e1Var.o();
                            }
                        }
                        n6e1Var.p();
                        break;
                    case Maneuver.TYPE_ROUNDABOUT_ENTER_CW /* 43 */:
                        n6e1Var.e.a = null;
                        if (n6e1Var.g.b.length() > 0) {
                            long j3 = n6e1Var.f;
                            int i7 = nbe1.c;
                            int i8 = (int) (j3 & 4294967295L);
                            n6e1Var.q(i8, i8);
                        }
                        break;
                    case Maneuver.TYPE_ROUNDABOUT_EXIT_CW /* 44 */:
                        if (!q5e1Var.e) {
                            q5e1Var.a(Collections.singletonList(new qqh("\n", 1)));
                        } else {
                            l811Var.a = q5e1Var.a.x.b.r.b(q5e1Var.k);
                        }
                        break;
                    case Maneuver.TYPE_ROUNDABOUT_ENTER_CCW /* 45 */:
                        if (!q5e1Var.e) {
                            q5e1Var.a(Collections.singletonList(new qqh("\t", 1)));
                        } else {
                            l811Var.a = false;
                        }
                        break;
                    case Maneuver.TYPE_ROUNDABOUT_EXIT_CCW /* 46 */:
                        q5e1Var.h.a(c8e1.a(n6e1Var.h, n6e1Var.g, n6e1Var.f, 4));
                        hhh1 hhh1Var = q5e1Var.h;
                        ptf1 ptf1Var2 = hhh1Var.a;
                        if (ptf1Var2 == null || (ptf1Var = (ptf1) ptf1Var2.b) == null) {
                            c8e1Var = null;
                        } else {
                            hhh1Var.a = ptf1Var;
                            hhh1Var.c -= ((c8e1) ptf1Var2.c).a.b.length();
                            hhh1Var.b = new ptf1(hhh1Var.b, (c8e1) ptf1Var2.c, (byte) 17);
                            c8e1Var = (c8e1) ptf1Var.c;
                        }
                        if (c8e1Var != null) {
                            q5e1Var.j.invoke(c8e1Var);
                        }
                        break;
                    case Maneuver.TYPE_FERRY_BOAT_LEFT /* 47 */:
                        hhh1 hhh1Var2 = q5e1Var.h;
                        ptf1 ptf1Var3 = hhh1Var2.b;
                        if (ptf1Var3 != null) {
                            hhh1Var2.b = (ptf1) ptf1Var3.b;
                            c8e1 c8e1Var3 = (c8e1) ptf1Var3.c;
                            hhh1Var2.a = new ptf1(hhh1Var2.a, c8e1Var3, (byte) 17);
                            hhh1Var2.c = c8e1Var3.a.b.length() + hhh1Var2.c;
                            c8e1Var2 = (c8e1) ptf1Var3.c;
                        } else {
                            c8e1Var2 = null;
                        }
                        if (c8e1Var2 != null) {
                            q5e1Var.j.invoke(c8e1Var2);
                        }
                        break;
                    default:
                        eg.o();
                        return null;
                }
                return rih1Var;
            case 2:
                final x6e1 x6e1Var = (x6e1) obj6;
                final c9n c9nVar = (c9n) obj5;
                Context context = (Context) obj4;
                d3e1 d3e1Var = (d3e1) obj;
                d3e1Var.a();
                wdn0 wdn0Var = d3e1Var.a;
                n3e1 n3e1Var = n3e1.d;
                boolean z2 = (nbe1.d(x6e1Var.l().b) || !x6e1Var.h() || x6e1Var.g == null) ? false : true;
                final s6e1 s6e1Var = new s6e1(x6e1Var, null, (byte) 1);
                Function0 function0 = new Function0() { // from class: p.c7e1
                    public final Object invoke() {
                        byte b4 = b3;
                        rih1 rih1Var2 = rih1.a;
                        iu30 iu30Var2 = s6e1Var;
                        c9n c9nVar2 = c9nVar;
                        switch (b4) {
                            case 0:
                                fn31.T(c9nVar2, null, 4, new w73(iu30Var2, (lnm) null, (byte) 18), 1);
                                break;
                            default:
                                fn31.T(c9nVar2, null, 4, new w73(iu30Var2, (lnm) null, (byte) 19), 1);
                                break;
                        }
                        return rih1Var2;
                    }
                };
                Resources resources = context.getResources();
                byte b4 = 27;
                gub0 gub0Var = new gub0(function0, null, b4);
                if (z2) {
                    wdn0Var.b(new m3e1(obj3, resources.getString(R.string.cut), R.attr.actionModeCutDrawable, gub0Var));
                }
                n3e1 n3e1Var2 = n3e1.d;
                boolean z3 = (nbe1.d(x6e1Var.l().b) || x6e1Var.g == null) ? false : true;
                final s6e1 s6e1Var2 = new s6e1(x6e1Var, null, (byte) 2);
                Function0 function1 = new Function0() { // from class: p.c7e1
                    public final Object invoke() {
                        byte b5 = b3;
                        rih1 rih1Var2 = rih1.a;
                        iu30 iu30Var2 = s6e1Var2;
                        c9n c9nVar2 = c9nVar;
                        switch (b5) {
                            case 0:
                                fn31.T(c9nVar2, null, 4, new w73(iu30Var2, (lnm) null, (byte) 18), 1);
                                break;
                            default:
                                fn31.T(c9nVar2, null, 4, new w73(iu30Var2, (lnm) null, (byte) 19), 1);
                                break;
                        }
                        return rih1Var2;
                    }
                };
                Resources resources2 = context.getResources();
                gub0 gub0Var2 = new gub0(function1, null, b4);
                if (z3) {
                    wdn0Var.b(new m3e1(obj2, resources2.getString(R.string.copy), R.attr.actionModeCopyDrawable, gub0Var2));
                }
                n3e1 n3e1Var3 = n3e1.d;
                boolean z4 = x6e1Var.h() && ((Boolean) x6e1Var.w.getValue()).booleanValue() && x6e1Var.g != null;
                final s6e1 s6e1Var3 = new s6e1(x6e1Var, null, (byte) 3);
                Function0 function2 = new Function0() { // from class: p.c7e1
                    public final Object invoke() {
                        byte b5 = b3;
                        rih1 rih1Var2 = rih1.a;
                        iu30 iu30Var2 = s6e1Var3;
                        c9n c9nVar2 = c9nVar;
                        switch (b5) {
                            case 0:
                                fn31.T(c9nVar2, null, 4, new w73(iu30Var2, (lnm) null, (byte) 18), 1);
                                break;
                            default:
                                fn31.T(c9nVar2, null, 4, new w73(iu30Var2, (lnm) null, (byte) 19), 1);
                                break;
                        }
                        return rih1Var2;
                    }
                };
                Resources resources3 = context.getResources();
                gub0 gub0Var3 = new gub0(function2, null, b4);
                if (z4) {
                    wdn0Var.b(new m3e1(eko1.c, resources3.getString(R.string.paste), R.attr.actionModePasteDrawable, gub0Var3));
                }
                n3e1 n3e1Var4 = n3e1.d;
                boolean z5 = nbe1.e(x6e1Var.l().b) != x6e1Var.l().a.b.length();
                Function0 function3 = new Function0() { // from class: p.d7e1
                    public final Object invoke() {
                        byte b5 = b3;
                        rih1 rih1Var2 = rih1.a;
                        x6e1 x6e1Var2 = x6e1Var;
                        switch (b5) {
                            case 0:
                                return Boolean.valueOf(!x6e1Var2.A);
                            case 1:
                                c8e1 c8e1VarB = x6e1.b(x6e1Var2.l().a, e6p1.e(0, x6e1Var2.l().a.b.length()));
                                x6e1Var2.c.invoke(c8e1VarB);
                                long j4 = c8e1VarB.b;
                                x6e1Var2.v = new nbe1(j4);
                                x6e1Var2.t = c8e1.a(x6e1Var2.t, (af5) null, j4, 5);
                                x6e1Var2.e(true);
                                return rih1Var2;
                            default:
                                Function0 function4 = x6e1Var2.f;
                                if (function4 != null) {
                                    function4.invoke();
                                }
                                return rih1Var2;
                        }
                    }
                };
                final byte b5 = 1;
                Function0 function4 = new Function0() { // from class: p.d7e1
                    public final Object invoke() {
                        byte b6 = b5;
                        rih1 rih1Var2 = rih1.a;
                        x6e1 x6e1Var2 = x6e1Var;
                        switch (b6) {
                            case 0:
                                return Boolean.valueOf(!x6e1Var2.A);
                            case 1:
                                c8e1 c8e1VarB = x6e1.b(x6e1Var2.l().a, e6p1.e(0, x6e1Var2.l().a.b.length()));
                                x6e1Var2.c.invoke(c8e1VarB);
                                long j4 = c8e1VarB.b;
                                x6e1Var2.v = new nbe1(j4);
                                x6e1Var2.t = c8e1.a(x6e1Var2.t, (af5) null, j4, 5);
                                x6e1Var2.e(true);
                                return rih1Var2;
                            default:
                                Function0 function5 = x6e1Var2.f;
                                if (function5 != null) {
                                    function5.invoke();
                                }
                                return rih1Var2;
                        }
                    }
                };
                Resources resources4 = context.getResources();
                gub0 gub0Var4 = new gub0(function4, function3, b4);
                if (z5) {
                    wdn0Var.b(new m3e1(eko1.d, resources4.getString(R.string.selectAll), R.attr.actionModeSelectAllDrawable, gub0Var4));
                }
                if (Build.VERSION.SDK_INT >= 26) {
                    n3e1 n3e1Var5 = n3e1.d;
                    boolean z6 = x6e1Var.h() && nbe1.d(x6e1Var.l().b);
                    Function0 function5 = new Function0() { // from class: p.d7e1
                        public final Object invoke() {
                            byte b6 = b2;
                            rih1 rih1Var2 = rih1.a;
                            x6e1 x6e1Var2 = x6e1Var;
                            switch (b6) {
                                case 0:
                                    return Boolean.valueOf(!x6e1Var2.A);
                                case 1:
                                    c8e1 c8e1VarB = x6e1.b(x6e1Var2.l().a, e6p1.e(0, x6e1Var2.l().a.b.length()));
                                    x6e1Var2.c.invoke(c8e1VarB);
                                    long j4 = c8e1VarB.b;
                                    x6e1Var2.v = new nbe1(j4);
                                    x6e1Var2.t = c8e1.a(x6e1Var2.t, (af5) null, j4, 5);
                                    x6e1Var2.e(true);
                                    return rih1Var2;
                                default:
                                    Function0 function6 = x6e1Var2.f;
                                    if (function6 != null) {
                                        function6.invoke();
                                    }
                                    return rih1Var2;
                            }
                        }
                    };
                    Resources resources5 = context.getResources();
                    gub0 gub0Var5 = new gub0(function5, null, b4);
                    if (z6) {
                        wdn0Var.b(new m3e1(n3e1Var5.a, resources5.getString(n3e1Var5.b), n3e1Var5.c, gub0Var5));
                    }
                }
                d3e1Var.a();
                return rih1Var;
            case 3:
                o811 o811Var = (o811) obj6;
                r7e1 r7e1Var = (r7e1) obj5;
                o811Var.a = px51.a(r7e1Var.k().c());
                ((o811) obj4).a = 0L;
                r7e1Var.v(true);
                elb0 elb0VarQ = r7e1Var.q();
                r7e1Var.o.setValue(new Offset(elb0VarQ != null ? nho1.C(elb0VarQ) : 9205357640488583168L));
                r7e1Var.A(qr50.a, o811Var.a);
                return rih1Var;
            case 4:
                r7e1 r7e1Var2 = (r7e1) obj5;
                s4e1 s4e1Var = (s4e1) obj4;
                Offset offset = (Offset) obj;
                ((qga0) obj6).invoke();
                boolean z7 = r7e1Var2.i;
                aae1 aae1Var = r7e1Var2.b;
                if (z7 && r7e1Var2.h) {
                    if (!r7e1Var2.j) {
                        s4e1Var.invoke();
                        if (r7e1Var2.a.h().d.length() > 0) {
                            r7e1Var2.w(true);
                        }
                    }
                    r7e1Var2.x(ree1.a);
                    r7e1Var2.u(z4p1.y(aae1Var, aae1Var.a(offset.a)));
                }
                return rih1Var;
            case 5:
                r7e1 r7e1Var3 = (r7e1) obj6;
                final c9n c9nVar2 = (c9n) obj5;
                Context context2 = (Context) obj4;
                d3e1 d3e1Var2 = (d3e1) obj;
                d3e1Var2.a();
                wdn0 wdn0Var2 = d3e1Var2.a;
                n3e1 n3e1Var6 = n3e1.d;
                boolean z8 = !nbe1.d(r7e1Var3.a.h().e) && r7e1Var3.m();
                Object obj7 = null;
                final t7e1 t7e1Var = new t7e1(r7e1Var3, null, (byte) 0);
                final byte b6 = 1;
                Function0 function6 = new Function0() { // from class: p.c7e1
                    public final Object invoke() {
                        byte b7 = b6;
                        rih1 rih1Var2 = rih1.a;
                        iu30 iu30Var2 = t7e1Var;
                        c9n c9nVar3 = c9nVar2;
                        switch (b7) {
                            case 0:
                                fn31.T(c9nVar3, null, 4, new w73(iu30Var2, (lnm) null, (byte) 18), 1);
                                break;
                            default:
                                fn31.T(c9nVar3, null, 4, new w73(iu30Var2, (lnm) null, (byte) 19), 1);
                                break;
                        }
                        return rih1Var2;
                    }
                };
                Resources resources6 = context2.getResources();
                ree1 ree1Var = ree1.a;
                k95 k95Var = new k95((Object) function6, obj7, (Object) r7e1Var3, (Object) ree1Var, (byte) 8);
                if (z8) {
                    wdn0Var2.b(new m3e1(obj3, resources6.getString(R.string.cut), R.attr.actionModeCutDrawable, k95Var));
                }
                n3e1 n3e1Var7 = n3e1.d;
                boolean zD = nbe1.d(r7e1Var3.a.h().e);
                final byte b7 = 1;
                final t7e1 t7e1Var2 = new t7e1(r7e1Var3, null, (byte) 1);
                Function0 function7 = new Function0() { // from class: p.c7e1
                    public final Object invoke() {
                        byte b8 = b7;
                        rih1 rih1Var2 = rih1.a;
                        iu30 iu30Var2 = t7e1Var2;
                        c9n c9nVar3 = c9nVar2;
                        switch (b8) {
                            case 0:
                                fn31.T(c9nVar3, null, 4, new w73(iu30Var2, (lnm) null, (byte) 18), 1);
                                break;
                            default:
                                fn31.T(c9nVar3, null, 4, new w73(iu30Var2, (lnm) null, (byte) 19), 1);
                                break;
                        }
                        return rih1Var2;
                    }
                };
                Resources resources7 = context2.getResources();
                k95 k95Var2 = new k95((Object) function7, obj7, (Object) r7e1Var3, (Object) ree1Var, (byte) 8);
                if (!zD) {
                    wdn0Var2.b(new m3e1(obj2, resources7.getString(R.string.copy), R.attr.actionModeCopyDrawable, k95Var2));
                }
                n3e1 n3e1Var8 = n3e1.d;
                if (!r7e1Var3.m()) {
                    z = false;
                } else if (r7e1Var3.z.s()) {
                    z = true;
                } else {
                    s4e1 s4e1Var2 = r7e1Var3.n;
                    if (s4e1Var2 != null) {
                        s4e1Var2.invoke();
                    }
                    z = false;
                }
                final t7e1 t7e1Var3 = new t7e1(r7e1Var3, null, (byte) 2);
                final byte b8 = 1;
                Function0 function8 = new Function0() { // from class: p.c7e1
                    public final Object invoke() {
                        byte b9 = b8;
                        rih1 rih1Var2 = rih1.a;
                        iu30 iu30Var2 = t7e1Var3;
                        c9n c9nVar3 = c9nVar2;
                        switch (b9) {
                            case 0:
                                fn31.T(c9nVar3, null, 4, new w73(iu30Var2, (lnm) null, (byte) 18), 1);
                                break;
                            default:
                                fn31.T(c9nVar3, null, 4, new w73(iu30Var2, (lnm) null, (byte) 19), 1);
                                break;
                        }
                        return rih1Var2;
                    }
                };
                Resources resources8 = context2.getResources();
                k95 k95Var3 = new k95((Object) function8, obj7, (Object) r7e1Var3, (Object) ree1Var, (byte) 8);
                if (z) {
                    wdn0Var2.b(new m3e1(eko1.c, resources8.getString(R.string.paste), R.attr.actionModePasteDrawable, k95Var3));
                }
                n3e1 n3e1Var9 = n3e1.d;
                ggg1 ggg1Var = r7e1Var3.a;
                boolean z9 = nbe1.e(ggg1Var.h().e) != ggg1Var.h().d.length();
                nea neaVar = new nea(r7e1Var3, (byte) 7);
                nea neaVar2 = new nea(r7e1Var3, (byte) 8);
                Resources resources9 = context2.getResources();
                k95 k95Var4 = new k95((Object) neaVar2, (Object) neaVar, (Object) r7e1Var3, (Object) ree1.c, (byte) 8);
                if (z9) {
                    wdn0Var2.b(new m3e1(eko1.d, resources9.getString(R.string.selectAll), R.attr.actionModeSelectAllDrawable, k95Var4));
                }
                if (Build.VERSION.SDK_INT >= 26) {
                    n3e1 n3e1Var10 = n3e1.d;
                    boolean z10 = r7e1Var3.m() && nbe1.d(r7e1Var3.a.h().e);
                    nea neaVar3 = new nea(r7e1Var3, (byte) 9);
                    Resources resources10 = context2.getResources();
                    k95 k95Var5 = new k95((Object) neaVar3, obj7, (Object) r7e1Var3, (Object) ree1Var, (byte) 8);
                    if (z10) {
                        wdn0Var2.b(new m3e1(n3e1Var10.a, resources10.getString(n3e1Var10.b), n3e1Var10.c, k95Var5));
                    }
                }
                d3e1Var2.a();
                return rih1Var;
            case 6:
                p811 p811Var = (p811) obj4;
                fai0 fai0Var = (fai0) obj6;
                ymd0 ymd0Var = (ymd0) ((iu30) obj5).invoke(obj);
                Object obj8 = p811Var.a;
                if (obj8 != ymd0Var) {
                    if (obj8 != null) {
                        eai0 eai0Var = (eai0) fai0Var.Y.c((ymd0) obj8);
                        if (eai0Var != null) {
                            eai0Var.a.k(eai0Var);
                        }
                    }
                    p811Var.a = ymd0Var;
                    if (ymd0Var != null) {
                        fai0Var.n(ymd0Var, new es3(new w7d1((Object) fai0Var, (byte) 11), (byte) 9));
                    }
                }
                return rih1Var;
            case 7:
                jmr0 jmr0Var = (jmr0) obj6;
                jmr0 jmr0Var2 = (jmr0) obj5;
                jmr0 jmr0Var3 = (jmr0) obj4;
                ki7 ki7Var = (mi7) obj;
                if (ki7Var instanceof ki7) {
                    return jmr0Var != null ? new ki7(jmr0Var) : ki7Var;
                }
                if (!(ki7Var instanceof ji7)) {
                    return ki7Var;
                }
                ji7 ji7Var = (ji7) ki7Var;
                viz vizVar = ji7Var.b;
                if (vizVar.c instanceof NullRequestDataException) {
                    return jmr0Var2 != null ? new ji7(jmr0Var2, vizVar) : ji7Var;
                }
                return jmr0Var3 != null ? new ji7(jmr0Var3, vizVar) : ji7Var;
            case 8:
                iu30 iu30Var2 = (iu30) obj5;
                iu30 iu30Var3 = (iu30) obj6;
                iu30 iu30Var4 = (iu30) obj4;
                mi7 mi7Var = (mi7) obj;
                if (mi7Var instanceof ki7) {
                    if (iu30Var2 != null) {
                        iu30Var2.invoke(mi7Var);
                    }
                } else if (mi7Var instanceof li7) {
                    if (iu30Var3 != null) {
                        iu30Var3.invoke(mi7Var);
                    }
                } else if (mi7Var instanceof ji7) {
                    if (iu30Var4 != null) {
                        iu30Var4.invoke(mi7Var);
                    }
                } else if (!(mi7Var instanceof ii7)) {
                    eg.o();
                    return null;
                }
                return rih1Var;
            default:
                List list = (List) obj5;
                dxl1 dxl1Var = (dxl1) obj4;
                y341 y341Var = (y341) obj;
                d441 d441VarG1 = y341Var.g1((String) obj6);
                try {
                    Iterator it = list.iterator();
                    int i9 = 1;
                    while (it.hasNext()) {
                        d441VarG1.K(i9, (String) it.next());
                        i9++;
                    }
                    y36 y36Var = new y36(0);
                    y36 y36Var2 = new y36(0);
                    while (d441VarG1.f1()) {
                        String strP0 = d441VarG1.P0(0);
                        if (!y36Var.containsKey(strP0)) {
                            y36Var.put(strP0, new ArrayList());
                        }
                        String strP1 = d441VarG1.P0(0);
                        if (!y36Var2.containsKey(strP1)) {
                            y36Var2.put(strP1, new ArrayList());
                        }
                    }
                    d441VarG1.reset();
                    dxl1Var.b(y341Var, y36Var);
                    dxl1Var.a(y341Var, y36Var2);
                    ArrayList arrayList = new ArrayList();
                    while (d441VarG1.f1()) {
                        String strP2 = d441VarG1.P0(0);
                        wvl1 wvl1VarM = cwl1.M((int) d441VarG1.getLong(i6));
                        byte[] blob = d441VarG1.getBlob(2);
                        ewq ewqVar = ewq.b;
                        arrayList.add(new uwl1(strP2, wvl1VarM, o0c.A(blob), d441VarG1.getLong(14), d441VarG1.getLong(15), d441VarG1.getLong(16), new gjl(cwl1.q0(d441VarG1.getBlob(6)), cwl1.K((int) d441VarG1.getLong(5)), ((int) d441VarG1.getLong(i2)) != 0, ((int) d441VarG1.getLong(i)) != 0, ((int) d441VarG1.getLong(9)) != 0, ((int) d441VarG1.getLong(10)) != 0, d441VarG1.getLong(11), d441VarG1.getLong(12), cwl1.k(d441VarG1.getBlob(13))), (int) d441VarG1.getLong(i5), cwl1.J((int) d441VarG1.getLong(i3)), d441VarG1.getLong(18), d441VarG1.getLong(19), (int) d441VarG1.getLong(20), (int) d441VarG1.getLong(i4), d441VarG1.getLong(21), (int) d441VarG1.getLong(22), (List) sqg0.G(d441VarG1.P0(0), y36Var), (List) sqg0.G(d441VarG1.P0(0), y36Var2)));
                        i = 8;
                        i2 = 7;
                        i3 = 17;
                        i6 = 1;
                        i4 = 4;
                        i5 = 3;
                        break;
                    }
                    return arrayList;
                } finally {
                    d441VarG1.close();
                }
        }
    }

    public /* synthetic */ d5e1(Object obj, Object obj2, Object obj3, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    public /* synthetic */ d5e1(iu30 iu30Var, p811 p811Var, fai0 fai0Var) {
        this.a = (byte) 6;
        this.c = iu30Var;
        this.d = p811Var;
        this.b = fai0Var;
    }
}
