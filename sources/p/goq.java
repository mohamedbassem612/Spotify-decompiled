package p;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.media.metrics.LogSessionId;
import android.net.Uri;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.Space;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.appbar.AppBarLayout;
import com.spotify.campaigns.paragraph.view.ParagraphView;
import com.spotify.encoreconsumermobile.layout.headers.BehaviorRetainingAppBarLayout;
import com.spotify.encoremobile.component.buttons.EncoreButton;
import com.spotify.legacyglue.gluelib.components.toolbar.GlueToolbar;
import com.spotify.player.model.ContextTrack;
import com.spotify.wrapped.widget.v1.WrappedWidgetResources;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.functions.Function;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class goq implements cy81, Function, z57 {
    public final /* synthetic */ byte a;
    public final Object b;
    public Object c;
    public Object d;
    public Object e;
    public Object f;
    public final Object g;
    public Object h;

    public goq(ViewGroup viewGroup, LayoutInflater layoutInflater, iir iirVar, arp arpVar) {
        this.a = (byte) 12;
        k9r k9rVar = new k9r(layoutInflater.getContext(), viewGroup);
        this.g = k9rVar;
        ConstraintLayout constraintLayoutInflate = layoutInflater.inflate(2131624674, viewGroup, false);
        int i = 2131429890;
        ConstraintLayout constraintLayoutT = m5n1.t(constraintLayoutInflate, 2131429890);
        if (constraintLayoutT != null) {
            int i2 = 2131427840;
            if (((Space) m5n1.t(constraintLayoutT, 2131427840)) != null) {
                i2 = 2131427842;
                View viewT = m5n1.t(constraintLayoutT, 2131427842);
                if (viewT != null) {
                    i2 = 2131428203;
                    Group groupT = m5n1.t(constraintLayoutT, 2131428203);
                    if (groupT != null) {
                        i2 = 2131428501;
                        Button button = (Button) m5n1.t(constraintLayoutT, 2131428501);
                        if (button != null) {
                            i2 = 2131428714;
                            RecyclerView recyclerViewT = m5n1.t(constraintLayoutT, 2131428714);
                            if (recyclerViewT != null) {
                                i2 = 2131429061;
                                if (m5n1.t(constraintLayoutT, 2131429061) != null) {
                                    i2 = 2131429062;
                                    if (m5n1.t(constraintLayoutT, 2131429062) != null) {
                                        i2 = 2131429889;
                                        CheckBox checkBox = (CheckBox) m5n1.t(constraintLayoutT, 2131429889);
                                        if (checkBox != null) {
                                            ConstraintLayout constraintLayout = constraintLayoutT;
                                            lag lagVar = new lag(constraintLayout, viewT, groupT, button, recyclerViewT, checkBox);
                                            FrameLayout frameLayout = (FrameLayout) m5n1.t(constraintLayoutInflate, 2131431400);
                                            if (frameLayout != null) {
                                                ConstraintLayout constraintLayout2 = constraintLayoutInflate;
                                                h0y h0yVar = new h0y(constraintLayout2, lagVar, frameLayout);
                                                constraintLayout2.addView(((vw40) ((idd1) k9rVar.d).getValue()).a);
                                                this.b = h0yVar;
                                                lcb0 lcb0Var = new lcb0((hur) iirVar.b, new d7s(this, (byte) 1), (kn5) iirVar.c);
                                                this.c = lcb0Var;
                                                this.d = new idd1(new f7s(viewGroup, (byte) 1));
                                                this.e = new idd1(new f7s(viewGroup, (byte) 0));
                                                this.f = c6s.c;
                                                this.h = constraintLayout2;
                                                d7s d7sVar = new d7s(this, (byte) 0);
                                                gj5 gj5Var = (gj5) ((csg0) ((h72) arpVar.a.c).b).c.get();
                                                c8o.l(gj5Var);
                                                ((GlueToolbar) ((a1s) new iir(gj5Var, frameLayout, d7sVar).c).c).setTitle(frameLayout.getContext().getString(2131958181));
                                                constraintLayout.getContext();
                                                recyclerViewT.setLayoutManager(new LinearLayoutManager(1));
                                                recyclerViewT.setAdapter(lcb0Var);
                                                recyclerViewT.setItemAnimator((e611) null);
                                                checkBox.setText(constraintLayout.getContext().getString(2131958179));
                                                b2u.q(checkBox);
                                                checkBox.setOnClickListener(new e7s(this, (byte) 0));
                                                button.setOnClickListener(new e7s(this, (byte) 1));
                                                rwq0.s(recyclerViewT, new ut1(lagVar, ((ViewGroup.MarginLayoutParams) button.getLayoutParams()).bottomMargin, (byte) 5));
                                                return;
                                            }
                                            i = 2131431400;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            bhn0.i("Missing required view with ID: ".concat(constraintLayoutT.getResources().getResourceName(i2)));
            throw null;
        }
        bhn0.i("Missing required view with ID: ".concat(constraintLayoutInflate.getResources().getResourceName(i)));
        throw null;
    }

    public static String i(uv00 uv00Var, String str) {
        mq70 mq70Var;
        up70 up70VarA;
        mq70 mq70Var2;
        up70 up70VarA2;
        xkk1 xkk1Var = uv00Var.a(xkk1.class, str).b;
        vp70 vp70Var = vp70.c;
        Object obj = null;
        for (Object obj2 : f46.i0(new String[]{(xkk1Var == null || (mq70Var2 = xkk1Var.b) == null || (up70VarA2 = mq70Var2.a(vp70Var)) == null) ? null : up70VarA2.a.a, (xkk1Var == null || (mq70Var = xkk1Var.a) == null || (up70VarA = mq70Var.a(vp70Var)) == null) ? null : up70VarA.a.a})) {
            if (((String) obj2).length() > 0) {
                obj = obj2;
                break;
            }
        }
        String str2 = (String) obj;
        return str2 == null ? "" : str2;
    }

    public static baz0 q(ContextTrack contextTrack) {
        j380 j380VarMetadata = contextTrack.metadata();
        String strUri = contextTrack.uri();
        String strUid = contextTrack.uid();
        String str = (String) j380VarMetadata.get("title");
        String str2 = (String) j380VarMetadata.get("image_url");
        return new baz0(strUri, strUid, str, (str2 == null || str2.length() <= 0) ? null : str2, l4o1.P(contextTrack) ? l4o1.a0(contextTrack, "album_title") : l4o1.l(contextTrack), l4o1.J(contextTrack), l4o1.K(contextTrack), l4o1.L(contextTrack));
    }

    public j0v a() {
        String str = (String) this.g;
        Uri uri = (Uri) this.b;
        String str2 = (String) this.c;
        bg11 bg11Var = (ArrayList) this.d;
        if (bg11Var == null) {
            w280 w280Var = b380.b;
            bg11Var = bg11.e;
        }
        return new j0v(str, uri, str2, bg11Var, (byte[]) this.e, (String) this.f, (byte[]) this.h, (g0v) null, (h0v) null);
    }

    /* JADX WARN: Code duplicated, block: B:222:0x0a8a  */
    /* JADX WARN: Code duplicated, block: B:265:0x0bc6  */
    /* JADX WARN: Code duplicated, block: B:269:0x0bce  */
    /* JADX WARN: Code duplicated, block: B:271:0x0bd1  */
    /* JADX WARN: Code duplicated, block: B:272:0x0bd4  */
    /* JADX WARN: Code duplicated, block: B:278:0x0be8  */
    /* JADX WARN: Code duplicated, block: B:294:0x0c17  */
    /* JADX WARN: Code duplicated, block: B:295:0x0c1a  */
    /* JADX WARN: Code duplicated, block: B:302:0x0c39  */
    /* JADX WARN: Code duplicated, block: B:305:0x0c4f  */
    /* JADX WARN: Code duplicated, block: B:88:0x0865  */
    /* JADX WARN: Code duplicated, block: B:89:0x0868  */
    public Object apply(Object obj) {
        z9p z9pVar;
        z9p z9pVar2;
        LinkedHashMap linkedHashMap;
        kqi0 kqi0Var;
        q6z q6zVar;
        q6z q6zVar2;
        i1z i1zVar;
        r6z r6zVar;
        g281 g281Var;
        boolean z;
        String str;
        boolean z2;
        ok51 ok51Var;
        smc0 smc0VarK;
        String str2;
        int i;
        String str3;
        String str4;
        jhm jhmVarL;
        String str5;
        vfm wfmVar;
        q6z q6zVar3;
        g281 g281Var2;
        String str6;
        String str7;
        jhm jhmVarL2;
        vvu huzVar;
        byte b;
        byte b2 = this.a;
        o6x o6xVar = o6x.a;
        Object obj2 = this.b;
        Object obj3 = this.g;
        switch (b2) {
            case WrappedWidgetResources.WIDGET_SM_WIFI_URL_FIELD_NUMBER /* 25 */:
                Object[] objArr = (Object[]) obj;
                v1v v1vVar = (v1v) objArr[0];
                b6z b6zVar = (b6z) objArr[1];
                kk3 kk3Var = (kk3) objArr[2];
                Map map = (Map) objArr[3];
                int i2 = ((d6z) objArr[4]).a;
                boolean zBooleanValue = ((Boolean) objArr[5]).booleanValue();
                c221 c221Var = (c221) objArr[6];
                c6z c6zVar = (c6z) objArr[7];
                boolean zBooleanValue2 = ((Boolean) objArr[8]).booleanValue();
                boolean zBooleanValue3 = ((Boolean) objArr[9]).booleanValue();
                ktl ktlVar = (ktl) objArr[10];
                boolean zBooleanValue4 = ((Boolean) objArr[11]).booleanValue();
                e6z e6zVar = (e6z) objArr[12];
                boolean z3 = b6zVar.a;
                boolean z4 = b6zVar.b;
                boolean z5 = b6zVar.c;
                boolean z6 = e6zVar.a;
                List list = e6zVar.b;
                q6z q6zVar4 = (q6z) obj3;
                kqi0 kqi0Var2 = q6zVar4.A;
                String str8 = (String) obj2;
                i1z i1zVar2 = (i1z) this.c;
                boolean z7 = i1zVar2.u;
                d1z d1zVar = i1zVar2.B;
                LinkedHashMap linkedHashMap2 = (LinkedHashMap) this.d;
                lik1 lik1Var = (lik1) this.e;
                r6z r6zVar2 = (r6z) this.f;
                boolean z8 = r6zVar2.o;
                boolean z9 = r6zVar2.s;
                boolean z10 = r6zVar2.z;
                String str9 = r6zVar2.a;
                boolean z11 = r6zVar2.u;
                who0 who0Var = (who0) this.h;
                xlr xlrVar = q6zVar4.E;
                g281 g281Var3 = i1zVar2.z;
                boolean z12 = i1zVar2.m;
                String str10 = i1zVar2.a;
                if (g281Var3 != null) {
                    String str11 = g281Var3.e;
                    String str12 = g281Var3.d;
                    boolean z13 = zBooleanValue4;
                    String strB = i1zVar2.b(1);
                    a2q a2qVar = q6zVar4.g;
                    switch (a2qVar.a) {
                        case 0:
                            map = map;
                            z12 = z12;
                            str11 = str11;
                            str12 = str12;
                            i2q i2qVar = a2qVar.b;
                            teq teqVar = i2qVar.b;
                            f971 f971Var = (f971) teqVar.O3.get();
                            jl21 jl21Var = (jl21) teqVar.l2.get();
                            dc31 dc31VarS3 = teqVar.s3();
                            oh41 oh41Var = (oh41) teqVar.P3.get();
                            dg8 dg8VarE0 = teqVar.e0();
                            oy1 oy1VarX2 = teqVar.X2();
                            oy1 oy1VarE2 = teqVar.E2();
                            ke71 ke71VarA3 = teqVar.A3();
                            cab cabVarD0 = teqVar.d0();
                            t2 t2VarA0 = teqVar.a0();
                            j2q j2qVar = i2qVar.c;
                            r2a1 r2a1Var = new r2a1((dg30) j2qVar.c.f.a, (lua1) j2qVar.X2.get(), (byte) 8);
                            i6c i6cVarB0 = teqVar.b0();
                            in8 in8Var = new in8((lzn0) teqVar.i.get());
                            kr60 kr60VarG = teqVar.g();
                            yjq yjqVarJ0 = teqVar.J0();
                            k811 k811VarK3 = teqVar.k3();
                            daq daqVar = teqVar.d;
                            z9pVar = new z9p(f971Var, jl21Var, dc31VarS3, oh41Var, dg8VarE0, oy1VarX2, oy1VarE2, ke71VarA3, cabVarD0, t2VarA0, r2a1Var, i6cVarB0, in8Var, kr60VarG, yjqVarJ0, k811VarK3, new fad0((zxl) daqVar.R9.get(), (c7s) daqVar.Kq.get(), (byte) 18), new yge0((zxl) daqVar.R9.get(), (c7s) daqVar.Kq.get(), (byte) 13), teqVar.i(), teqVar.m3(), teqVar.n2(), teqVar.o2(), teqVar.n3(), new nuh0((lzn0) teqVar.i.get()), new xj1((lzn0) teqVar.i.get()), lik1Var, i1zVar2);
                            break;
                        case 1:
                            v5q v5qVar = a2qVar.b.c;
                            f971 f971Var2 = (f971) v5qVar.E5.get();
                            jl21 jl21Var2 = (jl21) v5qVar.s2.get();
                            dc31 dc31VarY0 = v5qVar.y0();
                            oh41 oh41Var2 = (oh41) v5qVar.M5.get();
                            dg8 dg8Var = new dg8((lzn0) v5qVar.U0.get(), (byte) 10);
                            oy1 oy1VarS0 = v5qVar.s0();
                            oy1 oy1VarO0 = v5qVar.o0();
                            ke71 ke71Var = new ke71((hqs) v5qVar.P5.get(), (y991) v5qVar.l1.get(), (byte) 22);
                            cab cabVarR = v5qVar.r();
                            t2 t2Var = new t2((lzn0) v5qVar.U0.get());
                            r2a1 r2a1Var2 = new r2a1((dg30) v5qVar.i.a, (lua1) v5qVar.R5.get(), (byte) 8);
                            i6c i6cVarP = v5qVar.p();
                            in8 in8Var2 = new in8((lzn0) v5qVar.U0.get());
                            kr60 kr60VarC = v5qVar.c();
                            dg30 dg30Var = (dg30) v5qVar.i.a;
                            daq daqVar2 = v5qVar.b;
                            z9pVar2 = new z9p(f971Var2, jl21Var2, dc31VarY0, oh41Var2, dg8Var, oy1VarS0, oy1VarO0, ke71Var, cabVarR, t2Var, r2a1Var2, i6cVarP, in8Var2, kr60VarC, new yjq((Object) dg30Var, daqVar2.f8.get(), v5qVar.S5.get(), v5qVar.F2.get(), v5qVar.T5.get(), (byte) 16), v5qVar.t0(), new fad0((zxl) daqVar2.R9.get(), (c7s) daqVar2.Kq.get(), (byte) 18), new yge0((zxl) daqVar2.R9.get(), (c7s) daqVar2.Kq.get(), (byte) 13), new eyh0((dg30) v5qVar.i.a, new dp5((pqc1) daqVar2.O8.get(), (byte) 9), (csc1) v5qVar.U5.get(), (byte) 20), v5qVar.u0(), v5qVar.h0(), v5qVar.i0(), v5qVar.v0(), new nuh0((lzn0) v5qVar.U0.get()), new xj1((lzn0) v5qVar.U0.get()), lik1Var, i1zVar2);
                            z9pVar = z9pVar2;
                            break;
                        case 2:
                            s7q s7qVar = a2qVar.b.d;
                            f971 f971Var3 = (f971) s7qVar.E3.get();
                            jl21 jl21Var3 = (jl21) s7qVar.G3.get();
                            dc31 dc31VarB4 = s7qVar.B4();
                            oh41 oh41Var3 = (oh41) s7qVar.H3.get();
                            dg8 dg8VarC0 = s7qVar.c0();
                            oy1 oy1VarC4 = s7qVar.c4();
                            oy1 oy1VarJ3 = s7qVar.J3();
                            ke71 ke71VarP4 = s7qVar.P4();
                            cab cabVarB0 = s7qVar.b0();
                            t2 t2VarW = s7qVar.W();
                            r2a1 r2a1Var3 = new r2a1((dg30) s7qVar.t.a, (lua1) s7qVar.u4.get(), (byte) 8);
                            i6c i6cVarX = s7qVar.X();
                            in8 in8VarA0 = s7qVar.a0();
                            kr60 kr60VarH = s7qVar.h();
                            dg30 dg30Var2 = (dg30) s7qVar.t.a;
                            daq daqVar3 = s7qVar.b;
                            z9pVar2 = new z9p(f971Var3, jl21Var3, dc31VarB4, oh41Var3, dg8VarC0, oy1VarC4, oy1VarJ3, ke71VarP4, cabVarB0, t2VarW, r2a1Var3, i6cVarX, in8VarA0, kr60VarH, new yjq((Object) dg30Var2, daqVar3.f8.get(), s7qVar.j3.get(), s7qVar.l3.get(), s7qVar.v4.get(), (byte) 16), s7qVar.i4(), new fad0((zxl) daqVar3.R9.get(), (c7s) daqVar3.Kq.get(), (byte) 18), new yge0((zxl) daqVar3.R9.get(), (c7s) daqVar3.Kq.get(), (byte) 13), new eyh0((dg30) s7qVar.t.a, new dp5((pqc1) daqVar3.O8.get(), (byte) 9), (csc1) s7qVar.w4.get(), (byte) 20), s7qVar.o4(), s7qVar.o3(), s7qVar.p3(), s7qVar.p4(), s7qVar.Z2(), new xj1((lzn0) s7qVar.U0.get()), lik1Var, i1zVar2);
                            z9pVar = z9pVar2;
                            break;
                        default:
                            teq teqVar2 = a2qVar.b.c;
                            f971 f971Var4 = (f971) teqVar2.O3.get();
                            jl21 jl21Var4 = (jl21) teqVar2.l2.get();
                            dc31 dc31VarS4 = teqVar2.s3();
                            oh41 oh41Var4 = (oh41) teqVar2.P3.get();
                            dg8 dg8VarE1 = teqVar2.e0();
                            oy1 oy1VarX3 = teqVar2.X2();
                            oy1 oy1VarE3 = teqVar2.E2();
                            ke71 ke71VarA4 = teqVar2.A3();
                            cab cabVarD1 = teqVar2.d0();
                            t2 t2VarA1 = teqVar2.a0();
                            yiq yiqVar = teqVar2.b;
                            r2a1 r2a1Var4 = new r2a1((dg30) yiqVar.b.f.a, (lua1) yiqVar.z.get(), (byte) 8);
                            i6c i6cVarB1 = teqVar2.b0();
                            in8 in8Var3 = new in8((lzn0) teqVar2.i.get());
                            kr60 kr60VarG2 = teqVar2.g();
                            yjq yjqVarJ1 = teqVar2.J0();
                            k811 k811VarK4 = teqVar2.k3();
                            daq daqVar4 = teqVar2.d;
                            z9pVar2 = new z9p(f971Var4, jl21Var4, dc31VarS4, oh41Var4, dg8VarE1, oy1VarX3, oy1VarE3, ke71VarA4, cabVarD1, t2VarA1, r2a1Var4, i6cVarB1, in8Var3, kr60VarG2, yjqVarJ1, k811VarK4, new fad0((zxl) daqVar4.R9.get(), (c7s) daqVar4.Kq.get(), (byte) 18), new yge0((zxl) daqVar4.R9.get(), (c7s) daqVar4.Kq.get(), (byte) 13), teqVar2.i(), teqVar2.m3(), teqVar2.n2(), teqVar2.o2(), teqVar2.n3(), new nuh0((lzn0) teqVar2.i.get()), new xj1((lzn0) teqVar2.i.get()), lik1Var, i1zVar2);
                            z9pVar = z9pVar2;
                            break;
                    }
                    nuh0 nuh0Var = (nuh0) z9pVar.x;
                    kr60 kr60Var = (kr60) z9pVar.n;
                    lik1 lik1Var2 = (lik1) z9pVar.z;
                    zwg zwgVarA = q6zVar4.j.a(lik1Var);
                    List listH = z6x.a;
                    Object obj4 = z9pVar.j;
                    if (z6) {
                        smc0 smc0VarN = k4p1.n();
                        q6zVar4.b(smc0VarN, z9pVar, r6zVar2);
                        if (z11 || z12) {
                            q6zVar3 = q6zVar4;
                        } else {
                            q6zVar3 = q6zVar4;
                            if (d1zVar == d1z.b || d1zVar == d1z.a) {
                                String str13 = (str8 == null || ihc1.y0(str8)) ? lik1Var.a : str8;
                                if (!z7 && (jhmVarL2 = zwgVarA.l(str10, str13, kk3Var)) != null) {
                                    smc0VarN.add(jhmVarL2);
                                }
                                if (str13 == null || ihc1.y0(str13)) {
                                    str13 = lik1Var.a;
                                }
                                smc0VarN.add(kr60Var.e(lik1Var2, str10, str13, true));
                                q6z.g(smc0VarN, z9pVar, i1zVar2, r6zVar2);
                            }
                        }
                        if (q6z.n(lik1Var, 
                        /*  JADX ERROR: Method code generation error
                            jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r73v0 p.i1z
                            	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
                            */
                        /*
                            Method dump skipped, instruction units count: 3394
                            To view this dump change 'Code comments level' option to 'DEBUG'
                        */
                        throw new UnsupportedOperationException("Method not decompiled: p.goq.apply(java.lang.Object):java.lang.Object");
                    }

                    public void b(tom tomVar, boolean z) {
                        boolean z2 = true;
                        n57.k(true, "Invalid resource ID provided: %s", new Object[]{2131954922});
                        lgy lgyVar = new lgy();
                        Integer num = (Integer) lgyVar.d;
                        if (num != null && num.intValue() == 0) {
                            z2 = false;
                        }
                        n57.k(z2, "Invalid resource ID provided: %s", new Object[]{num});
                        lgyVar.d = 2131954922;
                        lgyVar.a = false;
                        fn31.T((c9n) this.h, (q8n) this.f, 0, new kv1(this, tomVar, z, lgyVar, (lnm) null, (byte) 7), 2);
                    }

                    public void c(tom tomVar, boolean z) {
                        if (!z) {
                            b(tomVar, false);
                            return;
                        }
                        rm5 rm5Var = (rm5) this.c;
                        f2t f2tVar = new f2t(this, tomVar, (byte) 3);
                        Activity activity = (Activity) rm5Var.a;
                        String string = activity.getString(2131954919);
                        String string2 = activity.getString(R.string.cancel);
                        mw40 mw40VarT = yoi1.T(activity, activity.getString(2131954921), activity.getString(2131954920));
                        oad oadVar = new oad(f2tVar, (byte) 2);
                        mw40VarT.a = string;
                        mw40VarT.c = oadVar;
                        k6b k6bVar = new k6b((byte) 12);
                        mw40VarT.b = string2;
                        mw40VarT.d = k6bVar;
                        mw40VarT.e = false;
                        mw40VarT.b().b();
                    }

                    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                    public Object d(who0 who0Var, String str, onm onmVar) {
                        ery eryVar;
                        if (onmVar instanceof ery) {
                            eryVar = (ery) onmVar;
                            int i = eryVar.d;
                            if ((i & Integer.MIN_VALUE) != 0) {
                                eryVar.d = i - Integer.MIN_VALUE;
                            } else {
                                eryVar = new ery(this, onmVar);
                            }
                        } else {
                            eryVar = new ery(this, onmVar);
                        }
                        Object objJ = eryVar.b;
                        int i2 = eryVar.d;
                        boolean z = true;
                        if (i2 == 0) {
                            hm5.M(objJ);
                            ay8 ay8VarF = d3p1.F((rzq) this.f, (o3r) this.h, str);
                            afv afvVar = new afv(2, (lnm) null, (byte) 3);
                            eryVar.a = who0Var;
                            eryVar.d = 1;
                            objJ = b5p1.j(ay8VarF, afvVar, eryVar);
                            d9n d9nVar = d9n.a;
                            if (objJ == d9nVar) {
                                return d9nVar;
                            }
                        } else {
                            if (i2 != 1) {
                                eg.m("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            who0Var = eryVar.a;
                            hm5.M(objJ);
                        }
                        i1r i1rVar = (k1r) objJ;
                        if (!(i1rVar instanceof i1r)) {
                            return who0Var;
                        }
                        qxc0 qxc0Var = (qxc0) i1rVar.a;
                        if (!qxc0Var.h && !qxc0Var.t.i) {
                            z = false;
                        }
                        return who0.a(who0Var, z);
                    }

                    public b67 e(e4w e4wVar, Looper looper, a67 a67Var, y57 y57Var) {
                        o2i0 o2i0Var;
                        Context context = (Context) this.g;
                        o2i0 o2i0Var2 = (o2i0) this.d;
                        if (o2i0Var2 != null) {
                            o2i0Var = o2i0Var2;
                        } else {
                            e4wVar.getClass();
                            vyr vyrVar = new vyr();
                            synchronized (vyrVar) {
                                vyrVar.a = true;
                            }
                            synchronized (vyrVar) {
                                vyrVar.b = true;
                            }
                            o2i0 z7sVar = new z7s(context, vyrVar);
                            ((z7s) z7sVar).d = true;
                            o2i0Var = z7sVar;
                        }
                        return new fo00(context, e4wVar, o2i0Var, (dn3) this.b, y57Var.a, looper, a67Var, (rdd1) this.c, (m0g1) this.e, (LogSessionId) this.f, (h6s) ((v0d1) this.h).get());
                    }

                    public uz71 f() {
                        return (rm5) this.d;
                    }

                    public q9i0 g() {
                        q9i0 m231Var;
                        try {
                            m231Var = (q9i0) ((ynb0) this.e).get();
                        } catch (Throwable th) {
                            m231Var = new m231(th);
                        }
                        if (m231Var instanceof m231) {
                            m231Var = null;
                        }
                        q9i0 q9i0Var = m231Var;
                        if (q9i0Var == null) {
                            n57.s("DeleteContributionUseCaseImpl: MediaUploadChatServiceApi not available");
                        }
                        return q9i0Var;
                    }

                    public Context h() {
                        return (Context) this.f;
                    }

                    public w911 j() {
                        return (w911) this.g;
                    }

                    /* JADX WARN: Code duplicated, block: B:103:0x02ed  */
                    /* JADX WARN: Code duplicated, block: B:147:0x038f  */
                    /* JADX WARN: Code duplicated, block: B:207:0x0472  */
                    /* JADX WARN: Code duplicated, block: B:215:0x0231 A[SYNTHETIC] */
                    /* JADX WARN: Code duplicated, block: B:216:? A[RETURN, SYNTHETIC] */
                    /* JADX WARN: Code duplicated, block: B:217:? A[RETURN, SYNTHETIC] */
                    /* JADX WARN: Code duplicated, block: B:26:0x00f7  */
                    /* JADX WARN: Code duplicated, block: B:30:0x0135  */
                    /* JADX WARN: Code duplicated, block: B:33:0x0146  */
                    /* JADX WARN: Code duplicated, block: B:36:0x014d  */
                    /* JADX WARN: Code duplicated, block: B:38:0x0150  */
                    /* JADX WARN: Code duplicated, block: B:41:0x0196  */
                    /* JADX WARN: Code duplicated, block: B:45:0x01c9  */
                    /* JADX WARN: Code duplicated, block: B:48:0x01dd  */
                    /* JADX WARN: Code duplicated, block: B:51:0x01e4  */
                    /* JADX WARN: Code duplicated, block: B:53:0x01e7  */
                    /* JADX WARN: Code duplicated, block: B:55:0x01f0  */
                    /* JADX WARN: Code duplicated, block: B:60:0x0202  */
                    /* JADX WARN: Code duplicated, block: B:64:0x0211  */
                    /* JADX WARN: Code duplicated, block: B:67:0x0222  */
                    /* JADX WARN: Code duplicated, block: B:69:0x022e  */
                    /* JADX WARN: Code duplicated, block: B:73:0x0240  */
                    /* JADX WARN: Code duplicated, block: B:74:0x0244  */
                    /* JADX WARN: Code duplicated, block: B:77:0x0249  */
                    /* JADX WARN: Code duplicated, block: B:79:0x0253  */
                    /* JADX WARN: Code duplicated, block: B:83:0x0260 A[ADDED_TO_REGION] */
                    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
                    /* JADX WARN: Code duplicated, block: B:90:0x0294  */
                    /* JADX WARN: Code duplicated, block: B:93:0x029f  */
                    /* JADX WARN: Code duplicated, block: B:96:0x02c0  */
                    /* JADX WARN: Code duplicated, block: B:98:0x02d3  */
                    public Object k(String str, String str2, String str3, String str4, onm onmVar) {
                        fry fryVar;
                        String str5;
                        String str6;
                        String str7;
                        String str8;
                        String strZ;
                        Object objJ;
                        String str9;
                        String str10;
                        String str11;
                        String str12;
                        uv00 uv00Var;
                        jo70 jo70Var;
                        String str13;
                        Object objJ2;
                        String str14;
                        String str15;
                        String str16;
                        String str17;
                        String str18;
                        String str19;
                        uv00 uv00Var2;
                        io70 io70Var;
                        uv00 uv00Var3;
                        String str20;
                        String str21;
                        String str22;
                        uv00 uv00Var4;
                        String str23;
                        String str24;
                        uv00 uv00Var5;
                        qfd qfdVar;
                        int i;
                        Object obj;
                        boolean z;
                        vn71 vn71Var;
                        String str25;
                        String str26;
                        String str27;
                        boolean z2;
                        boolean z3;
                        Object obj2;
                        Object objA;
                        String str28;
                        String str29;
                        int i2;
                        boolean z4;
                        ArrayList arrayList;
                        Iterator it;
                        Object next;
                        who0 who0Var;
                        String str30;
                        who0 who0Var2;
                        Object objD;
                        boolean z5;
                        String str31;
                        uv00 uv00Var6;
                        String str32;
                        jo70 jo70Var2;
                        String str33;
                        String str34;
                        boolean z6;
                        ArrayList arrayList2;
                        int i3;
                        boolean zJ;
                        List list;
                        List list2;
                        String str35;
                        io70 io70Var2;
                        io70 io70Var3;
                        zu00 zu00Var = (uu00) this.b;
                        if (onmVar instanceof fry) {
                            fryVar = (fry) onmVar;
                            int i4 = fryVar.N0;
                            if ((i4 & Integer.MIN_VALUE) != 0) {
                                fryVar.N0 = i4 - Integer.MIN_VALUE;
                            } else {
                                fryVar = new fry(this, onmVar);
                            }
                        } else {
                            fryVar = new fry(this, onmVar);
                        }
                        fry fryVar2 = fryVar;
                        Object objA2 = fryVar2.Y;
                        int i5 = fryVar2.N0;
                        d9n d9nVar = d9n.a;
                        switch (i5) {
                            case 0:
                                hm5.M(objA2);
                                joo jooVar = (joo) this.c;
                                fryVar2.a = str;
                                str5 = str2;
                                fryVar2.b = str5;
                                str6 = str3;
                                fryVar2.c = str6;
                                fryVar2.d = str4;
                                fryVar2.N0 = 1;
                                objA2 = jooVar.a(fryVar2);
                                if (objA2 != d9nVar) {
                                    str7 = str;
                                    str8 = str4;
                                    Set set = s4b1.f;
                                    strZ = uic.C((String) objA2, null).z();
                                    if (strZ == null) {
                                        strZ = "";
                                    }
                                    Single singleDoOnError = zu00Var.b(new oi("EntitySegmentMenuSegmentMetadataLoader", false, new kov(str7, (byte) 15))).filter(pzs0.b1).firstOrError().doOnError(new f93(str7, (byte) 5));
                                    fryVar2.a = str7;
                                    fryVar2.b = str5;
                                    fryVar2.c = str6;
                                    fryVar2.d = str8;
                                    fryVar2.e = strZ;
                                    fryVar2.N0 = 2;
                                    objJ = fc11.j(singleDoOnError, fryVar2);
                                    if (objJ != d9nVar) {
                                        str9 = str7;
                                        str10 = str5;
                                        str11 = str8;
                                        str12 = strZ;
                                        objA2 = objJ;
                                        uv00Var = (uv00) objA2;
                                        jo70Var = uv00Var.a(jo70.class, str9).b;
                                        if (jo70Var != null || (io70Var = jo70Var.e) == null) {
                                            str13 = null;
                                        } else {
                                            str13 = io70Var.b;
                                        }
                                        if (str13 == null) {
                                            k220.f("No parent entity found for segment ".concat(str9));
                                            return null;
                                        }
                                        Single singleDoOnError2 = zu00Var.b(new oi("EntitySegmentMenuEntityMetadataLoader", false, new w3w(str13, this, (byte) 25))).filter(olj0.b1).firstOrError().doOnError(new f93(str13, (byte) 4));
                                        fryVar2.a = str9;
                                        fryVar2.b = str10;
                                        fryVar2.c = str6;
                                        fryVar2.d = str11;
                                        fryVar2.e = str12;
                                        fryVar2.f = uv00Var;
                                        fryVar2.g = str13;
                                        fryVar2.N0 = 3;
                                        objJ2 = fc11.j(singleDoOnError2, fryVar2);
                                        if (objJ2 != d9nVar) {
                                            str14 = str9;
                                            str15 = str10;
                                            str16 = str6;
                                            str17 = str11;
                                            str18 = str12;
                                            str19 = str13;
                                            uv00Var2 = uv00Var;
                                            objA2 = objJ2;
                                            uv00Var3 = (uv00) objA2;
                                            qns0 qns0Var = (qns0) this.g;
                                            List listSingletonList = Collections.singletonList(str19);
                                            fryVar2.a = str14;
                                            fryVar2.b = str15;
                                            fryVar2.c = str16;
                                            fryVar2.d = str17;
                                            fryVar2.e = str18;
                                            fryVar2.f = uv00Var2;
                                            fryVar2.g = str19;
                                            fryVar2.h = uv00Var3;
                                            fryVar2.N0 = 4;
                                            objA2 = qns0Var.a("EntitySegmentMenuMetadataLoader", listSingletonList, fryVar2, false);
                                            if (objA2 != d9nVar) {
                                                String str36 = str14;
                                                str20 = str18;
                                                str21 = str36;
                                                str22 = str15;
                                                uv00Var4 = uv00Var2;
                                                str23 = str16;
                                                str24 = str19;
                                                uv00Var5 = uv00Var3;
                                                qfdVar = (qfd) o7h.s0((List) objA2);
                                                if (qfdVar == null && qfdVar.b) {
                                                    i = 1;
                                                } else {
                                                    i = 0;
                                                }
                                                if (qfdVar != null) {
                                                    ArrayList arrayList3 = qfdVar.e;
                                                    obj = d9nVar;
                                                    z = qfdVar.c != 3 || arrayList3.contains(l131.a) || arrayList3.contains(l131.c);
                                                    vn71Var = uv00Var4.a(vn71.class, str21).b;
                                                    if (vn71Var != null) {
                                                        ArrayList arrayList4 = vn71Var.a;
                                                        arrayList = new ArrayList();
                                                        it = arrayList4.iterator();
                                                        while (it.hasNext()) {
                                                            Iterator it2 = it;
                                                            next = it2.next();
                                                            String str37 = str23;
                                                            if (next instanceof qc71) {
                                                                arrayList.add(next);
                                                            }
                                                            it = it2;
                                                            str23 = str37;
                                                        }
                                                        str25 = str23;
                                                        qc71 qc71Var = (qc71) o7h.s0(arrayList);
                                                        str26 = qc71Var != null ? qc71Var.a : null;
                                                        if (str22 != null) {
                                                            Set set2 = s4b1.f;
                                                            if ((uic.i(str22, s4b1.g) || uic.g(str22, blc0.Yc)) && str25 != null && !ihc1.y0(str25)) {
                                                                go41 go41Var = (go41) this.d;
                                                                fryVar2.a = str21;
                                                                fryVar2.b = str22;
                                                                fryVar2.c = null;
                                                                fryVar2.d = null;
                                                                fryVar2.e = str20;
                                                                fryVar2.f = uv00Var4;
                                                                fryVar2.g = str24;
                                                                fryVar2.h = uv00Var5;
                                                                fryVar2.i = str26;
                                                                fryVar2.t = i;
                                                                fryVar2.X = z;
                                                                fryVar2.N0 = 5;
                                                                z3 = z;
                                                                obj2 = obj;
                                                                objA = go41Var.a(str22, str21, str25, str17, fryVar2);
                                                                if (objA == obj2) {
                                                                    return obj2;
                                                                }
                                                                str28 = str21;
                                                                str29 = str22;
                                                                i2 = i;
                                                                z4 = z3;
                                                                str30 = str20;
                                                                who0Var2 = (who0) objA;
                                                                if (who0Var2 == null) {
                                                                    fryVar2.a = str28;
                                                                    fryVar2.b = null;
                                                                    fryVar2.c = null;
                                                                    fryVar2.d = null;
                                                                    fryVar2.e = str30;
                                                                    fryVar2.f = uv00Var4;
                                                                    fryVar2.g = str24;
                                                                    fryVar2.h = uv00Var5;
                                                                    fryVar2.i = str26;
                                                                    fryVar2.t = i2;
                                                                    fryVar2.X = z4;
                                                                    fryVar2.N0 = 6;
                                                                    objD = d(who0Var2, str29, fryVar2);
                                                                    if (objD == obj2) {
                                                                        return obj2;
                                                                    }
                                                                    objA2 = objD;
                                                                    z5 = z4;
                                                                    str31 = str24;
                                                                    uv00Var6 = uv00Var4;
                                                                    str32 = str26;
                                                                    z2 = z5;
                                                                    str27 = str32;
                                                                    str24 = str31;
                                                                    uv00Var4 = uv00Var6;
                                                                    who0Var = (who0) objA2;
                                                                    str20 = str30;
                                                                    str21 = str28;
                                                                    jo70Var2 = uv00Var5.a(jo70.class, str24).b;
                                                                    if (jo70Var2 != null || (str33 = jo70Var2.a) == null) {
                                                                        eg.m("Failed to retrieve name from IdentityTrait");
                                                                        return null;
                                                                    }
                                                                    jo70 jo70Var3 = uv00Var4.a(jo70.class, str21).b;
                                                                    if (jo70Var3 == null || (str34 = jo70Var3.a) == null) {
                                                                        eg.m("Failed to retrieve name from IdentityTrait");
                                                                        return null;
                                                                    }
                                                                    jo70 jo70Var4 = uv00Var5.a(jo70.class, str24).b;
                                                                    String str38 = (jo70Var4 == null || (io70Var3 = jo70Var4.e) == null) ? null : io70Var3.b;
                                                                    String strI = i(uv00Var5, str24);
                                                                    jo70 jo70Var5 = uv00Var5.a(jo70.class, str24).b;
                                                                    String str39 = (jo70Var5 == null || (io70Var2 = jo70Var5.e) == null) ? null : io70Var2.a;
                                                                    String strI2 = i(uv00Var4, str21);
                                                                    jo70 jo70Var6 = uv00Var4.a(jo70.class, str21).b;
                                                                    String str40 = jo70Var6 != null ? jo70Var6.c : null;
                                                                    jo70 jo70Var7 = uv00Var4.a(jo70.class, str21).b;
                                                                    String str41 = (jo70Var7 == null || (str35 = jo70Var7.b) == null) ? "" : str35;
                                                                    jo70 jo70Var8 = uv00Var4.a(jo70.class, str21).b;
                                                                    if (jo70Var8 == null || (list2 = jo70Var8.d) == null) {
                                                                        z6 = false;
                                                                    } else {
                                                                        List list3 = list2;
                                                                        if ((list3 instanceof Collection) && list3.isEmpty()) {
                                                                            z6 = false;
                                                                        } else {
                                                                            Iterator it3 = list3.iterator();
                                                                            while (true) {
                                                                                if (!it3.hasNext()) {
                                                                                    z6 = false;
                                                                                } else if (u890.j(((ho70) it3.next()).b, str20)) {
                                                                                    z6 = true;
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                    hzy hzyVar = uv00Var5.a(hzy.class, str24).b;
                                                                    int i6 = hzyVar != null ? hzyVar.a : 0;
                                                                    int i7 = i6 == 0 ? -1 : dry.b[l1d.C(i6)];
                                                                    int i8 = i7 != 1 ? i7 != 2 ? 3 : 2 : 1;
                                                                    jo70 jo70Var9 = uv00Var5.a(jo70.class, str24).b;
                                                                    if (jo70Var9 == null || (list = jo70Var9.d) == null) {
                                                                        arrayList2 = z6x.a;
                                                                    } else {
                                                                        List<ho70> list4 = list;
                                                                        arrayList2 = new ArrayList(q7h.U(list4, 10));
                                                                        for (ho70 ho70Var : list4) {
                                                                            arrayList2.add(new cry(ho70Var.b, ho70Var.a));
                                                                        }
                                                                    }
                                                                    ArrayList arrayList5 = arrayList2;
                                                                    mtl mtlVar = uv00Var5.a(mtl.class, str24).b;
                                                                    ktl ktlVar = mtlVar != null ? mtlVar.a : null;
                                                                    int i9 = ktlVar == null ? -1 : dry.a[ktlVar.ordinal()];
                                                                    if (i9 == -1) {
                                                                        i3 = 0;
                                                                    } else if (i9 == 1) {
                                                                        i3 = 1;
                                                                    } else if (i9 != 2) {
                                                                        if (i9 != 3) {
                                                                            eg.o();
                                                                            return null;
                                                                        }
                                                                        i3 = 0;
                                                                    } else {
                                                                        i3 = 2;
                                                                    }
                                                                    String strF = fno1.f(str24);
                                                                    if (strF != null) {
                                                                        dxc0 dxc0Var = uv00Var5.a(dxc0.class, strF).b;
                                                                        zJ = u890.j(dxc0Var != null ? Boolean.valueOf(fno1.j(dxc0Var)) : null, Boolean.TRUE);
                                                                    } else {
                                                                        zJ = false;
                                                                    }
                                                                    return new bry(str24, str33, str21, str34, strI, strI2, str41, str27, str38, str39, str40, z6, i8, z2, who0Var, arrayList5, i3, zJ);
                                                                }
                                                                z2 = z4;
                                                                str20 = str30;
                                                                str21 = str28;
                                                                str27 = str26;
                                                            }
                                                            who0Var = null;
                                                            jo70Var2 = uv00Var5.a(jo70.class, str24).b;
                                                            if (jo70Var2 != null) {
                                                            }
                                                            eg.m("Failed to retrieve name from IdentityTrait");
                                                            return null;
                                                        }
                                                        str27 = str26;
                                                        z2 = z;
                                                        who0Var = null;
                                                        jo70Var2 = uv00Var5.a(jo70.class, str24).b;
                                                        if (jo70Var2 != null) {
                                                        }
                                                        eg.m("Failed to retrieve name from IdentityTrait");
                                                        return null;
                                                    }
                                                    str25 = str23;
                                                    if (str22 != null) {
                                                        Set set3 = s4b1.f;
                                                        if (uic.i(str22, s4b1.g)) {
                                                            go41 go41Var2 = (go41) this.d;
                                                            fryVar2.a = str21;
                                                            fryVar2.b = str22;
                                                            fryVar2.c = null;
                                                            fryVar2.d = null;
                                                            fryVar2.e = str20;
                                                            fryVar2.f = uv00Var4;
                                                            fryVar2.g = str24;
                                                            fryVar2.h = uv00Var5;
                                                            fryVar2.i = str26;
                                                            fryVar2.t = i;
                                                            fryVar2.X = z;
                                                            fryVar2.N0 = 5;
                                                            z3 = z;
                                                            obj2 = obj;
                                                            objA = go41Var2.a(str22, str21, str25, str17, fryVar2);
                                                            if (objA == obj2) {
                                                                return obj2;
                                                            }
                                                            str28 = str21;
                                                            str29 = str22;
                                                            i2 = i;
                                                            z4 = z3;
                                                            str30 = str20;
                                                            who0Var2 = (who0) objA;
                                                            if (who0Var2 == null) {
                                                                z2 = z4;
                                                                str20 = str30;
                                                                str21 = str28;
                                                                str27 = str26;
                                                                who0Var = null;
                                                                jo70Var2 = uv00Var5.a(jo70.class, str24).b;
                                                                if (jo70Var2 != null) {
                                                                }
                                                                eg.m("Failed to retrieve name from IdentityTrait");
                                                                return null;
                                                            }
                                                            fryVar2.a = str28;
                                                            fryVar2.b = null;
                                                            fryVar2.c = null;
                                                            fryVar2.d = null;
                                                            fryVar2.e = str30;
                                                            fryVar2.f = uv00Var4;
                                                            fryVar2.g = str24;
                                                            fryVar2.h = uv00Var5;
                                                            fryVar2.i = str26;
                                                            fryVar2.t = i2;
                                                            fryVar2.X = z4;
                                                            fryVar2.N0 = 6;
                                                            objD = d(who0Var2, str29, fryVar2);
                                                            if (objD == obj2) {
                                                                return obj2;
                                                            }
                                                            objA2 = objD;
                                                            z5 = z4;
                                                            str31 = str24;
                                                            uv00Var6 = uv00Var4;
                                                            str32 = str26;
                                                            z2 = z5;
                                                            str27 = str32;
                                                            str24 = str31;
                                                            uv00Var4 = uv00Var6;
                                                            who0Var = (who0) objA2;
                                                            str20 = str30;
                                                            str21 = str28;
                                                            jo70Var2 = uv00Var5.a(jo70.class, str24).b;
                                                            if (jo70Var2 != null) {
                                                            }
                                                            eg.m("Failed to retrieve name from IdentityTrait");
                                                            return null;
                                                        }
                                                        go41 go41Var3 = (go41) this.d;
                                                        fryVar2.a = str21;
                                                        fryVar2.b = str22;
                                                        fryVar2.c = null;
                                                        fryVar2.d = null;
                                                        fryVar2.e = str20;
                                                        fryVar2.f = uv00Var4;
                                                        fryVar2.g = str24;
                                                        fryVar2.h = uv00Var5;
                                                        fryVar2.i = str26;
                                                        fryVar2.t = i;
                                                        fryVar2.X = z;
                                                        fryVar2.N0 = 5;
                                                        z3 = z;
                                                        obj2 = obj;
                                                        objA = go41Var3.a(str22, str21, str25, str17, fryVar2);
                                                        if (objA == obj2) {
                                                            return obj2;
                                                        }
                                                        str28 = str21;
                                                        str29 = str22;
                                                        i2 = i;
                                                        z4 = z3;
                                                        str30 = str20;
                                                        who0Var2 = (who0) objA;
                                                        if (who0Var2 == null) {
                                                            z2 = z4;
                                                            str20 = str30;
                                                            str21 = str28;
                                                            str27 = str26;
                                                            who0Var = null;
                                                            jo70Var2 = uv00Var5.a(jo70.class, str24).b;
                                                            if (jo70Var2 != null) {
                                                            }
                                                            eg.m("Failed to retrieve name from IdentityTrait");
                                                            return null;
                                                        }
                                                        fryVar2.a = str28;
                                                        fryVar2.b = null;
                                                        fryVar2.c = null;
                                                        fryVar2.d = null;
                                                        fryVar2.e = str30;
                                                        fryVar2.f = uv00Var4;
                                                        fryVar2.g = str24;
                                                        fryVar2.h = uv00Var5;
                                                        fryVar2.i = str26;
                                                        fryVar2.t = i2;
                                                        fryVar2.X = z4;
                                                        fryVar2.N0 = 6;
                                                        objD = d(who0Var2, str29, fryVar2);
                                                        if (objD == obj2) {
                                                            return obj2;
                                                        }
                                                        objA2 = objD;
                                                        z5 = z4;
                                                        str31 = str24;
                                                        uv00Var6 = uv00Var4;
                                                        str32 = str26;
                                                        z2 = z5;
                                                        str27 = str32;
                                                        str24 = str31;
                                                        uv00Var4 = uv00Var6;
                                                        who0Var = (who0) objA2;
                                                        str20 = str30;
                                                        str21 = str28;
                                                        jo70Var2 = uv00Var5.a(jo70.class, str24).b;
                                                        if (jo70Var2 != null) {
                                                        }
                                                        eg.m("Failed to retrieve name from IdentityTrait");
                                                        return null;
                                                    }
                                                    str27 = str26;
                                                    z2 = z;
                                                    who0Var = null;
                                                    jo70Var2 = uv00Var5.a(jo70.class, str24).b;
                                                    if (jo70Var2 != null) {
                                                    }
                                                    eg.m("Failed to retrieve name from IdentityTrait");
                                                    return null;
                                                }
                                                obj = d9nVar;
                                                vn71Var = uv00Var4.a(vn71.class, str21).b;
                                                if (vn71Var != null) {
                                                    ArrayList arrayList6 = vn71Var.a;
                                                    arrayList = new ArrayList();
                                                    it = arrayList6.iterator();
                                                    while (it.hasNext()) {
                                                        Iterator it4 = it;
                                                        next = it4.next();
                                                        String str310 = str23;
                                                        if (next instanceof qc71) {
                                                            arrayList.add(next);
                                                        }
                                                        it = it4;
                                                        str23 = str310;
                                                    }
                                                    str25 = str23;
                                                    qc71 qc71Var2 = (qc71) o7h.s0(arrayList);
                                                    if (qc71Var2 != null) {
                                                    }
                                                    if (str22 != null) {
                                                        Set set4 = s4b1.f;
                                                        if (uic.i(str22, s4b1.g)) {
                                                            go41 go41Var4 = (go41) this.d;
                                                            fryVar2.a = str21;
                                                            fryVar2.b = str22;
                                                            fryVar2.c = null;
                                                            fryVar2.d = null;
                                                            fryVar2.e = str20;
                                                            fryVar2.f = uv00Var4;
                                                            fryVar2.g = str24;
                                                            fryVar2.h = uv00Var5;
                                                            fryVar2.i = str26;
                                                            fryVar2.t = i;
                                                            fryVar2.X = z;
                                                            fryVar2.N0 = 5;
                                                            z3 = z;
                                                            obj2 = obj;
                                                            objA = go41Var4.a(str22, str21, str25, str17, fryVar2);
                                                            if (objA == obj2) {
                                                                return obj2;
                                                            }
                                                            str28 = str21;
                                                            str29 = str22;
                                                            i2 = i;
                                                            z4 = z3;
                                                            str30 = str20;
                                                            who0Var2 = (who0) objA;
                                                            if (who0Var2 == null) {
                                                                z2 = z4;
                                                                str20 = str30;
                                                                str21 = str28;
                                                                str27 = str26;
                                                                who0Var = null;
                                                                jo70Var2 = uv00Var5.a(jo70.class, str24).b;
                                                                if (jo70Var2 != null) {
                                                                }
                                                                eg.m("Failed to retrieve name from IdentityTrait");
                                                                return null;
                                                            }
                                                            fryVar2.a = str28;
                                                            fryVar2.b = null;
                                                            fryVar2.c = null;
                                                            fryVar2.d = null;
                                                            fryVar2.e = str30;
                                                            fryVar2.f = uv00Var4;
                                                            fryVar2.g = str24;
                                                            fryVar2.h = uv00Var5;
                                                            fryVar2.i = str26;
                                                            fryVar2.t = i2;
                                                            fryVar2.X = z4;
                                                            fryVar2.N0 = 6;
                                                            objD = d(who0Var2, str29, fryVar2);
                                                            if (objD == obj2) {
                                                                return obj2;
                                                            }
                                                            objA2 = objD;
                                                            z5 = z4;
                                                            str31 = str24;
                                                            uv00Var6 = uv00Var4;
                                                            str32 = str26;
                                                            z2 = z5;
                                                            str27 = str32;
                                                            str24 = str31;
                                                            uv00Var4 = uv00Var6;
                                                            who0Var = (who0) objA2;
                                                            str20 = str30;
                                                            str21 = str28;
                                                            jo70Var2 = uv00Var5.a(jo70.class, str24).b;
                                                            if (jo70Var2 != null) {
                                                            }
                                                            eg.m("Failed to retrieve name from IdentityTrait");
                                                            return null;
                                                        }
                                                        go41 go41Var5 = (go41) this.d;
                                                        fryVar2.a = str21;
                                                        fryVar2.b = str22;
                                                        fryVar2.c = null;
                                                        fryVar2.d = null;
                                                        fryVar2.e = str20;
                                                        fryVar2.f = uv00Var4;
                                                        fryVar2.g = str24;
                                                        fryVar2.h = uv00Var5;
                                                        fryVar2.i = str26;
                                                        fryVar2.t = i;
                                                        fryVar2.X = z;
                                                        fryVar2.N0 = 5;
                                                        z3 = z;
                                                        obj2 = obj;
                                                        objA = go41Var5.a(str22, str21, str25, str17, fryVar2);
                                                        if (objA == obj2) {
                                                            return obj2;
                                                        }
                                                        str28 = str21;
                                                        str29 = str22;
                                                        i2 = i;
                                                        z4 = z3;
                                                        str30 = str20;
                                                        who0Var2 = (who0) objA;
                                                        if (who0Var2 == null) {
                                                            z2 = z4;
                                                            str20 = str30;
                                                            str21 = str28;
                                                            str27 = str26;
                                                            who0Var = null;
                                                            jo70Var2 = uv00Var5.a(jo70.class, str24).b;
                                                            if (jo70Var2 != null) {
                                                            }
                                                            eg.m("Failed to retrieve name from IdentityTrait");
                                                            return null;
                                                        }
                                                        fryVar2.a = str28;
                                                        fryVar2.b = null;
                                                        fryVar2.c = null;
                                                        fryVar2.d = null;
                                                        fryVar2.e = str30;
                                                        fryVar2.f = uv00Var4;
                                                        fryVar2.g = str24;
                                                        fryVar2.h = uv00Var5;
                                                        fryVar2.i = str26;
                                                        fryVar2.t = i2;
                                                        fryVar2.X = z4;
                                                        fryVar2.N0 = 6;
                                                        objD = d(who0Var2, str29, fryVar2);
                                                        if (objD == obj2) {
                                                            return obj2;
                                                        }
                                                        objA2 = objD;
                                                        z5 = z4;
                                                        str31 = str24;
                                                        uv00Var6 = uv00Var4;
                                                        str32 = str26;
                                                        z2 = z5;
                                                        str27 = str32;
                                                        str24 = str31;
                                                        uv00Var4 = uv00Var6;
                                                        who0Var = (who0) objA2;
                                                        str20 = str30;
                                                        str21 = str28;
                                                        jo70Var2 = uv00Var5.a(jo70.class, str24).b;
                                                        if (jo70Var2 != null) {
                                                        }
                                                        eg.m("Failed to retrieve name from IdentityTrait");
                                                        return null;
                                                    }
                                                    str27 = str26;
                                                    z2 = z;
                                                    who0Var = null;
                                                    jo70Var2 = uv00Var5.a(jo70.class, str24).b;
                                                    if (jo70Var2 != null) {
                                                    }
                                                    eg.m("Failed to retrieve name from IdentityTrait");
                                                    return null;
                                                }
                                                str25 = str23;
                                                if (str22 != null) {
                                                    Set set5 = s4b1.f;
                                                    if (uic.i(str22, s4b1.g)) {
                                                        go41 go41Var6 = (go41) this.d;
                                                        fryVar2.a = str21;
                                                        fryVar2.b = str22;
                                                        fryVar2.c = null;
                                                        fryVar2.d = null;
                                                        fryVar2.e = str20;
                                                        fryVar2.f = uv00Var4;
                                                        fryVar2.g = str24;
                                                        fryVar2.h = uv00Var5;
                                                        fryVar2.i = str26;
                                                        fryVar2.t = i;
                                                        fryVar2.X = z;
                                                        fryVar2.N0 = 5;
                                                        z3 = z;
                                                        obj2 = obj;
                                                        objA = go41Var6.a(str22, str21, str25, str17, fryVar2);
                                                        if (objA == obj2) {
                                                            return obj2;
                                                        }
                                                        str28 = str21;
                                                        str29 = str22;
                                                        i2 = i;
                                                        z4 = z3;
                                                        str30 = str20;
                                                        who0Var2 = (who0) objA;
                                                        if (who0Var2 == null) {
                                                            z2 = z4;
                                                            str20 = str30;
                                                            str21 = str28;
                                                            str27 = str26;
                                                            who0Var = null;
                                                            jo70Var2 = uv00Var5.a(jo70.class, str24).b;
                                                            if (jo70Var2 != null) {
                                                            }
                                                            eg.m("Failed to retrieve name from IdentityTrait");
                                                            return null;
                                                        }
                                                        fryVar2.a = str28;
                                                        fryVar2.b = null;
                                                        fryVar2.c = null;
                                                        fryVar2.d = null;
                                                        fryVar2.e = str30;
                                                        fryVar2.f = uv00Var4;
                                                        fryVar2.g = str24;
                                                        fryVar2.h = uv00Var5;
                                                        fryVar2.i = str26;
                                                        fryVar2.t = i2;
                                                        fryVar2.X = z4;
                                                        fryVar2.N0 = 6;
                                                        objD = d(who0Var2, str29, fryVar2);
                                                        if (objD == obj2) {
                                                            return obj2;
                                                        }
                                                        objA2 = objD;
                                                        z5 = z4;
                                                        str31 = str24;
                                                        uv00Var6 = uv00Var4;
                                                        str32 = str26;
                                                        z2 = z5;
                                                        str27 = str32;
                                                        str24 = str31;
                                                        uv00Var4 = uv00Var6;
                                                        who0Var = (who0) objA2;
                                                        str20 = str30;
                                                        str21 = str28;
                                                        jo70Var2 = uv00Var5.a(jo70.class, str24).b;
                                                        if (jo70Var2 != null) {
                                                        }
                                                        eg.m("Failed to retrieve name from IdentityTrait");
                                                        return null;
                                                    }
                                                    go41 go41Var7 = (go41) this.d;
                                                    fryVar2.a = str21;
                                                    fryVar2.b = str22;
                                                    fryVar2.c = null;
                                                    fryVar2.d = null;
                                                    fryVar2.e = str20;
                                                    fryVar2.f = uv00Var4;
                                                    fryVar2.g = str24;
                                                    fryVar2.h = uv00Var5;
                                                    fryVar2.i = str26;
                                                    fryVar2.t = i;
                                                    fryVar2.X = z;
                                                    fryVar2.N0 = 5;
                                                    z3 = z;
                                                    obj2 = obj;
                                                    objA = go41Var7.a(str22, str21, str25, str17, fryVar2);
                                                    if (objA == obj2) {
                                                        return obj2;
                                                    }
                                                    str28 = str21;
                                                    str29 = str22;
                                                    i2 = i;
                                                    z4 = z3;
                                                    str30 = str20;
                                                    who0Var2 = (who0) objA;
                                                    if (who0Var2 == null) {
                                                        z2 = z4;
                                                        str20 = str30;
                                                        str21 = str28;
                                                        str27 = str26;
                                                        who0Var = null;
                                                        jo70Var2 = uv00Var5.a(jo70.class, str24).b;
                                                        if (jo70Var2 != null) {
                                                        }
                                                        eg.m("Failed to retrieve name from IdentityTrait");
                                                        return null;
                                                    }
                                                    fryVar2.a = str28;
                                                    fryVar2.b = null;
                                                    fryVar2.c = null;
                                                    fryVar2.d = null;
                                                    fryVar2.e = str30;
                                                    fryVar2.f = uv00Var4;
                                                    fryVar2.g = str24;
                                                    fryVar2.h = uv00Var5;
                                                    fryVar2.i = str26;
                                                    fryVar2.t = i2;
                                                    fryVar2.X = z4;
                                                    fryVar2.N0 = 6;
                                                    objD = d(who0Var2, str29, fryVar2);
                                                    if (objD == obj2) {
                                                        return obj2;
                                                    }
                                                    objA2 = objD;
                                                    z5 = z4;
                                                    str31 = str24;
                                                    uv00Var6 = uv00Var4;
                                                    str32 = str26;
                                                    z2 = z5;
                                                    str27 = str32;
                                                    str24 = str31;
                                                    uv00Var4 = uv00Var6;
                                                    who0Var = (who0) objA2;
                                                    str20 = str30;
                                                    str21 = str28;
                                                    jo70Var2 = uv00Var5.a(jo70.class, str24).b;
                                                    if (jo70Var2 != null) {
                                                    }
                                                    eg.m("Failed to retrieve name from IdentityTrait");
                                                    return null;
                                                }
                                                str27 = str26;
                                                z2 = z;
                                                who0Var = null;
                                                jo70Var2 = uv00Var5.a(jo70.class, str24).b;
                                                if (jo70Var2 != null) {
                                                }
                                                eg.m("Failed to retrieve name from IdentityTrait");
                                                return null;
                                            }
                                        }
                                    }
                                }
                                return d9nVar;
                            case 1:
                                str8 = fryVar2.d;
                                String str42 = fryVar2.c;
                                String str43 = fryVar2.b;
                                str7 = fryVar2.a;
                                hm5.M(objA2);
                                str6 = str42;
                                str5 = str43;
                                Set set6 = s4b1.f;
                                strZ = uic.C((String) objA2, null).z();
                                if (strZ == null) {
                                    strZ = "";
                                }
                                Single singleDoOnError3 = zu00Var.b(new oi("EntitySegmentMenuSegmentMetadataLoader", false, new kov(str7, (byte) 15))).filter(pzs0.b1).firstOrError().doOnError(new f93(str7, (byte) 5));
                                fryVar2.a = str7;
                                fryVar2.b = str5;
                                fryVar2.c = str6;
                                fryVar2.d = str8;
                                fryVar2.e = strZ;
                                fryVar2.N0 = 2;
                                objJ = fc11.j(singleDoOnError3, fryVar2);
                                if (objJ != d9nVar) {
                                    str9 = str7;
                                    str10 = str5;
                                    str11 = str8;
                                    str12 = strZ;
                                    objA2 = objJ;
                                    uv00Var = (uv00) objA2;
                                    jo70Var = uv00Var.a(jo70.class, str9).b;
                                    if (jo70Var != null) {
                                        str13 = null;
                                    } else {
                                        str13 = null;
                                    }
                                    if (str13 == null) {
                                        k220.f("No parent entity found for segment ".concat(str9));
                                        return null;
                                    }
                                    Single singleDoOnError4 = zu00Var.b(new oi("EntitySegmentMenuEntityMetadataLoader", false, new w3w(str13, this, (byte) 25))).filter(olj0.b1).firstOrError().doOnError(new f93(str13, (byte) 4));
                                    fryVar2.a = str9;
                                    fryVar2.b = str10;
                                    fryVar2.c = str6;
                                    fryVar2.d = str11;
                                    fryVar2.e = str12;
                                    fryVar2.f = uv00Var;
                                    fryVar2.g = str13;
                                    fryVar2.N0 = 3;
                                    objJ2 = fc11.j(singleDoOnError4, fryVar2);
                                    if (objJ2 != d9nVar) {
                                        str14 = str9;
                                        str15 = str10;
                                        str16 = str6;
                                        str17 = str11;
                                        str18 = str12;
                                        str19 = str13;
                                        uv00Var2 = uv00Var;
                                        objA2 = objJ2;
                                        uv00Var3 = (uv00) objA2;
                                        qns0 qns0Var2 = (qns0) this.g;
                                        List listSingletonList2 = Collections.singletonList(str19);
                                        fryVar2.a = str14;
                                        fryVar2.b = str15;
                                        fryVar2.c = str16;
                                        fryVar2.d = str17;
                                        fryVar2.e = str18;
                                        fryVar2.f = uv00Var2;
                                        fryVar2.g = str19;
                                        fryVar2.h = uv00Var3;
                                        fryVar2.N0 = 4;
                                        objA2 = qns0Var2.a("EntitySegmentMenuMetadataLoader", listSingletonList2, fryVar2, false);
                                        if (objA2 != d9nVar) {
                                            String str311 = str14;
                                            str20 = str18;
                                            str21 = str311;
                                            str22 = str15;
                                            uv00Var4 = uv00Var2;
                                            str23 = str16;
                                            str24 = str19;
                                            uv00Var5 = uv00Var3;
                                            qfdVar = (qfd) o7h.s0((List) objA2);
                                            if (qfdVar == null) {
                                                i = 0;
                                            } else {
                                                i = 0;
                                            }
                                            if (qfdVar != null) {
                                                ArrayList arrayList7 = qfdVar.e;
                                                obj = d9nVar;
                                                if (qfdVar.c != 3) {
                                                    break;
                                                }
                                                vn71Var = uv00Var4.a(vn71.class, str21).b;
                                                if (vn71Var != null) {
                                                    ArrayList arrayList8 = vn71Var.a;
                                                    arrayList = new ArrayList();
                                                    it = arrayList8.iterator();
                                                    while (it.hasNext()) {
                                                        Iterator it5 = it;
                                                        next = it5.next();
                                                        String str312 = str23;
                                                        if (next instanceof qc71) {
                                                            arrayList.add(next);
                                                        }
                                                        it = it5;
                                                        str23 = str312;
                                                    }
                                                    str25 = str23;
                                                    qc71 qc71Var3 = (qc71) o7h.s0(arrayList);
                                                    if (qc71Var3 != null) {
                                                    }
                                                    if (str22 != null) {
                                                        Set set7 = s4b1.f;
                                                        if (uic.i(str22, s4b1.g)) {
                                                            go41 go41Var8 = (go41) this.d;
                                                            fryVar2.a = str21;
                                                            fryVar2.b = str22;
                                                            fryVar2.c = null;
                                                            fryVar2.d = null;
                                                            fryVar2.e = str20;
                                                            fryVar2.f = uv00Var4;
                                                            fryVar2.g = str24;
                                                            fryVar2.h = uv00Var5;
                                                            fryVar2.i = str26;
                                                            fryVar2.t = i;
                                                            fryVar2.X = z;
                                                            fryVar2.N0 = 5;
                                                            z3 = z;
                                                            obj2 = obj;
                                                            objA = go41Var8.a(str22, str21, str25, str17, fryVar2);
                                                            if (objA == obj2) {
                                                                return obj2;
                                                            }
                                                            str28 = str21;
                                                            str29 = str22;
                                                            i2 = i;
                                                            z4 = z3;
                                                            str30 = str20;
                                                            who0Var2 = (who0) objA;
                                                            if (who0Var2 == null) {
                                                                z2 = z4;
                                                                str20 = str30;
                                                                str21 = str28;
                                                                str27 = str26;
                                                                who0Var = null;
                                                                jo70Var2 = uv00Var5.a(jo70.class, str24).b;
                                                                if (jo70Var2 != null) {
                                                                    break;
                                                                }
                                                                eg.m("Failed to retrieve name from IdentityTrait");
                                                                return null;
                                                            }
                                                            fryVar2.a = str28;
                                                            fryVar2.b = null;
                                                            fryVar2.c = null;
                                                            fryVar2.d = null;
                                                            fryVar2.e = str30;
                                                            fryVar2.f = uv00Var4;
                                                            fryVar2.g = str24;
                                                            fryVar2.h = uv00Var5;
                                                            fryVar2.i = str26;
                                                            fryVar2.t = i2;
                                                            fryVar2.X = z4;
                                                            fryVar2.N0 = 6;
                                                            objD = d(who0Var2, str29, fryVar2);
                                                            if (objD == obj2) {
                                                                return obj2;
                                                            }
                                                            objA2 = objD;
                                                            z5 = z4;
                                                            str31 = str24;
                                                            uv00Var6 = uv00Var4;
                                                            str32 = str26;
                                                            z2 = z5;
                                                            str27 = str32;
                                                            str24 = str31;
                                                            uv00Var4 = uv00Var6;
                                                            who0Var = (who0) objA2;
                                                            str20 = str30;
                                                            str21 = str28;
                                                            jo70Var2 = uv00Var5.a(jo70.class, str24).b;
                                                            if (jo70Var2 != null) {
                                                                break;
                                                            }
                                                            eg.m("Failed to retrieve name from IdentityTrait");
                                                            return null;
                                                        }
                                                        go41 go41Var9 = (go41) this.d;
                                                        fryVar2.a = str21;
                                                        fryVar2.b = str22;
                                                        fryVar2.c = null;
                                                        fryVar2.d = null;
                                                        fryVar2.e = str20;
                                                        fryVar2.f = uv00Var4;
                                                        fryVar2.g = str24;
                                                        fryVar2.h = uv00Var5;
                                                        fryVar2.i = str26;
                                                        fryVar2.t = i;
                                                        fryVar2.X = z;
                                                        fryVar2.N0 = 5;
                                                        z3 = z;
                                                        obj2 = obj;
                                                        objA = go41Var9.a(str22, str21, str25, str17, fryVar2);
                                                        if (objA == obj2) {
                                                            return obj2;
                                                        }
                                                        str28 = str21;
                                                        str29 = str22;
                                                        i2 = i;
                                                        z4 = z3;
                                                        str30 = str20;
                                                        who0Var2 = (who0) objA;
                                                        if (who0Var2 == null) {
                                                            z2 = z4;
                                                            str20 = str30;
                                                            str21 = str28;
                                                            str27 = str26;
                                                            who0Var = null;
                                                            jo70Var2 = uv00Var5.a(jo70.class, str24).b;
                                                            if (jo70Var2 != null) {
                                                                break;
                                                            }
                                                            eg.m("Failed to retrieve name from IdentityTrait");
                                                            return null;
                                                        }
                                                        fryVar2.a = str28;
                                                        fryVar2.b = null;
                                                        fryVar2.c = null;
                                                        fryVar2.d = null;
                                                        fryVar2.e = str30;
                                                        fryVar2.f = uv00Var4;
                                                        fryVar2.g = str24;
                                                        fryVar2.h = uv00Var5;
                                                        fryVar2.i = str26;
                                                        fryVar2.t = i2;
                                                        fryVar2.X = z4;
                                                        fryVar2.N0 = 6;
                                                        objD = d(who0Var2, str29, fryVar2);
                                                        if (objD == obj2) {
                                                            return obj2;
                                                        }
                                                        objA2 = objD;
                                                        z5 = z4;
                                                        str31 = str24;
                                                        uv00Var6 = uv00Var4;
                                                        str32 = str26;
                                                        z2 = z5;
                                                        str27 = str32;
                                                        str24 = str31;
                                                        uv00Var4 = uv00Var6;
                                                        who0Var = (who0) objA2;
                                                        str20 = str30;
                                                        str21 = str28;
                                                        jo70Var2 = uv00Var5.a(jo70.class, str24).b;
                                                        if (jo70Var2 != null) {
                                                            break;
                                                        }
                                                        eg.m("Failed to retrieve name from IdentityTrait");
                                                        return null;
                                                    }
                                                    str27 = str26;
                                                    z2 = z;
                                                    who0Var = null;
                                                    jo70Var2 = uv00Var5.a(jo70.class, str24).b;
                                                    if (jo70Var2 != null) {
                                                        break;
                                                    }
                                                    eg.m("Failed to retrieve name from IdentityTrait");
                                                    return null;
                                                }
                                                str25 = str23;
                                                if (str22 != null) {
                                                    Set set8 = s4b1.f;
                                                    if (uic.i(str22, s4b1.g)) {
                                                        go41 go41Var10 = (go41) this.d;
                                                        fryVar2.a = str21;
                                                        fryVar2.b = str22;
                                                        fryVar2.c = null;
                                                        fryVar2.d = null;
                                                        fryVar2.e = str20;
                                                        fryVar2.f = uv00Var4;
                                                        fryVar2.g = str24;
                                                        fryVar2.h = uv00Var5;
                                                        fryVar2.i = str26;
                                                        fryVar2.t = i;
                                                        fryVar2.X = z;
                                                        fryVar2.N0 = 5;
                                                        z3 = z;
                                                        obj2 = obj;
                                                        objA = go41Var10.a(str22, str21, str25, str17, fryVar2);
                                                        if (objA == obj2) {
                                                            return obj2;
                                                        }
                                                        str28 = str21;
                                                        str29 = str22;
                                                        i2 = i;
                                                        z4 = z3;
                                                        str30 = str20;
                                                        who0Var2 = (who0) objA;
                                                        if (who0Var2 == null) {
                                                            z2 = z4;
                                                            str20 = str30;
                                                            str21 = str28;
                                                            str27 = str26;
                                                            who0Var = null;
                                                            jo70Var2 = uv00Var5.a(jo70.class, str24).b;
                                                            if (jo70Var2 != null) {
                                                                break;
                                                            }
                                                            eg.m("Failed to retrieve name from IdentityTrait");
                                                            return null;
                                                        }
                                                        fryVar2.a = str28;
                                                        fryVar2.b = null;
                                                        fryVar2.c = null;
                                                        fryVar2.d = null;
                                                        fryVar2.e = str30;
                                                        fryVar2.f = uv00Var4;
                                                        fryVar2.g = str24;
                                                        fryVar2.h = uv00Var5;
                                                        fryVar2.i = str26;
                                                        fryVar2.t = i2;
                                                        fryVar2.X = z4;
                                                        fryVar2.N0 = 6;
                                                        objD = d(who0Var2, str29, fryVar2);
                                                        if (objD == obj2) {
                                                            return obj2;
                                                        }
                                                        objA2 = objD;
                                                        z5 = z4;
                                                        str31 = str24;
                                                        uv00Var6 = uv00Var4;
                                                        str32 = str26;
                                                        z2 = z5;
                                                        str27 = str32;
                                                        str24 = str31;
                                                        uv00Var4 = uv00Var6;
                                                        who0Var = (who0) objA2;
                                                        str20 = str30;
                                                        str21 = str28;
                                                        jo70Var2 = uv00Var5.a(jo70.class, str24).b;
                                                        if (jo70Var2 != null) {
                                                            break;
                                                        }
                                                        eg.m("Failed to retrieve name from IdentityTrait");
                                                        return null;
                                                    }
                                                    go41 go41Var11 = (go41) this.d;
                                                    fryVar2.a = str21;
                                                    fryVar2.b = str22;
                                                    fryVar2.c = null;
                                                    fryVar2.d = null;
                                                    fryVar2.e = str20;
                                                    fryVar2.f = uv00Var4;
                                                    fryVar2.g = str24;
                                                    fryVar2.h = uv00Var5;
                                                    fryVar2.i = str26;
                                                    fryVar2.t = i;
                                                    fryVar2.X = z;
                                                    fryVar2.N0 = 5;
                                                    z3 = z;
                                                    obj2 = obj;
                                                    objA = go41Var11.a(str22, str21, str25, str17, fryVar2);
                                                    if (objA == obj2) {
                                                        return obj2;
                                                    }
                                                    str28 = str21;
                                                    str29 = str22;
                                                    i2 = i;
                                                    z4 = z3;
                                                    str30 = str20;
                                                    who0Var2 = (who0) objA;
                                                    if (who0Var2 == null) {
                                                        z2 = z4;
                                                        str20 = str30;
                                                        str21 = str28;
                                                        str27 = str26;
                                                        who0Var = null;
                                                        jo70Var2 = uv00Var5.a(jo70.class, str24).b;
                                                        if (jo70Var2 != null) {
                                                            break;
                                                        }
                                                        eg.m("Failed to retrieve name from IdentityTrait");
                                                        return null;
                                                    }
                                                    fryVar2.a = str28;
                                                    fryVar2.b = null;
                                                    fryVar2.c = null;
                                                    fryVar2.d = null;
                                                    fryVar2.e = str30;
                                                    fryVar2.f = uv00Var4;
                                                    fryVar2.g = str24;
                                                    fryVar2.h = uv00Var5;
                                                    fryVar2.i = str26;
                                                    fryVar2.t = i2;
                                                    fryVar2.X = z4;
                                                    fryVar2.N0 = 6;
                                                    objD = d(who0Var2, str29, fryVar2);
                                                    if (objD == obj2) {
                                                        return obj2;
                                                    }
                                                    objA2 = objD;
                                                    z5 = z4;
                                                    str31 = str24;
                                                    uv00Var6 = uv00Var4;
                                                    str32 = str26;
                                                    z2 = z5;
                                                    str27 = str32;
                                                    str24 = str31;
                                                    uv00Var4 = uv00Var6;
                                                    who0Var = (who0) objA2;
                                                    str20 = str30;
                                                    str21 = str28;
                                                    jo70Var2 = uv00Var5.a(jo70.class, str24).b;
                                                    if (jo70Var2 != null) {
                                                        break;
                                                    }
                                                    eg.m("Failed to retrieve name from IdentityTrait");
                                                    return null;
                                                }
                                                str27 = str26;
                                                z2 = z;
                                                who0Var = null;
                                                jo70Var2 = uv00Var5.a(jo70.class, str24).b;
                                                if (jo70Var2 != null) {
                                                    break;
                                                }
                                                eg.m("Failed to retrieve name from IdentityTrait");
                                                return null;
                                            }
                                            obj = d9nVar;
                                            vn71Var = uv00Var4.a(vn71.class, str21).b;
                                            if (vn71Var != null) {
                                                ArrayList arrayList9 = vn71Var.a;
                                                arrayList = new ArrayList();
                                                it = arrayList9.iterator();
                                                while (it.hasNext()) {
                                                    Iterator it6 = it;
                                                    next = it6.next();
                                                    String str313 = str23;
                                                    if (next instanceof qc71) {
                                                        arrayList.add(next);
                                                    }
                                                    it = it6;
                                                    str23 = str313;
                                                }
                                                str25 = str23;
                                                qc71 qc71Var4 = (qc71) o7h.s0(arrayList);
                                                if (qc71Var4 != null) {
                                                }
                                                if (str22 != null) {
                                                    Set set9 = s4b1.f;
                                                    if (uic.i(str22, s4b1.g)) {
                                                        go41 go41Var12 = (go41) this.d;
                                                        fryVar2.a = str21;
                                                        fryVar2.b = str22;
                                                        fryVar2.c = null;
                                                        fryVar2.d = null;
                                                        fryVar2.e = str20;
                                                        fryVar2.f = uv00Var4;
                                                        fryVar2.g = str24;
                                                        fryVar2.h = uv00Var5;
                                                        fryVar2.i = str26;
                                                        fryVar2.t = i;
                                                        fryVar2.X = z;
                                                        fryVar2.N0 = 5;
                                                        z3 = z;
                                                        obj2 = obj;
                                                        objA = go41Var12.a(str22, str21, str25, str17, fryVar2);
                                                        if (objA == obj2) {
                                                            return obj2;
                                                        }
                                                        str28 = str21;
                                                        str29 = str22;
                                                        i2 = i;
                                                        z4 = z3;
                                                        str30 = str20;
                                                        who0Var2 = (who0) objA;
                                                        if (who0Var2 == null) {
                                                            z2 = z4;
                                                            str20 = str30;
                                                            str21 = str28;
                                                            str27 = str26;
                                                            who0Var = null;
                                                            jo70Var2 = uv00Var5.a(jo70.class, str24).b;
                                                            if (jo70Var2 != null) {
                                                                break;
                                                            }
                                                            eg.m("Failed to retrieve name from IdentityTrait");
                                                            return null;
                                                        }
                                                        fryVar2.a = str28;
                                                        fryVar2.b = null;
                                                        fryVar2.c = null;
                                                        fryVar2.d = null;
                                                        fryVar2.e = str30;
                                                        fryVar2.f = uv00Var4;
                                                        fryVar2.g = str24;
                                                        fryVar2.h = uv00Var5;
                                                        fryVar2.i = str26;
                                                        fryVar2.t = i2;
                                                        fryVar2.X = z4;
                                                        fryVar2.N0 = 6;
                                                        objD = d(who0Var2, str29, fryVar2);
                                                        if (objD == obj2) {
                                                            return obj2;
                                                        }
                                                        objA2 = objD;
                                                        z5 = z4;
                                                        str31 = str24;
                                                        uv00Var6 = uv00Var4;
                                                        str32 = str26;
                                                        z2 = z5;
                                                        str27 = str32;
                                                        str24 = str31;
                                                        uv00Var4 = uv00Var6;
                                                        who0Var = (who0) objA2;
                                                        str20 = str30;
                                                        str21 = str28;
                                                        jo70Var2 = uv00Var5.a(jo70.class, str24).b;
                                                        if (jo70Var2 != null) {
                                                            break;
                                                        }
                                                        eg.m("Failed to retrieve name from IdentityTrait");
                                                        return null;
                                                    }
                                                    go41 go41Var13 = (go41) this.d;
                                                    fryVar2.a = str21;
                                                    fryVar2.b = str22;
                                                    fryVar2.c = null;
                                                    fryVar2.d = null;
                                                    fryVar2.e = str20;
                                                    fryVar2.f = uv00Var4;
                                                    fryVar2.g = str24;
                                                    fryVar2.h = uv00Var5;
                                                    fryVar2.i = str26;
                                                    fryVar2.t = i;
                                                    fryVar2.X = z;
                                                    fryVar2.N0 = 5;
                                                    z3 = z;
                                                    obj2 = obj;
                                                    objA = go41Var13.a(str22, str21, str25, str17, fryVar2);
                                                    if (objA == obj2) {
                                                        return obj2;
                                                    }
                                                    str28 = str21;
                                                    str29 = str22;
                                                    i2 = i;
                                                    z4 = z3;
                                                    str30 = str20;
                                                    who0Var2 = (who0) objA;
                                                    if (who0Var2 == null) {
                                                        z2 = z4;
                                                        str20 = str30;
                                                        str21 = str28;
                                                        str27 = str26;
                                                        who0Var = null;
                                                        jo70Var2 = uv00Var5.a(jo70.class, str24).b;
                                                        if (jo70Var2 != null) {
                                                            break;
                                                        }
                                                        eg.m("Failed to retrieve name from IdentityTrait");
                                                        return null;
                                                    }
                                                    fryVar2.a = str28;
                                                    fryVar2.b = null;
                                                    fryVar2.c = null;
                                                    fryVar2.d = null;
                                                    fryVar2.e = str30;
                                                    fryVar2.f = uv00Var4;
                                                    fryVar2.g = str24;
                                                    fryVar2.h = uv00Var5;
                                                    fryVar2.i = str26;
                                                    fryVar2.t = i2;
                                                    fryVar2.X = z4;
                                                    fryVar2.N0 = 6;
                                                    objD = d(who0Var2, str29, fryVar2);
                                                    if (objD == obj2) {
                                                        return obj2;
                                                    }
                                                    objA2 = objD;
                                                    z5 = z4;
                                                    str31 = str24;
                                                    uv00Var6 = uv00Var4;
                                                    str32 = str26;
                                                    z2 = z5;
                                                    str27 = str32;
                                                    str24 = str31;
                                                    uv00Var4 = uv00Var6;
                                                    who0Var = (who0) objA2;
                                                    str20 = str30;
                                                    str21 = str28;
                                                    jo70Var2 = uv00Var5.a(jo70.class, str24).b;
                                                    if (jo70Var2 != null) {
                                                        break;
                                                    }
                                                    eg.m("Failed to retrieve name from IdentityTrait");
                                                    return null;
                                                }
                                                str27 = str26;
                                                z2 = z;
                                                who0Var = null;
                                                jo70Var2 = uv00Var5.a(jo70.class, str24).b;
                                                if (jo70Var2 != null) {
                                                    break;
                                                }
                                                eg.m("Failed to retrieve name from IdentityTrait");
                                                return null;
                                            }
                                            str25 = str23;
                                            if (str22 != null) {
                                                Set set10 = s4b1.f;
                                                if (uic.i(str22, s4b1.g)) {
                                                    go41 go41Var14 = (go41) this.d;
                                                    fryVar2.a = str21;
                                                    fryVar2.b = str22;
                                                    fryVar2.c = null;
                                                    fryVar2.d = null;
                                                    fryVar2.e = str20;
                                                    fryVar2.f = uv00Var4;
                                                    fryVar2.g = str24;
                                                    fryVar2.h = uv00Var5;
                                                    fryVar2.i = str26;
                                                    fryVar2.t = i;
                                                    fryVar2.X = z;
                                                    fryVar2.N0 = 5;
                                                    z3 = z;
                                                    obj2 = obj;
                                                    objA = go41Var14.a(str22, str21, str25, str17, fryVar2);
                                                    if (objA == obj2) {
                                                        return obj2;
                                                    }
                                                    str28 = str21;
                                                    str29 = str22;
                                                    i2 = i;
                                                    z4 = z3;
                                                    str30 = str20;
                                                    who0Var2 = (who0) objA;
                                                    if (who0Var2 == null) {
                                                        z2 = z4;
                                                        str20 = str30;
                                                        str21 = str28;
                                                        str27 = str26;
                                                        who0Var = null;
                                                        jo70Var2 = uv00Var5.a(jo70.class, str24).b;
                                                        if (jo70Var2 != null) {
                                                            break;
                                                        }
                                                        eg.m("Failed to retrieve name from IdentityTrait");
                                                        return null;
                                                    }
                                                    fryVar2.a = str28;
                                                    fryVar2.b = null;
                                                    fryVar2.c = null;
                                                    fryVar2.d = null;
                                                    fryVar2.e = str30;
                                                    fryVar2.f = uv00Var4;
                                                    fryVar2.g = str24;
                                                    fryVar2.h = uv00Var5;
                                                    fryVar2.i = str26;
                                                    fryVar2.t = i2;
                                                    fryVar2.X = z4;
                                                    fryVar2.N0 = 6;
                                                    objD = d(who0Var2, str29, fryVar2);
                                                    if (objD == obj2) {
                                                        return obj2;
                                                    }
                                                    objA2 = objD;
                                                    z5 = z4;
                                                    str31 = str24;
                                                    uv00Var6 = uv00Var4;
                                                    str32 = str26;
                                                    z2 = z5;
                                                    str27 = str32;
                                                    str24 = str31;
                                                    uv00Var4 = uv00Var6;
                                                    who0Var = (who0) objA2;
                                                    str20 = str30;
                                                    str21 = str28;
                                                    jo70Var2 = uv00Var5.a(jo70.class, str24).b;
                                                    if (jo70Var2 != null) {
                                                        break;
                                                    }
                                                    eg.m("Failed to retrieve name from IdentityTrait");
                                                    return null;
                                                }
                                                go41 go41Var15 = (go41) this.d;
                                                fryVar2.a = str21;
                                                fryVar2.b = str22;
                                                fryVar2.c = null;
                                                fryVar2.d = null;
                                                fryVar2.e = str20;
                                                fryVar2.f = uv00Var4;
                                                fryVar2.g = str24;
                                                fryVar2.h = uv00Var5;
                                                fryVar2.i = str26;
                                                fryVar2.t = i;
                                                fryVar2.X = z;
                                                fryVar2.N0 = 5;
                                                z3 = z;
                                                obj2 = obj;
                                                objA = go41Var15.a(str22, str21, str25, str17, fryVar2);
                                                if (objA == obj2) {
                                                    return obj2;
                                                }
                                                str28 = str21;
                                                str29 = str22;
                                                i2 = i;
                                                z4 = z3;
                                                str30 = str20;
                                                who0Var2 = (who0) objA;
                                                if (who0Var2 == null) {
                                                    z2 = z4;
                                                    str20 = str30;
                                                    str21 = str28;
                                                    str27 = str26;
                                                    who0Var = null;
                                                    jo70Var2 = uv00Var5.a(jo70.class, str24).b;
                                                    if (jo70Var2 != null) {
                                                        break;
                                                    }
                                                    eg.m("Failed to retrieve name from IdentityTrait");
                                                    return null;
                                                }
                                                fryVar2.a = str28;
                                                fryVar2.b = null;
                                                fryVar2.c = null;
                                                fryVar2.d = null;
                                                fryVar2.e = str30;
                                                fryVar2.f = uv00Var4;
                                                fryVar2.g = str24;
                                                fryVar2.h = uv00Var5;
                                                fryVar2.i = str26;
                                                fryVar2.t = i2;
                                                fryVar2.X = z4;
                                                fryVar2.N0 = 6;
                                                objD = d(who0Var2, str29, fryVar2);
                                                if (objD == obj2) {
                                                    return obj2;
                                                }
                                                objA2 = objD;
                                                z5 = z4;
                                                str31 = str24;
                                                uv00Var6 = uv00Var4;
                                                str32 = str26;
                                                z2 = z5;
                                                str27 = str32;
                                                str24 = str31;
                                                uv00Var4 = uv00Var6;
                                                who0Var = (who0) objA2;
                                                str20 = str30;
                                                str21 = str28;
                                                jo70Var2 = uv00Var5.a(jo70.class, str24).b;
                                                if (jo70Var2 != null) {
                                                    break;
                                                }
                                                eg.m("Failed to retrieve name from IdentityTrait");
                                                return null;
                                            }
                                            str27 = str26;
                                            z2 = z;
                                            who0Var = null;
                                            jo70Var2 = uv00Var5.a(jo70.class, str24).b;
                                            if (jo70Var2 != null) {
                                                break;
                                            }
                                            eg.m("Failed to retrieve name from IdentityTrait");
                                            return null;
                                        }
                                    }
                                }
                                return d9nVar;
                            case 2:
                                str12 = fryVar2.e;
                                str11 = fryVar2.d;
                                str6 = fryVar2.c;
                                str10 = fryVar2.b;
                                str9 = fryVar2.a;
                                hm5.M(objA2);
                                uv00Var = (uv00) objA2;
                                jo70Var = uv00Var.a(jo70.class, str9).b;
                                if (jo70Var != null) {
                                    str13 = null;
                                } else {
                                    str13 = null;
                                }
                                if (str13 == null) {
                                    k220.f("No parent entity found for segment ".concat(str9));
                                    return null;
                                }
                                Single singleDoOnError5 = zu00Var.b(new oi("EntitySegmentMenuEntityMetadataLoader", false, new w3w(str13, this, (byte) 25))).filter(olj0.b1).firstOrError().doOnError(new f93(str13, (byte) 4));
                                fryVar2.a = str9;
                                fryVar2.b = str10;
                                fryVar2.c = str6;
                                fryVar2.d = str11;
                                fryVar2.e = str12;
                                fryVar2.f = uv00Var;
                                fryVar2.g = str13;
                                fryVar2.N0 = 3;
                                objJ2 = fc11.j(singleDoOnError5, fryVar2);
                                if (objJ2 != d9nVar) {
                                    str14 = str9;
                                    str15 = str10;
                                    str16 = str6;
                                    str17 = str11;
                                    str18 = str12;
                                    str19 = str13;
                                    uv00Var2 = uv00Var;
                                    objA2 = objJ2;
                                    uv00Var3 = (uv00) objA2;
                                    qns0 qns0Var3 = (qns0) this.g;
                                    List listSingletonList3 = Collections.singletonList(str19);
                                    fryVar2.a = str14;
                                    fryVar2.b = str15;
                                    fryVar2.c = str16;
                                    fryVar2.d = str17;
                                    fryVar2.e = str18;
                                    fryVar2.f = uv00Var2;
                                    fryVar2.g = str19;
                                    fryVar2.h = uv00Var3;
                                    fryVar2.N0 = 4;
                                    objA2 = qns0Var3.a("EntitySegmentMenuMetadataLoader", listSingletonList3, fryVar2, false);
                                    if (objA2 != d9nVar) {
                                        String str314 = str14;
                                        str20 = str18;
                                        str21 = str314;
                                        str22 = str15;
                                        uv00Var4 = uv00Var2;
                                        str23 = str16;
                                        str24 = str19;
                                        uv00Var5 = uv00Var3;
                                        qfdVar = (qfd) o7h.s0((List) objA2);
                                        if (qfdVar == null) {
                                            i = 0;
                                        } else {
                                            i = 0;
                                        }
                                        if (qfdVar != null) {
                                            ArrayList arrayList10 = qfdVar.e;
                                            obj = d9nVar;
                                            if (qfdVar.c != 3) {
                                                break;
                                            }
                                            vn71Var = uv00Var4.a(vn71.class, str21).b;
                                            if (vn71Var != null) {
                                                ArrayList arrayList11 = vn71Var.a;
                                                arrayList = new ArrayList();
                                                it = arrayList11.iterator();
                                                while (it.hasNext()) {
                                                    Iterator it7 = it;
                                                    next = it7.next();
                                                    String str315 = str23;
                                                    if (next instanceof qc71) {
                                                        arrayList.add(next);
                                                    }
                                                    it = it7;
                                                    str23 = str315;
                                                }
                                                str25 = str23;
                                                qc71 qc71Var5 = (qc71) o7h.s0(arrayList);
                                                if (qc71Var5 != null) {
                                                }
                                                if (str22 != null) {
                                                    Set set11 = s4b1.f;
                                                    if (uic.i(str22, s4b1.g)) {
                                                        go41 go41Var16 = (go41) this.d;
                                                        fryVar2.a = str21;
                                                        fryVar2.b = str22;
                                                        fryVar2.c = null;
                                                        fryVar2.d = null;
                                                        fryVar2.e = str20;
                                                        fryVar2.f = uv00Var4;
                                                        fryVar2.g = str24;
                                                        fryVar2.h = uv00Var5;
                                                        fryVar2.i = str26;
                                                        fryVar2.t = i;
                                                        fryVar2.X = z;
                                                        fryVar2.N0 = 5;
                                                        z3 = z;
                                                        obj2 = obj;
                                                        objA = go41Var16.a(str22, str21, str25, str17, fryVar2);
                                                        if (objA == obj2) {
                                                            return obj2;
                                                        }
                                                        str28 = str21;
                                                        str29 = str22;
                                                        i2 = i;
                                                        z4 = z3;
                                                        str30 = str20;
                                                        who0Var2 = (who0) objA;
                                                        if (who0Var2 == null) {
                                                            z2 = z4;
                                                            str20 = str30;
                                                            str21 = str28;
                                                            str27 = str26;
                                                            who0Var = null;
                                                            jo70Var2 = uv00Var5.a(jo70.class, str24).b;
                                                            if (jo70Var2 != null) {
                                                                break;
                                                            }
                                                            eg.m("Failed to retrieve name from IdentityTrait");
                                                            return null;
                                                        }
                                                        fryVar2.a = str28;
                                                        fryVar2.b = null;
                                                        fryVar2.c = null;
                                                        fryVar2.d = null;
                                                        fryVar2.e = str30;
                                                        fryVar2.f = uv00Var4;
                                                        fryVar2.g = str24;
                                                        fryVar2.h = uv00Var5;
                                                        fryVar2.i = str26;
                                                        fryVar2.t = i2;
                                                        fryVar2.X = z4;
                                                        fryVar2.N0 = 6;
                                                        objD = d(who0Var2, str29, fryVar2);
                                                        if (objD == obj2) {
                                                            return obj2;
                                                        }
                                                        objA2 = objD;
                                                        z5 = z4;
                                                        str31 = str24;
                                                        uv00Var6 = uv00Var4;
                                                        str32 = str26;
                                                        z2 = z5;
                                                        str27 = str32;
                                                        str24 = str31;
                                                        uv00Var4 = uv00Var6;
                                                        who0Var = (who0) objA2;
                                                        str20 = str30;
                                                        str21 = str28;
                                                        jo70Var2 = uv00Var5.a(jo70.class, str24).b;
                                                        if (jo70Var2 != null) {
                                                            break;
                                                        }
                                                        eg.m("Failed to retrieve name from IdentityTrait");
                                                        return null;
                                                    }
                                                    go41 go41Var17 = (go41) this.d;
                                                    fryVar2.a = str21;
                                                    fryVar2.b = str22;
                                                    fryVar2.c = null;
                                                    fryVar2.d = null;
                                                    fryVar2.e = str20;
                                                    fryVar2.f = uv00Var4;
                                                    fryVar2.g = str24;
                                                    fryVar2.h = uv00Var5;
                                                    fryVar2.i = str26;
                                                    fryVar2.t = i;
                                                    fryVar2.X = z;
                                                    fryVar2.N0 = 5;
                                                    z3 = z;
                                                    obj2 = obj;
                                                    objA = go41Var17.a(str22, str21, str25, str17, fryVar2);
                                                    if (objA == obj2) {
                                                        return obj2;
                                                    }
                                                    str28 = str21;
                                                    str29 = str22;
                                                    i2 = i;
                                                    z4 = z3;
                                                    str30 = str20;
                                                    who0Var2 = (who0) objA;
                                                    if (who0Var2 == null) {
                                                        z2 = z4;
                                                        str20 = str30;
                                                        str21 = str28;
                                                        str27 = str26;
                                                        who0Var = null;
                                                        jo70Var2 = uv00Var5.a(jo70.class, str24).b;
                                                        if (jo70Var2 != null) {
                                                            break;
                                                        }
                                                        eg.m("Failed to retrieve name from IdentityTrait");
                                                        return null;
                                                    }
                                                    fryVar2.a = str28;
                                                    fryVar2.b = null;
                                                    fryVar2.c = null;
                                                    fryVar2.d = null;
                                                    fryVar2.e = str30;
                                                    fryVar2.f = uv00Var4;
                                                    fryVar2.g = str24;
                                                    fryVar2.h = uv00Var5;
                                                    fryVar2.i = str26;
                                                    fryVar2.t = i2;
                                                    fryVar2.X = z4;
                                                    fryVar2.N0 = 6;
                                                    objD = d(who0Var2, str29, fryVar2);
                                                    if (objD == obj2) {
                                                        return obj2;
                                                    }
                                                    objA2 = objD;
                                                    z5 = z4;
                                                    str31 = str24;
                                                    uv00Var6 = uv00Var4;
                                                    str32 = str26;
                                                    z2 = z5;
                                                    str27 = str32;
                                                    str24 = str31;
                                                    uv00Var4 = uv00Var6;
                                                    who0Var = (who0) objA2;
                                                    str20 = str30;
                                                    str21 = str28;
                                                    jo70Var2 = uv00Var5.a(jo70.class, str24).b;
                                                    if (jo70Var2 != null) {
                                                        break;
                                                    }
                                                    eg.m("Failed to retrieve name from IdentityTrait");
                                                    return null;
                                                }
                                                str27 = str26;
                                                z2 = z;
                                                who0Var = null;
                                                jo70Var2 = uv00Var5.a(jo70.class, str24).b;
                                                if (jo70Var2 != null) {
                                                    break;
                                                }
                                                eg.m("Failed to retrieve name from IdentityTrait");
                                                return null;
                                            }
                                            str25 = str23;
                                            if (str22 != null) {
                                                Set set12 = s4b1.f;
                                                if (uic.i(str22, s4b1.g)) {
                                                    go41 go41Var18 = (go41) this.d;
                                                    fryVar2.a = str21;
                                                    fryVar2.b = str22;
                                                    fryVar2.c = null;
                                                    fryVar2.d = null;
                                                    fryVar2.e = str20;
                                                    fryVar2.f = uv00Var4;
                                                    fryVar2.g = str24;
                                                    fryVar2.h = uv00Var5;
                                                    fryVar2.i = str26;
                                                    fryVar2.t = i;
                                                    fryVar2.X = z;
                                                    fryVar2.N0 = 5;
                                                    z3 = z;
                                                    obj2 = obj;
                                                    objA = go41Var18.a(str22, str21, str25, str17, fryVar2);
                                                    if (objA == obj2) {
                                                        return obj2;
                                                    }
                                                    str28 = str21;
                                                    str29 = str22;
                                                    i2 = i;
                                                    z4 = z3;
                                                    str30 = str20;
                                                    who0Var2 = (who0) objA;
                                                    if (who0Var2 == null) {
                                                        z2 = z4;
                                                        str20 = str30;
                                                        str21 = str28;
                                                        str27 = str26;
                                                        who0Var = null;
                                                        jo70Var2 = uv00Var5.a(jo70.class, str24).b;
                                                        if (jo70Var2 != null) {
                                                            break;
                                                        }
                                                        eg.m("Failed to retrieve name from IdentityTrait");
                                                        return null;
                                                    }
                                                    fryVar2.a = str28;
                                                    fryVar2.b = null;
                                                    fryVar2.c = null;
                                                    fryVar2.d = null;
                                                    fryVar2.e = str30;
                                                    fryVar2.f = uv00Var4;
                                                    fryVar2.g = str24;
                                                    fryVar2.h = uv00Var5;
                                                    fryVar2.i = str26;
                                                    fryVar2.t = i2;
                                                    fryVar2.X = z4;
                                                    fryVar2.N0 = 6;
                                                    objD = d(who0Var2, str29, fryVar2);
                                                    if (objD == obj2) {
                                                        return obj2;
                                                    }
                                                    objA2 = objD;
                                                    z5 = z4;
                                                    str31 = str24;
                                                    uv00Var6 = uv00Var4;
                                                    str32 = str26;
                                                    z2 = z5;
                                                    str27 = str32;
                                                    str24 = str31;
                                                    uv00Var4 = uv00Var6;
                                                    who0Var = (who0) objA2;
                                                    str20 = str30;
                                                    str21 = str28;
                                                    jo70Var2 = uv00Var5.a(jo70.class, str24).b;
                                                    if (jo70Var2 != null) {
                                                        break;
                                                    }
                                                    eg.m("Failed to retrieve name from IdentityTrait");
                                                    return null;
                                                }
                                                go41 go41Var19 = (go41) this.d;
                                                fryVar2.a = str21;
                                                fryVar2.b = str22;
                                                fryVar2.c = null;
                                                fryVar2.d = null;
                                                fryVar2.e = str20;
                                                fryVar2.f = uv00Var4;
                                                fryVar2.g = str24;
                                                fryVar2.h = uv00Var5;
                                                fryVar2.i = str26;
                                                fryVar2.t = i;
                                                fryVar2.X = z;
                                                fryVar2.N0 = 5;
                                                z3 = z;
                                                obj2 = obj;
                                                objA = go41Var19.a(str22, str21, str25, str17, fryVar2);
                                                if (objA == obj2) {
                                                    return obj2;
                                                }
                                                str28 = str21;
                                                str29 = str22;
                                                i2 = i;
                                                z4 = z3;
                                                str30 = str20;
                                                who0Var2 = (who0) objA;
                                                if (who0Var2 == null) {
                                                    z2 = z4;
                                                    str20 = str30;
                                                    str21 = str28;
                                                    str27 = str26;
                                                    who0Var = null;
                                                    jo70Var2 = uv00Var5.a(jo70.class, str24).b;
                                                    if (jo70Var2 != null) {
                                                        break;
                                                    }
                                                    eg.m("Failed to retrieve name from IdentityTrait");
                                                    return null;
                                                }
                                                fryVar2.a = str28;
                                                fryVar2.b = null;
                                                fryVar2.c = null;
                                                fryVar2.d = null;
                                                fryVar2.e = str30;
                                                fryVar2.f = uv00Var4;
                                                fryVar2.g = str24;
                                                fryVar2.h = uv00Var5;
                                                fryVar2.i = str26;
                                                fryVar2.t = i2;
                                                fryVar2.X = z4;
                                                fryVar2.N0 = 6;
                                                objD = d(who0Var2, str29, fryVar2);
                                                if (objD == obj2) {
                                                    return obj2;
                                                }
                                                objA2 = objD;
                                                z5 = z4;
                                                str31 = str24;
                                                uv00Var6 = uv00Var4;
                                                str32 = str26;
                                                z2 = z5;
                                                str27 = str32;
                                                str24 = str31;
                                                uv00Var4 = uv00Var6;
                                                who0Var = (who0) objA2;
                                                str20 = str30;
                                                str21 = str28;
                                                jo70Var2 = uv00Var5.a(jo70.class, str24).b;
                                                if (jo70Var2 != null) {
                                                    break;
                                                }
                                                eg.m("Failed to retrieve name from IdentityTrait");
                                                return null;
                                            }
                                            str27 = str26;
                                            z2 = z;
                                            who0Var = null;
                                            jo70Var2 = uv00Var5.a(jo70.class, str24).b;
                                            if (jo70Var2 != null) {
                                                break;
                                            }
                                            eg.m("Failed to retrieve name from IdentityTrait");
                                            return null;
                                        }
                                        obj = d9nVar;
                                        vn71Var = uv00Var4.a(vn71.class, str21).b;
                                        if (vn71Var != null) {
                                            ArrayList arrayList12 = vn71Var.a;
                                            arrayList = new ArrayList();
                                            it = arrayList12.iterator();
                                            while (it.hasNext()) {
                                                Iterator it8 = it;
                                                next = it8.next();
                                                String str316 = str23;
                                                if (next instanceof qc71) {
                                                    arrayList.add(next);
                                                }
                                                it = it8;
                                                str23 = str316;
                                            }
                                            str25 = str23;
                                            qc71 qc71Var6 = (qc71) o7h.s0(arrayList);
                                            if (qc71Var6 != null) {
                                            }
                                            if (str22 != null) {
                                                Set set13 = s4b1.f;
                                                if (uic.i(str22, s4b1.g)) {
                                                    go41 go41Var110 = (go41) this.d;
                                                    fryVar2.a = str21;
                                                    fryVar2.b = str22;
                                                    fryVar2.c = null;
                                                    fryVar2.d = null;
                                                    fryVar2.e = str20;
                                                    fryVar2.f = uv00Var4;
                                                    fryVar2.g = str24;
                                                    fryVar2.h = uv00Var5;
                                                    fryVar2.i = str26;
                                                    fryVar2.t = i;
                                                    fryVar2.X = z;
                                                    fryVar2.N0 = 5;
                                                    z3 = z;
                                                    obj2 = obj;
                                                    objA = go41Var110.a(str22, str21, str25, str17, fryVar2);
                                                    if (objA == obj2) {
                                                        return obj2;
                                                    }
                                                    str28 = str21;
                                                    str29 = str22;
                                                    i2 = i;
                                                    z4 = z3;
                                                    str30 = str20;
                                                    who0Var2 = (who0) objA;
                                                    if (who0Var2 == null) {
                                                        z2 = z4;
                                                        str20 = str30;
                                                        str21 = str28;
                                                        str27 = str26;
                                                        who0Var = null;
                                                        jo70Var2 = uv00Var5.a(jo70.class, str24).b;
                                                        if (jo70Var2 != null) {
                                                            break;
                                                        }
                                                        eg.m("Failed to retrieve name from IdentityTrait");
                                                        return null;
                                                    }
                                                    fryVar2.a = str28;
                                                    fryVar2.b = null;
                                                    fryVar2.c = null;
                                                    fryVar2.d = null;
                                                    fryVar2.e = str30;
                                                    fryVar2.f = uv00Var4;
                                                    fryVar2.g = str24;
                                                    fryVar2.h = uv00Var5;
                                                    fryVar2.i = str26;
                                                    fryVar2.t = i2;
                                                    fryVar2.X = z4;
                                                    fryVar2.N0 = 6;
                                                    objD = d(who0Var2, str29, fryVar2);
                                                    if (objD == obj2) {
                                                        return obj2;
                                                    }
                                                    objA2 = objD;
                                                    z5 = z4;
                                                    str31 = str24;
                                                    uv00Var6 = uv00Var4;
                                                    str32 = str26;
                                                    z2 = z5;
                                                    str27 = str32;
                                                    str24 = str31;
                                                    uv00Var4 = uv00Var6;
                                                    who0Var = (who0) objA2;
                                                    str20 = str30;
                                                    str21 = str28;
                                                    jo70Var2 = uv00Var5.a(jo70.class, str24).b;
                                                    if (jo70Var2 != null) {
                                                        break;
                                                    }
                                                    eg.m("Failed to retrieve name from IdentityTrait");
                                                    return null;
                                                }
                                                go41 go41Var111 = (go41) this.d;
                                                fryVar2.a = str21;
                                                fryVar2.b = str22;
                                                fryVar2.c = null;
                                                fryVar2.d = null;
                                                fryVar2.e = str20;
                                                fryVar2.f = uv00Var4;
                                                fryVar2.g = str24;
                                                fryVar2.h = uv00Var5;
                                                fryVar2.i = str26;
                                                fryVar2.t = i;
                                                fryVar2.X = z;
                                                fryVar2.N0 = 5;
                                                z3 = z;
                                                obj2 = obj;
                                                objA = go41Var111.a(str22, str21, str25, str17, fryVar2);
                                                if (objA == obj2) {
                                                    return obj2;
                                                }
                                                str28 = str21;
                                                str29 = str22;
                                                i2 = i;
                                                z4 = z3;
                                                str30 = str20;
                                                who0Var2 = (who0) objA;
                                                if (who0Var2 == null) {
                                                    z2 = z4;
                                                    str20 = str30;
                                                    str21 = str28;
                                                    str27 = str26;
                                                    who0Var = null;
                                                    jo70Var2 = uv00Var5.a(jo70.class, str24).b;
                                                    if (jo70Var2 != null) {
                                                        break;
                                                    }
                                                    eg.m("Failed to retrieve name from IdentityTrait");
                                                    return null;
                                                }
                                                fryVar2.a = str28;
                                                fryVar2.b = null;
                                                fryVar2.c = null;
                                                fryVar2.d = null;
                                                fryVar2.e = str30;
                                                fryVar2.f = uv00Var4;
                                                fryVar2.g = str24;
                                                fryVar2.h = uv00Var5;
                                                fryVar2.i = str26;
                                                fryVar2.t = i2;
                                                fryVar2.X = z4;
                                                fryVar2.N0 = 6;
                                                objD = d(who0Var2, str29, fryVar2);
                                                if (objD == obj2) {
                                                    return obj2;
                                                }
                                                objA2 = objD;
                                                z5 = z4;
                                                str31 = str24;
                                                uv00Var6 = uv00Var4;
                                                str32 = str26;
                                                z2 = z5;
                                                str27 = str32;
                                                str24 = str31;
                                                uv00Var4 = uv00Var6;
                                                who0Var = (who0) objA2;
                                                str20 = str30;
                                                str21 = str28;
                                                jo70Var2 = uv00Var5.a(jo70.class, str24).b;
                                                if (jo70Var2 != null) {
                                                    break;
                                                }
                                                eg.m("Failed to retrieve name from IdentityTrait");
                                                return null;
                                            }
                                            str27 = str26;
                                            z2 = z;
                                            who0Var = null;
                                            jo70Var2 = uv00Var5.a(jo70.class, str24).b;
                                            if (jo70Var2 != null) {
                                                break;
                                            }
                                            eg.m("Failed to retrieve name from IdentityTrait");
                                            return null;
                                        }
                                        str25 = str23;
                                        if (str22 != null) {
                                            Set set14 = s4b1.f;
                                            if (uic.i(str22, s4b1.g)) {
                                                go41 go41Var112 = (go41) this.d;
                                                fryVar2.a = str21;
                                                fryVar2.b = str22;
                                                fryVar2.c = null;
                                                fryVar2.d = null;
                                                fryVar2.e = str20;
                                                fryVar2.f = uv00Var4;
                                                fryVar2.g = str24;
                                                fryVar2.h = uv00Var5;
                                                fryVar2.i = str26;
                                                fryVar2.t = i;
                                                fryVar2.X = z;
                                                fryVar2.N0 = 5;
                                                z3 = z;
                                                obj2 = obj;
                                                objA = go41Var112.a(str22, str21, str25, str17, fryVar2);
                                                if (objA == obj2) {
                                                    return obj2;
                                                }
                                                str28 = str21;
                                                str29 = str22;
                                                i2 = i;
                                                z4 = z3;
                                                str30 = str20;
                                                who0Var2 = (who0) objA;
                                                if (who0Var2 == null) {
                                                    z2 = z4;
                                                    str20 = str30;
                                                    str21 = str28;
                                                    str27 = str26;
                                                    who0Var = null;
                                                    jo70Var2 = uv00Var5.a(jo70.class, str24).b;
                                                    if (jo70Var2 != null) {
                                                        break;
                                                    }
                                                    eg.m("Failed to retrieve name from IdentityTrait");
                                                    return null;
                                                }
                                                fryVar2.a = str28;
                                                fryVar2.b = null;
                                                fryVar2.c = null;
                                                fryVar2.d = null;
                                                fryVar2.e = str30;
                                                fryVar2.f = uv00Var4;
                                                fryVar2.g = str24;
                                                fryVar2.h = uv00Var5;
                                                fryVar2.i = str26;
                                                fryVar2.t = i2;
                                                fryVar2.X = z4;
                                                fryVar2.N0 = 6;
                                                objD = d(who0Var2, str29, fryVar2);
                                                if (objD == obj2) {
                                                    return obj2;
                                                }
                                                objA2 = objD;
                                                z5 = z4;
                                                str31 = str24;
                                                uv00Var6 = uv00Var4;
                                                str32 = str26;
                                                z2 = z5;
                                                str27 = str32;
                                                str24 = str31;
                                                uv00Var4 = uv00Var6;
                                                who0Var = (who0) objA2;
                                                str20 = str30;
                                                str21 = str28;
                                                jo70Var2 = uv00Var5.a(jo70.class, str24).b;
                                                if (jo70Var2 != null) {
                                                    break;
                                                }
                                                eg.m("Failed to retrieve name from IdentityTrait");
                                                return null;
                                            }
                                            go41 go41Var113 = (go41) this.d;
                                            fryVar2.a = str21;
                                            fryVar2.b = str22;
                                            fryVar2.c = null;
                                            fryVar2.d = null;
                                            fryVar2.e = str20;
                                            fryVar2.f = uv00Var4;
                                            fryVar2.g = str24;
                                            fryVar2.h = uv00Var5;
                                            fryVar2.i = str26;
                                            fryVar2.t = i;
                                            fryVar2.X = z;
                                            fryVar2.N0 = 5;
                                            z3 = z;
                                            obj2 = obj;
                                            objA = go41Var113.a(str22, str21, str25, str17, fryVar2);
                                            if (objA == obj2) {
                                                return obj2;
                                            }
                                            str28 = str21;
                                            str29 = str22;
                                            i2 = i;
                                            z4 = z3;
                                            str30 = str20;
                                            who0Var2 = (who0) objA;
                                            if (who0Var2 == null) {
                                                z2 = z4;
                                                str20 = str30;
                                                str21 = str28;
                                                str27 = str26;
                                                who0Var = null;
                                                jo70Var2 = uv00Var5.a(jo70.class, str24).b;
                                                if (jo70Var2 != null) {
                                                    break;
                                                }
                                                eg.m("Failed to retrieve name from IdentityTrait");
                                                return null;
                                            }
                                            fryVar2.a = str28;
                                            fryVar2.b = null;
                                            fryVar2.c = null;
                                            fryVar2.d = null;
                                            fryVar2.e = str30;
                                            fryVar2.f = uv00Var4;
                                            fryVar2.g = str24;
                                            fryVar2.h = uv00Var5;
                                            fryVar2.i = str26;
                                            fryVar2.t = i2;
                                            fryVar2.X = z4;
                                            fryVar2.N0 = 6;
                                            objD = d(who0Var2, str29, fryVar2);
                                            if (objD == obj2) {
                                                return obj2;
                                            }
                                            objA2 = objD;
                                            z5 = z4;
                                            str31 = str24;
                                            uv00Var6 = uv00Var4;
                                            str32 = str26;
                                            z2 = z5;
                                            str27 = str32;
                                            str24 = str31;
                                            uv00Var4 = uv00Var6;
                                            who0Var = (who0) objA2;
                                            str20 = str30;
                                            str21 = str28;
                                            jo70Var2 = uv00Var5.a(jo70.class, str24).b;
                                            if (jo70Var2 != null) {
                                                break;
                                            }
                                            eg.m("Failed to retrieve name from IdentityTrait");
                                            return null;
                                        }
                                        str27 = str26;
                                        z2 = z;
                                        who0Var = null;
                                        jo70Var2 = uv00Var5.a(jo70.class, str24).b;
                                        if (jo70Var2 != null) {
                                            break;
                                        }
                                        eg.m("Failed to retrieve name from IdentityTrait");
                                        return null;
                                    }
                                }
                                return d9nVar;
                            case 3:
                                String str44 = fryVar2.g;
                                uv00 uv00Var7 = fryVar2.f;
                                str18 = fryVar2.e;
                                str17 = fryVar2.d;
                                str16 = fryVar2.c;
                                str15 = fryVar2.b;
                                str14 = fryVar2.a;
                                hm5.M(objA2);
                                uv00Var2 = uv00Var7;
                                str19 = str44;
                                uv00Var3 = (uv00) objA2;
                                qns0 qns0Var4 = (qns0) this.g;
                                List listSingletonList4 = Collections.singletonList(str19);
                                fryVar2.a = str14;
                                fryVar2.b = str15;
                                fryVar2.c = str16;
                                fryVar2.d = str17;
                                fryVar2.e = str18;
                                fryVar2.f = uv00Var2;
                                fryVar2.g = str19;
                                fryVar2.h = uv00Var3;
                                fryVar2.N0 = 4;
                                objA2 = qns0Var4.a("EntitySegmentMenuMetadataLoader", listSingletonList4, fryVar2, false);
                                if (objA2 != d9nVar) {
                                    String str317 = str14;
                                    str20 = str18;
                                    str21 = str317;
                                    str22 = str15;
                                    uv00Var4 = uv00Var2;
                                    str23 = str16;
                                    str24 = str19;
                                    uv00Var5 = uv00Var3;
                                    qfdVar = (qfd) o7h.s0((List) objA2);
                                    if (qfdVar == null) {
                                        i = 0;
                                    } else {
                                        i = 0;
                                    }
                                    if (qfdVar != null) {
                                        ArrayList arrayList13 = qfdVar.e;
                                        obj = d9nVar;
                                        if (qfdVar.c != 3) {
                                            break;
                                        }
                                        vn71Var = uv00Var4.a(vn71.class, str21).b;
                                        if (vn71Var != null) {
                                            ArrayList arrayList14 = vn71Var.a;
                                            arrayList = new ArrayList();
                                            it = arrayList14.iterator();
                                            while (it.hasNext()) {
                                                Iterator it9 = it;
                                                next = it9.next();
                                                String str318 = str23;
                                                if (next instanceof qc71) {
                                                    arrayList.add(next);
                                                }
                                                it = it9;
                                                str23 = str318;
                                            }
                                            str25 = str23;
                                            qc71 qc71Var7 = (qc71) o7h.s0(arrayList);
                                            if (qc71Var7 != null) {
                                            }
                                            if (str22 != null) {
                                                Set set15 = s4b1.f;
                                                if (uic.i(str22, s4b1.g)) {
                                                    go41 go41Var114 = (go41) this.d;
                                                    fryVar2.a = str21;
                                                    fryVar2.b = str22;
                                                    fryVar2.c = null;
                                                    fryVar2.d = null;
                                                    fryVar2.e = str20;
                                                    fryVar2.f = uv00Var4;
                                                    fryVar2.g = str24;
                                                    fryVar2.h = uv00Var5;
                                                    fryVar2.i = str26;
                                                    fryVar2.t = i;
                                                    fryVar2.X = z;
                                                    fryVar2.N0 = 5;
                                                    z3 = z;
                                                    obj2 = obj;
                                                    objA = go41Var114.a(str22, str21, str25, str17, fryVar2);
                                                    if (objA == obj2) {
                                                        return obj2;
                                                    }
                                                    str28 = str21;
                                                    str29 = str22;
                                                    i2 = i;
                                                    z4 = z3;
                                                    str30 = str20;
                                                    who0Var2 = (who0) objA;
                                                    if (who0Var2 == null) {
                                                        z2 = z4;
                                                        str20 = str30;
                                                        str21 = str28;
                                                        str27 = str26;
                                                        who0Var = null;
                                                        jo70Var2 = uv00Var5.a(jo70.class, str24).b;
                                                        if (jo70Var2 != null) {
                                                            break;
                                                        }
                                                        eg.m("Failed to retrieve name from IdentityTrait");
                                                        return null;
                                                    }
                                                    fryVar2.a = str28;
                                                    fryVar2.b = null;
                                                    fryVar2.c = null;
                                                    fryVar2.d = null;
                                                    fryVar2.e = str30;
                                                    fryVar2.f = uv00Var4;
                                                    fryVar2.g = str24;
                                                    fryVar2.h = uv00Var5;
                                                    fryVar2.i = str26;
                                                    fryVar2.t = i2;
                                                    fryVar2.X = z4;
                                                    fryVar2.N0 = 6;
                                                    objD = d(who0Var2, str29, fryVar2);
                                                    if (objD == obj2) {
                                                        return obj2;
                                                    }
                                                    objA2 = objD;
                                                    z5 = z4;
                                                    str31 = str24;
                                                    uv00Var6 = uv00Var4;
                                                    str32 = str26;
                                                    z2 = z5;
                                                    str27 = str32;
                                                    str24 = str31;
                                                    uv00Var4 = uv00Var6;
                                                    who0Var = (who0) objA2;
                                                    str20 = str30;
                                                    str21 = str28;
                                                    jo70Var2 = uv00Var5.a(jo70.class, str24).b;
                                                    if (jo70Var2 != null) {
                                                        break;
                                                    }
                                                    eg.m("Failed to retrieve name from IdentityTrait");
                                                    return null;
                                                }
                                                go41 go41Var115 = (go41) this.d;
                                                fryVar2.a = str21;
                                                fryVar2.b = str22;
                                                fryVar2.c = null;
                                                fryVar2.d = null;
                                                fryVar2.e = str20;
                                                fryVar2.f = uv00Var4;
                                                fryVar2.g = str24;
                                                fryVar2.h = uv00Var5;
                                                fryVar2.i = str26;
                                                fryVar2.t = i;
                                                fryVar2.X = z;
                                                fryVar2.N0 = 5;
                                                z3 = z;
                                                obj2 = obj;
                                                objA = go41Var115.a(str22, str21, str25, str17, fryVar2);
                                                if (objA == obj2) {
                                                    return obj2;
                                                }
                                                str28 = str21;
                                                str29 = str22;
                                                i2 = i;
                                                z4 = z3;
                                                str30 = str20;
                                                who0Var2 = (who0) objA;
                                                if (who0Var2 == null) {
                                                    z2 = z4;
                                                    str20 = str30;
                                                    str21 = str28;
                                                    str27 = str26;
                                                    who0Var = null;
                                                    jo70Var2 = uv00Var5.a(jo70.class, str24).b;
                                                    if (jo70Var2 != null) {
                                                        break;
                                                    }
                                                    eg.m("Failed to retrieve name from IdentityTrait");
                                                    return null;
                                                }
                                                fryVar2.a = str28;
                                                fryVar2.b = null;
                                                fryVar2.c = null;
                                                fryVar2.d = null;
                                                fryVar2.e = str30;
                                                fryVar2.f = uv00Var4;
                                                fryVar2.g = str24;
                                                fryVar2.h = uv00Var5;
                                                fryVar2.i = str26;
                                                fryVar2.t = i2;
                                                fryVar2.X = z4;
                                                fryVar2.N0 = 6;
                                                objD = d(who0Var2, str29, fryVar2);
                                                if (objD == obj2) {
                                                    return obj2;
                                                }
                                                objA2 = objD;
                                                z5 = z4;
                                                str31 = str24;
                                                uv00Var6 = uv00Var4;
                                                str32 = str26;
                                                z2 = z5;
                                                str27 = str32;
                                                str24 = str31;
                                                uv00Var4 = uv00Var6;
                                                who0Var = (who0) objA2;
                                                str20 = str30;
                                                str21 = str28;
                                                jo70Var2 = uv00Var5.a(jo70.class, str24).b;
                                                if (jo70Var2 != null) {
                                                    break;
                                                }
                                                eg.m("Failed to retrieve name from IdentityTrait");
                                                return null;
                                            }
                                            str27 = str26;
                                            z2 = z;
                                            who0Var = null;
                                            jo70Var2 = uv00Var5.a(jo70.class, str24).b;
                                            if (jo70Var2 != null) {
                                                break;
                                            }
                                            eg.m("Failed to retrieve name from IdentityTrait");
                                            return null;
                                        }
                                        str25 = str23;
                                        if (str22 != null) {
                                            Set set16 = s4b1.f;
                                            if (uic.i(str22, s4b1.g)) {
                                                go41 go41Var116 = (go41) this.d;
                                                fryVar2.a = str21;
                                                fryVar2.b = str22;
                                                fryVar2.c = null;
                                                fryVar2.d = null;
                                                fryVar2.e = str20;
                                                fryVar2.f = uv00Var4;
                                                fryVar2.g = str24;
                                                fryVar2.h = uv00Var5;
                                                fryVar2.i = str26;
                                                fryVar2.t = i;
                                                fryVar2.X = z;
                                                fryVar2.N0 = 5;
                                                z3 = z;
                                                obj2 = obj;
                                                objA = go41Var116.a(str22, str21, str25, str17, fryVar2);
                                                if (objA == obj2) {
                                                    return obj2;
                                                }
                                                str28 = str21;
                                                str29 = str22;
                                                i2 = i;
                                                z4 = z3;
                                                str30 = str20;
                                                who0Var2 = (who0) objA;
                                                if (who0Var2 == null) {
                                                    z2 = z4;
                                                    str20 = str30;
                                                    str21 = str28;
                                                    str27 = str26;
                                                    who0Var = null;
                                                    jo70Var2 = uv00Var5.a(jo70.class, str24).b;
                                                    if (jo70Var2 != null) {
                                                        break;
                                                    }
                                                    eg.m("Failed to retrieve name from IdentityTrait");
                                                    return null;
                                                }
                                                fryVar2.a = str28;
                                                fryVar2.b = null;
                                                fryVar2.c = null;
                                                fryVar2.d = null;
                                                fryVar2.e = str30;
                                                fryVar2.f = uv00Var4;
                                                fryVar2.g = str24;
                                                fryVar2.h = uv00Var5;
                                                fryVar2.i = str26;
                                                fryVar2.t = i2;
                                                fryVar2.X = z4;
                                                fryVar2.N0 = 6;
                                                objD = d(who0Var2, str29, fryVar2);
                                                if (objD == obj2) {
                                                    return obj2;
                                                }
                                                objA2 = objD;
                                                z5 = z4;
                                                str31 = str24;
                                                uv00Var6 = uv00Var4;
                                                str32 = str26;
                                                z2 = z5;
                                                str27 = str32;
                                                str24 = str31;
                                                uv00Var4 = uv00Var6;
                                                who0Var = (who0) objA2;
                                                str20 = str30;
                                                str21 = str28;
                                                jo70Var2 = uv00Var5.a(jo70.class, str24).b;
                                                if (jo70Var2 != null) {
                                                    break;
                                                }
                                                eg.m("Failed to retrieve name from IdentityTrait");
                                                return null;
                                            }
                                            go41 go41Var117 = (go41) this.d;
                                            fryVar2.a = str21;
                                            fryVar2.b = str22;
                                            fryVar2.c = null;
                                            fryVar2.d = null;
                                            fryVar2.e = str20;
                                            fryVar2.f = uv00Var4;
                                            fryVar2.g = str24;
                                            fryVar2.h = uv00Var5;
                                            fryVar2.i = str26;
                                            fryVar2.t = i;
                                            fryVar2.X = z;
                                            fryVar2.N0 = 5;
                                            z3 = z;
                                            obj2 = obj;
                                            objA = go41Var117.a(str22, str21, str25, str17, fryVar2);
                                            if (objA == obj2) {
                                                return obj2;
                                            }
                                            str28 = str21;
                                            str29 = str22;
                                            i2 = i;
                                            z4 = z3;
                                            str30 = str20;
                                            who0Var2 = (who0) objA;
                                            if (who0Var2 == null) {
                                                z2 = z4;
                                                str20 = str30;
                                                str21 = str28;
                                                str27 = str26;
                                                who0Var = null;
                                                jo70Var2 = uv00Var5.a(jo70.class, str24).b;
                                                if (jo70Var2 != null) {
                                                    break;
                                                }
                                                eg.m("Failed to retrieve name from IdentityTrait");
                                                return null;
                                            }
                                            fryVar2.a = str28;
                                            fryVar2.b = null;
                                            fryVar2.c = null;
                                            fryVar2.d = null;
                                            fryVar2.e = str30;
                                            fryVar2.f = uv00Var4;
                                            fryVar2.g = str24;
                                            fryVar2.h = uv00Var5;
                                            fryVar2.i = str26;
                                            fryVar2.t = i2;
                                            fryVar2.X = z4;
                                            fryVar2.N0 = 6;
                                            objD = d(who0Var2, str29, fryVar2);
                                            if (objD == obj2) {
                                                return obj2;
                                            }
                                            objA2 = objD;
                                            z5 = z4;
                                            str31 = str24;
                                            uv00Var6 = uv00Var4;
                                            str32 = str26;
                                            z2 = z5;
                                            str27 = str32;
                                            str24 = str31;
                                            uv00Var4 = uv00Var6;
                                            who0Var = (who0) objA2;
                                            str20 = str30;
                                            str21 = str28;
                                            jo70Var2 = uv00Var5.a(jo70.class, str24).b;
                                            if (jo70Var2 != null) {
                                                break;
                                            }
                                            eg.m("Failed to retrieve name from IdentityTrait");
                                            return null;
                                        }
                                        str27 = str26;
                                        z2 = z;
                                        who0Var = null;
                                        jo70Var2 = uv00Var5.a(jo70.class, str24).b;
                                        if (jo70Var2 != null) {
                                            break;
                                        }
                                        eg.m("Failed to retrieve name from IdentityTrait");
                                        return null;
                                    }
                                    obj = d9nVar;
                                    vn71Var = uv00Var4.a(vn71.class, str21).b;
                                    if (vn71Var != null) {
                                        ArrayList arrayList15 = vn71Var.a;
                                        arrayList = new ArrayList();
                                        it = arrayList15.iterator();
                                        while (it.hasNext()) {
                                            Iterator it10 = it;
                                            next = it10.next();
                                            String str319 = str23;
                                            if (next instanceof qc71) {
                                                arrayList.add(next);
                                            }
                                            it = it10;
                                            str23 = str319;
                                        }
                                        str25 = str23;
                                        qc71 qc71Var8 = (qc71) o7h.s0(arrayList);
                                        if (qc71Var8 != null) {
                                        }
                                        if (str22 != null) {
                                            Set set17 = s4b1.f;
                                            if (uic.i(str22, s4b1.g)) {
                                                go41 go41Var118 = (go41) this.d;
                                                fryVar2.a = str21;
                                                fryVar2.b = str22;
                                                fryVar2.c = null;
                                                fryVar2.d = null;
                                                fryVar2.e = str20;
                                                fryVar2.f = uv00Var4;
                                                fryVar2.g = str24;
                                                fryVar2.h = uv00Var5;
                                                fryVar2.i = str26;
                                                fryVar2.t = i;
                                                fryVar2.X = z;
                                                fryVar2.N0 = 5;
                                                z3 = z;
                                                obj2 = obj;
                                                objA = go41Var118.a(str22, str21, str25, str17, fryVar2);
                                                if (objA == obj2) {
                                                    return obj2;
                                                }
                                                str28 = str21;
                                                str29 = str22;
                                                i2 = i;
                                                z4 = z3;
                                                str30 = str20;
                                                who0Var2 = (who0) objA;
                                                if (who0Var2 == null) {
                                                    z2 = z4;
                                                    str20 = str30;
                                                    str21 = str28;
                                                    str27 = str26;
                                                    who0Var = null;
                                                    jo70Var2 = uv00Var5.a(jo70.class, str24).b;
                                                    if (jo70Var2 != null) {
                                                        break;
                                                    }
                                                    eg.m("Failed to retrieve name from IdentityTrait");
                                                    return null;
                                                }
                                                fryVar2.a = str28;
                                                fryVar2.b = null;
                                                fryVar2.c = null;
                                                fryVar2.d = null;
                                                fryVar2.e = str30;
                                                fryVar2.f = uv00Var4;
                                                fryVar2.g = str24;
                                                fryVar2.h = uv00Var5;
                                                fryVar2.i = str26;
                                                fryVar2.t = i2;
                                                fryVar2.X = z4;
                                                fryVar2.N0 = 6;
                                                objD = d(who0Var2, str29, fryVar2);
                                                if (objD == obj2) {
                                                    return obj2;
                                                }
                                                objA2 = objD;
                                                z5 = z4;
                                                str31 = str24;
                                                uv00Var6 = uv00Var4;
                                                str32 = str26;
                                                z2 = z5;
                                                str27 = str32;
                                                str24 = str31;
                                                uv00Var4 = uv00Var6;
                                                who0Var = (who0) objA2;
                                                str20 = str30;
                                                str21 = str28;
                                                jo70Var2 = uv00Var5.a(jo70.class, str24).b;
                                                if (jo70Var2 != null) {
                                                    break;
                                                }
                                                eg.m("Failed to retrieve name from IdentityTrait");
                                                return null;
                                            }
                                            go41 go41Var119 = (go41) this.d;
                                            fryVar2.a = str21;
                                            fryVar2.b = str22;
                                            fryVar2.c = null;
                                            fryVar2.d = null;
                                            fryVar2.e = str20;
                                            fryVar2.f = uv00Var4;
                                            fryVar2.g = str24;
                                            fryVar2.h = uv00Var5;
                                            fryVar2.i = str26;
                                            fryVar2.t = i;
                                            fryVar2.X = z;
                                            fryVar2.N0 = 5;
                                            z3 = z;
                                            obj2 = obj;
                                            objA = go41Var119.a(str22, str21, str25, str17, fryVar2);
                                            if (objA == obj2) {
                                                return obj2;
                                            }
                                            str28 = str21;
                                            str29 = str22;
                                            i2 = i;
                                            z4 = z3;
                                            str30 = str20;
                                            who0Var2 = (who0) objA;
                                            if (who0Var2 == null) {
                                                z2 = z4;
                                                str20 = str30;
                                                str21 = str28;
                                                str27 = str26;
                                                who0Var = null;
                                                jo70Var2 = uv00Var5.a(jo70.class, str24).b;
                                                if (jo70Var2 != null) {
                                                    break;
                                                }
                                                eg.m("Failed to retrieve name from IdentityTrait");
                                                return null;
                                            }
                                            fryVar2.a = str28;
                                            fryVar2.b = null;
                                            fryVar2.c = null;
                                            fryVar2.d = null;
                                            fryVar2.e = str30;
                                            fryVar2.f = uv00Var4;
                                            fryVar2.g = str24;
                                            fryVar2.h = uv00Var5;
                                            fryVar2.i = str26;
                                            fryVar2.t = i2;
                                            fryVar2.X = z4;
                                            fryVar2.N0 = 6;
                                            objD = d(who0Var2, str29, fryVar2);
                                            if (objD == obj2) {
                                                return obj2;
                                            }
                                            objA2 = objD;
                                            z5 = z4;
                                            str31 = str24;
                                            uv00Var6 = uv00Var4;
                                            str32 = str26;
                                            z2 = z5;
                                            str27 = str32;
                                            str24 = str31;
                                            uv00Var4 = uv00Var6;
                                            who0Var = (who0) objA2;
                                            str20 = str30;
                                            str21 = str28;
                                            jo70Var2 = uv00Var5.a(jo70.class, str24).b;
                                            if (jo70Var2 != null) {
                                                break;
                                            }
                                            eg.m("Failed to retrieve name from IdentityTrait");
                                            return null;
                                        }
                                        str27 = str26;
                                        z2 = z;
                                        who0Var = null;
                                        jo70Var2 = uv00Var5.a(jo70.class, str24).b;
                                        if (jo70Var2 != null) {
                                            break;
                                        }
                                        eg.m("Failed to retrieve name from IdentityTrait");
                                        return null;
                                    }
                                    str25 = str23;
                                    if (str22 != null) {
                                        Set set18 = s4b1.f;
                                        if (uic.i(str22, s4b1.g)) {
                                            go41 go41Var1110 = (go41) this.d;
                                            fryVar2.a = str21;
                                            fryVar2.b = str22;
                                            fryVar2.c = null;
                                            fryVar2.d = null;
                                            fryVar2.e = str20;
                                            fryVar2.f = uv00Var4;
                                            fryVar2.g = str24;
                                            fryVar2.h = uv00Var5;
                                            fryVar2.i = str26;
                                            fryVar2.t = i;
                                            fryVar2.X = z;
                                            fryVar2.N0 = 5;
                                            z3 = z;
                                            obj2 = obj;
                                            objA = go41Var1110.a(str22, str21, str25, str17, fryVar2);
                                            if (objA == obj2) {
                                                return obj2;
                                            }
                                            str28 = str21;
                                            str29 = str22;
                                            i2 = i;
                                            z4 = z3;
                                            str30 = str20;
                                            who0Var2 = (who0) objA;
                                            if (who0Var2 == null) {
                                                z2 = z4;
                                                str20 = str30;
                                                str21 = str28;
                                                str27 = str26;
                                                who0Var = null;
                                                jo70Var2 = uv00Var5.a(jo70.class, str24).b;
                                                if (jo70Var2 != null) {
                                                    break;
                                                }
                                                eg.m("Failed to retrieve name from IdentityTrait");
                                                return null;
                                            }
                                            fryVar2.a = str28;
                                            fryVar2.b = null;
                                            fryVar2.c = null;
                                            fryVar2.d = null;
                                            fryVar2.e = str30;
                                            fryVar2.f = uv00Var4;
                                            fryVar2.g = str24;
                                            fryVar2.h = uv00Var5;
                                            fryVar2.i = str26;
                                            fryVar2.t = i2;
                                            fryVar2.X = z4;
                                            fryVar2.N0 = 6;
                                            objD = d(who0Var2, str29, fryVar2);
                                            if (objD == obj2) {
                                                return obj2;
                                            }
                                            objA2 = objD;
                                            z5 = z4;
                                            str31 = str24;
                                            uv00Var6 = uv00Var4;
                                            str32 = str26;
                                            z2 = z5;
                                            str27 = str32;
                                            str24 = str31;
                                            uv00Var4 = uv00Var6;
                                            who0Var = (who0) objA2;
                                            str20 = str30;
                                            str21 = str28;
                                            jo70Var2 = uv00Var5.a(jo70.class, str24).b;
                                            if (jo70Var2 != null) {
                                                break;
                                            }
                                            eg.m("Failed to retrieve name from IdentityTrait");
                                            return null;
                                        }
                                        go41 go41Var1111 = (go41) this.d;
                                        fryVar2.a = str21;
                                        fryVar2.b = str22;
                                        fryVar2.c = null;
                                        fryVar2.d = null;
                                        fryVar2.e = str20;
                                        fryVar2.f = uv00Var4;
                                        fryVar2.g = str24;
                                        fryVar2.h = uv00Var5;
                                        fryVar2.i = str26;
                                        fryVar2.t = i;
                                        fryVar2.X = z;
                                        fryVar2.N0 = 5;
                                        z3 = z;
                                        obj2 = obj;
                                        objA = go41Var1111.a(str22, str21, str25, str17, fryVar2);
                                        if (objA == obj2) {
                                            return obj2;
                                        }
                                        str28 = str21;
                                        str29 = str22;
                                        i2 = i;
                                        z4 = z3;
                                        str30 = str20;
                                        who0Var2 = (who0) objA;
                                        if (who0Var2 == null) {
                                            z2 = z4;
                                            str20 = str30;
                                            str21 = str28;
                                            str27 = str26;
                                            who0Var = null;
                                            jo70Var2 = uv00Var5.a(jo70.class, str24).b;
                                            if (jo70Var2 != null) {
                                                break;
                                            }
                                            eg.m("Failed to retrieve name from IdentityTrait");
                                            return null;
                                        }
                                        fryVar2.a = str28;
                                        fryVar2.b = null;
                                        fryVar2.c = null;
                                        fryVar2.d = null;
                                        fryVar2.e = str30;
                                        fryVar2.f = uv00Var4;
                                        fryVar2.g = str24;
                                        fryVar2.h = uv00Var5;
                                        fryVar2.i = str26;
                                        fryVar2.t = i2;
                                        fryVar2.X = z4;
                                        fryVar2.N0 = 6;
                                        objD = d(who0Var2, str29, fryVar2);
                                        if (objD == obj2) {
                                            return obj2;
                                        }
                                        objA2 = objD;
                                        z5 = z4;
                                        str31 = str24;
                                        uv00Var6 = uv00Var4;
                                        str32 = str26;
                                        z2 = z5;
                                        str27 = str32;
                                        str24 = str31;
                                        uv00Var4 = uv00Var6;
                                        who0Var = (who0) objA2;
                                        str20 = str30;
                                        str21 = str28;
                                        jo70Var2 = uv00Var5.a(jo70.class, str24).b;
                                        if (jo70Var2 != null) {
                                            break;
                                        }
                                        eg.m("Failed to retrieve name from IdentityTrait");
                                        return null;
                                    }
                                    str27 = str26;
                                    z2 = z;
                                    who0Var = null;
                                    jo70Var2 = uv00Var5.a(jo70.class, str24).b;
                                    if (jo70Var2 != null) {
                                        break;
                                    }
                                    eg.m("Failed to retrieve name from IdentityTrait");
                                    return null;
                                }
                                return d9nVar;
                            case 4:
                                uv00 uv00Var8 = fryVar2.h;
                                String str45 = fryVar2.g;
                                uv00 uv00Var9 = fryVar2.f;
                                String str46 = fryVar2.e;
                                str17 = fryVar2.d;
                                String str47 = fryVar2.c;
                                String str48 = fryVar2.b;
                                String str49 = fryVar2.a;
                                hm5.M(objA2);
                                str20 = str46;
                                str21 = str49;
                                str22 = str48;
                                uv00Var4 = uv00Var9;
                                str23 = str47;
                                str24 = str45;
                                uv00Var5 = uv00Var8;
                                qfdVar = (qfd) o7h.s0((List) objA2);
                                if (qfdVar == null) {
                                    i = 0;
                                } else {
                                    i = 0;
                                }
                                if (qfdVar != null) {
                                    ArrayList arrayList16 = qfdVar.e;
                                    obj = d9nVar;
                                    if (qfdVar.c != 3) {
                                        break;
                                    }
                                    vn71Var = uv00Var4.a(vn71.class, str21).b;
                                    if (vn71Var != null) {
                                        ArrayList arrayList17 = vn71Var.a;
                                        arrayList = new ArrayList();
                                        it = arrayList17.iterator();
                                        while (it.hasNext()) {
                                            Iterator it11 = it;
                                            next = it11.next();
                                            String str3110 = str23;
                                            if (next instanceof qc71) {
                                                arrayList.add(next);
                                            }
                                            it = it11;
                                            str23 = str3110;
                                        }
                                        str25 = str23;
                                        qc71 qc71Var9 = (qc71) o7h.s0(arrayList);
                                        if (qc71Var9 != null) {
                                        }
                                        if (str22 != null) {
                                            Set set19 = s4b1.f;
                                            if (uic.i(str22, s4b1.g)) {
                                                go41 go41Var1112 = (go41) this.d;
                                                fryVar2.a = str21;
                                                fryVar2.b = str22;
                                                fryVar2.c = null;
                                                fryVar2.d = null;
                                                fryVar2.e = str20;
                                                fryVar2.f = uv00Var4;
                                                fryVar2.g = str24;
                                                fryVar2.h = uv00Var5;
                                                fryVar2.i = str26;
                                                fryVar2.t = i;
                                                fryVar2.X = z;
                                                fryVar2.N0 = 5;
                                                z3 = z;
                                                obj2 = obj;
                                                objA = go41Var1112.a(str22, str21, str25, str17, fryVar2);
                                                if (objA == obj2) {
                                                    return obj2;
                                                }
                                                str28 = str21;
                                                str29 = str22;
                                                i2 = i;
                                                z4 = z3;
                                                str30 = str20;
                                                who0Var2 = (who0) objA;
                                                if (who0Var2 == null) {
                                                    z2 = z4;
                                                    str20 = str30;
                                                    str21 = str28;
                                                    str27 = str26;
                                                    who0Var = null;
                                                    jo70Var2 = uv00Var5.a(jo70.class, str24).b;
                                                    if (jo70Var2 != null) {
                                                        break;
                                                    }
                                                    eg.m("Failed to retrieve name from IdentityTrait");
                                                    return null;
                                                }
                                                fryVar2.a = str28;
                                                fryVar2.b = null;
                                                fryVar2.c = null;
                                                fryVar2.d = null;
                                                fryVar2.e = str30;
                                                fryVar2.f = uv00Var4;
                                                fryVar2.g = str24;
                                                fryVar2.h = uv00Var5;
                                                fryVar2.i = str26;
                                                fryVar2.t = i2;
                                                fryVar2.X = z4;
                                                fryVar2.N0 = 6;
                                                objD = d(who0Var2, str29, fryVar2);
                                                if (objD == obj2) {
                                                    return obj2;
                                                }
                                                objA2 = objD;
                                                z5 = z4;
                                                str31 = str24;
                                                uv00Var6 = uv00Var4;
                                                str32 = str26;
                                                z2 = z5;
                                                str27 = str32;
                                                str24 = str31;
                                                uv00Var4 = uv00Var6;
                                                who0Var = (who0) objA2;
                                                str20 = str30;
                                                str21 = str28;
                                                jo70Var2 = uv00Var5.a(jo70.class, str24).b;
                                                if (jo70Var2 != null) {
                                                    break;
                                                }
                                                eg.m("Failed to retrieve name from IdentityTrait");
                                                return null;
                                            }
                                            go41 go41Var1113 = (go41) this.d;
                                            fryVar2.a = str21;
                                            fryVar2.b = str22;
                                            fryVar2.c = null;
                                            fryVar2.d = null;
                                            fryVar2.e = str20;
                                            fryVar2.f = uv00Var4;
                                            fryVar2.g = str24;
                                            fryVar2.h = uv00Var5;
                                            fryVar2.i = str26;
                                            fryVar2.t = i;
                                            fryVar2.X = z;
                                            fryVar2.N0 = 5;
                                            z3 = z;
                                            obj2 = obj;
                                            objA = go41Var1113.a(str22, str21, str25, str17, fryVar2);
                                            if (objA == obj2) {
                                                return obj2;
                                            }
                                            str28 = str21;
                                            str29 = str22;
                                            i2 = i;
                                            z4 = z3;
                                            str30 = str20;
                                            who0Var2 = (who0) objA;
                                            if (who0Var2 == null) {
                                                z2 = z4;
                                                str20 = str30;
                                                str21 = str28;
                                                str27 = str26;
                                                who0Var = null;
                                                jo70Var2 = uv00Var5.a(jo70.class, str24).b;
                                                if (jo70Var2 != null) {
                                                    break;
                                                }
                                                eg.m("Failed to retrieve name from IdentityTrait");
                                                return null;
                                            }
                                            fryVar2.a = str28;
                                            fryVar2.b = null;
                                            fryVar2.c = null;
                                            fryVar2.d = null;
                                            fryVar2.e = str30;
                                            fryVar2.f = uv00Var4;
                                            fryVar2.g = str24;
                                            fryVar2.h = uv00Var5;
                                            fryVar2.i = str26;
                                            fryVar2.t = i2;
                                            fryVar2.X = z4;
                                            fryVar2.N0 = 6;
                                            objD = d(who0Var2, str29, fryVar2);
                                            if (objD == obj2) {
                                                return obj2;
                                            }
                                            objA2 = objD;
                                            z5 = z4;
                                            str31 = str24;
                                            uv00Var6 = uv00Var4;
                                            str32 = str26;
                                            z2 = z5;
                                            str27 = str32;
                                            str24 = str31;
                                            uv00Var4 = uv00Var6;
                                            who0Var = (who0) objA2;
                                            str20 = str30;
                                            str21 = str28;
                                            jo70Var2 = uv00Var5.a(jo70.class, str24).b;
                                            if (jo70Var2 != null) {
                                                break;
                                            }
                                            eg.m("Failed to retrieve name from IdentityTrait");
                                            return null;
                                        }
                                        str27 = str26;
                                        z2 = z;
                                        who0Var = null;
                                        jo70Var2 = uv00Var5.a(jo70.class, str24).b;
                                        if (jo70Var2 != null) {
                                            break;
                                        }
                                        eg.m("Failed to retrieve name from IdentityTrait");
                                        return null;
                                    }
                                    str25 = str23;
                                    if (str22 != null) {
                                        Set set110 = s4b1.f;
                                        if (uic.i(str22, s4b1.g)) {
                                            go41 go41Var1114 = (go41) this.d;
                                            fryVar2.a = str21;
                                            fryVar2.b = str22;
                                            fryVar2.c = null;
                                            fryVar2.d = null;
                                            fryVar2.e = str20;
                                            fryVar2.f = uv00Var4;
                                            fryVar2.g = str24;
                                            fryVar2.h = uv00Var5;
                                            fryVar2.i = str26;
                                            fryVar2.t = i;
                                            fryVar2.X = z;
                                            fryVar2.N0 = 5;
                                            z3 = z;
                                            obj2 = obj;
                                            objA = go41Var1114.a(str22, str21, str25, str17, fryVar2);
                                            if (objA == obj2) {
                                                return obj2;
                                            }
                                            str28 = str21;
                                            str29 = str22;
                                            i2 = i;
                                            z4 = z3;
                                            str30 = str20;
                                            who0Var2 = (who0) objA;
                                            if (who0Var2 == null) {
                                                z2 = z4;
                                                str20 = str30;
                                                str21 = str28;
                                                str27 = str26;
                                                who0Var = null;
                                                jo70Var2 = uv00Var5.a(jo70.class, str24).b;
                                                if (jo70Var2 != null) {
                                                    break;
                                                }
                                                eg.m("Failed to retrieve name from IdentityTrait");
                                                return null;
                                            }
                                            fryVar2.a = str28;
                                            fryVar2.b = null;
                                            fryVar2.c = null;
                                            fryVar2.d = null;
                                            fryVar2.e = str30;
                                            fryVar2.f = uv00Var4;
                                            fryVar2.g = str24;
                                            fryVar2.h = uv00Var5;
                                            fryVar2.i = str26;
                                            fryVar2.t = i2;
                                            fryVar2.X = z4;
                                            fryVar2.N0 = 6;
                                            objD = d(who0Var2, str29, fryVar2);
                                            if (objD == obj2) {
                                                return obj2;
                                            }
                                            objA2 = objD;
                                            z5 = z4;
                                            str31 = str24;
                                            uv00Var6 = uv00Var4;
                                            str32 = str26;
                                            z2 = z5;
                                            str27 = str32;
                                            str24 = str31;
                                            uv00Var4 = uv00Var6;
                                            who0Var = (who0) objA2;
                                            str20 = str30;
                                            str21 = str28;
                                            jo70Var2 = uv00Var5.a(jo70.class, str24).b;
                                            if (jo70Var2 != null) {
                                                break;
                                            }
                                            eg.m("Failed to retrieve name from IdentityTrait");
                                            return null;
                                        }
                                        go41 go41Var1115 = (go41) this.d;
                                        fryVar2.a = str21;
                                        fryVar2.b = str22;
                                        fryVar2.c = null;
                                        fryVar2.d = null;
                                        fryVar2.e = str20;
                                        fryVar2.f = uv00Var4;
                                        fryVar2.g = str24;
                                        fryVar2.h = uv00Var5;
                                        fryVar2.i = str26;
                                        fryVar2.t = i;
                                        fryVar2.X = z;
                                        fryVar2.N0 = 5;
                                        z3 = z;
                                        obj2 = obj;
                                        objA = go41Var1115.a(str22, str21, str25, str17, fryVar2);
                                        if (objA == obj2) {
                                            return obj2;
                                        }
                                        str28 = str21;
                                        str29 = str22;
                                        i2 = i;
                                        z4 = z3;
                                        str30 = str20;
                                        who0Var2 = (who0) objA;
                                        if (who0Var2 == null) {
                                            z2 = z4;
                                            str20 = str30;
                                            str21 = str28;
                                            str27 = str26;
                                            who0Var = null;
                                            jo70Var2 = uv00Var5.a(jo70.class, str24).b;
                                            if (jo70Var2 != null) {
                                                break;
                                            }
                                            eg.m("Failed to retrieve name from IdentityTrait");
                                            return null;
                                        }
                                        fryVar2.a = str28;
                                        fryVar2.b = null;
                                        fryVar2.c = null;
                                        fryVar2.d = null;
                                        fryVar2.e = str30;
                                        fryVar2.f = uv00Var4;
                                        fryVar2.g = str24;
                                        fryVar2.h = uv00Var5;
                                        fryVar2.i = str26;
                                        fryVar2.t = i2;
                                        fryVar2.X = z4;
                                        fryVar2.N0 = 6;
                                        objD = d(who0Var2, str29, fryVar2);
                                        if (objD == obj2) {
                                            return obj2;
                                        }
                                        objA2 = objD;
                                        z5 = z4;
                                        str31 = str24;
                                        uv00Var6 = uv00Var4;
                                        str32 = str26;
                                        z2 = z5;
                                        str27 = str32;
                                        str24 = str31;
                                        uv00Var4 = uv00Var6;
                                        who0Var = (who0) objA2;
                                        str20 = str30;
                                        str21 = str28;
                                        jo70Var2 = uv00Var5.a(jo70.class, str24).b;
                                        if (jo70Var2 != null) {
                                            break;
                                        }
                                        eg.m("Failed to retrieve name from IdentityTrait");
                                        return null;
                                    }
                                    str27 = str26;
                                    z2 = z;
                                    who0Var = null;
                                    jo70Var2 = uv00Var5.a(jo70.class, str24).b;
                                    if (jo70Var2 != null) {
                                        break;
                                    }
                                    eg.m("Failed to retrieve name from IdentityTrait");
                                    return null;
                                }
                                obj = d9nVar;
                                vn71Var = uv00Var4.a(vn71.class, str21).b;
                                if (vn71Var != null) {
                                    ArrayList arrayList18 = vn71Var.a;
                                    arrayList = new ArrayList();
                                    it = arrayList18.iterator();
                                    while (it.hasNext()) {
                                        Iterator it12 = it;
                                        next = it12.next();
                                        String str3111 = str23;
                                        if (next instanceof qc71) {
                                            arrayList.add(next);
                                        }
                                        it = it12;
                                        str23 = str3111;
                                    }
                                    str25 = str23;
                                    qc71 qc71Var10 = (qc71) o7h.s0(arrayList);
                                    if (qc71Var10 != null) {
                                    }
                                    if (str22 != null) {
                                        Set set111 = s4b1.f;
                                        if (uic.i(str22, s4b1.g)) {
                                            go41 go41Var1116 = (go41) this.d;
                                            fryVar2.a = str21;
                                            fryVar2.b = str22;
                                            fryVar2.c = null;
                                            fryVar2.d = null;
                                            fryVar2.e = str20;
                                            fryVar2.f = uv00Var4;
                                            fryVar2.g = str24;
                                            fryVar2.h = uv00Var5;
                                            fryVar2.i = str26;
                                            fryVar2.t = i;
                                            fryVar2.X = z;
                                            fryVar2.N0 = 5;
                                            z3 = z;
                                            obj2 = obj;
                                            objA = go41Var1116.a(str22, str21, str25, str17, fryVar2);
                                            if (objA == obj2) {
                                                return obj2;
                                            }
                                            str28 = str21;
                                            str29 = str22;
                                            i2 = i;
                                            z4 = z3;
                                            str30 = str20;
                                            who0Var2 = (who0) objA;
                                            if (who0Var2 == null) {
                                                z2 = z4;
                                                str20 = str30;
                                                str21 = str28;
                                                str27 = str26;
                                                who0Var = null;
                                                jo70Var2 = uv00Var5.a(jo70.class, str24).b;
                                                if (jo70Var2 != null) {
                                                    break;
                                                }
                                                eg.m("Failed to retrieve name from IdentityTrait");
                                                return null;
                                            }
                                            fryVar2.a = str28;
                                            fryVar2.b = null;
                                            fryVar2.c = null;
                                            fryVar2.d = null;
                                            fryVar2.e = str30;
                                            fryVar2.f = uv00Var4;
                                            fryVar2.g = str24;
                                            fryVar2.h = uv00Var5;
                                            fryVar2.i = str26;
                                            fryVar2.t = i2;
                                            fryVar2.X = z4;
                                            fryVar2.N0 = 6;
                                            objD = d(who0Var2, str29, fryVar2);
                                            if (objD == obj2) {
                                                return obj2;
                                            }
                                            objA2 = objD;
                                            z5 = z4;
                                            str31 = str24;
                                            uv00Var6 = uv00Var4;
                                            str32 = str26;
                                            z2 = z5;
                                            str27 = str32;
                                            str24 = str31;
                                            uv00Var4 = uv00Var6;
                                            who0Var = (who0) objA2;
                                            str20 = str30;
                                            str21 = str28;
                                            jo70Var2 = uv00Var5.a(jo70.class, str24).b;
                                            if (jo70Var2 != null) {
                                                break;
                                            }
                                            eg.m("Failed to retrieve name from IdentityTrait");
                                            return null;
                                        }
                                        go41 go41Var1117 = (go41) this.d;
                                        fryVar2.a = str21;
                                        fryVar2.b = str22;
                                        fryVar2.c = null;
                                        fryVar2.d = null;
                                        fryVar2.e = str20;
                                        fryVar2.f = uv00Var4;
                                        fryVar2.g = str24;
                                        fryVar2.h = uv00Var5;
                                        fryVar2.i = str26;
                                        fryVar2.t = i;
                                        fryVar2.X = z;
                                        fryVar2.N0 = 5;
                                        z3 = z;
                                        obj2 = obj;
                                        objA = go41Var1117.a(str22, str21, str25, str17, fryVar2);
                                        if (objA == obj2) {
                                            return obj2;
                                        }
                                        str28 = str21;
                                        str29 = str22;
                                        i2 = i;
                                        z4 = z3;
                                        str30 = str20;
                                        who0Var2 = (who0) objA;
                                        if (who0Var2 == null) {
                                            z2 = z4;
                                            str20 = str30;
                                            str21 = str28;
                                            str27 = str26;
                                            who0Var = null;
                                            jo70Var2 = uv00Var5.a(jo70.class, str24).b;
                                            if (jo70Var2 != null) {
                                                break;
                                            }
                                            eg.m("Failed to retrieve name from IdentityTrait");
                                            return null;
                                        }
                                        fryVar2.a = str28;
                                        fryVar2.b = null;
                                        fryVar2.c = null;
                                        fryVar2.d = null;
                                        fryVar2.e = str30;
                                        fryVar2.f = uv00Var4;
                                        fryVar2.g = str24;
                                        fryVar2.h = uv00Var5;
                                        fryVar2.i = str26;
                                        fryVar2.t = i2;
                                        fryVar2.X = z4;
                                        fryVar2.N0 = 6;
                                        objD = d(who0Var2, str29, fryVar2);
                                        if (objD == obj2) {
                                            return obj2;
                                        }
                                        objA2 = objD;
                                        z5 = z4;
                                        str31 = str24;
                                        uv00Var6 = uv00Var4;
                                        str32 = str26;
                                        z2 = z5;
                                        str27 = str32;
                                        str24 = str31;
                                        uv00Var4 = uv00Var6;
                                        who0Var = (who0) objA2;
                                        str20 = str30;
                                        str21 = str28;
                                        jo70Var2 = uv00Var5.a(jo70.class, str24).b;
                                        if (jo70Var2 != null) {
                                            break;
                                        }
                                        eg.m("Failed to retrieve name from IdentityTrait");
                                        return null;
                                    }
                                    str27 = str26;
                                    z2 = z;
                                    who0Var = null;
                                    jo70Var2 = uv00Var5.a(jo70.class, str24).b;
                                    if (jo70Var2 != null) {
                                        break;
                                    }
                                    eg.m("Failed to retrieve name from IdentityTrait");
                                    return null;
                                }
                                str25 = str23;
                                if (str22 != null) {
                                    Set set112 = s4b1.f;
                                    if (uic.i(str22, s4b1.g)) {
                                        go41 go41Var1118 = (go41) this.d;
                                        fryVar2.a = str21;
                                        fryVar2.b = str22;
                                        fryVar2.c = null;
                                        fryVar2.d = null;
                                        fryVar2.e = str20;
                                        fryVar2.f = uv00Var4;
                                        fryVar2.g = str24;
                                        fryVar2.h = uv00Var5;
                                        fryVar2.i = str26;
                                        fryVar2.t = i;
                                        fryVar2.X = z;
                                        fryVar2.N0 = 5;
                                        z3 = z;
                                        obj2 = obj;
                                        objA = go41Var1118.a(str22, str21, str25, str17, fryVar2);
                                        if (objA == obj2) {
                                            return obj2;
                                        }
                                        str28 = str21;
                                        str29 = str22;
                                        i2 = i;
                                        z4 = z3;
                                        str30 = str20;
                                        who0Var2 = (who0) objA;
                                        if (who0Var2 == null) {
                                            z2 = z4;
                                            str20 = str30;
                                            str21 = str28;
                                            str27 = str26;
                                            who0Var = null;
                                            jo70Var2 = uv00Var5.a(jo70.class, str24).b;
                                            if (jo70Var2 != null) {
                                                break;
                                            }
                                            eg.m("Failed to retrieve name from IdentityTrait");
                                            return null;
                                        }
                                        fryVar2.a = str28;
                                        fryVar2.b = null;
                                        fryVar2.c = null;
                                        fryVar2.d = null;
                                        fryVar2.e = str30;
                                        fryVar2.f = uv00Var4;
                                        fryVar2.g = str24;
                                        fryVar2.h = uv00Var5;
                                        fryVar2.i = str26;
                                        fryVar2.t = i2;
                                        fryVar2.X = z4;
                                        fryVar2.N0 = 6;
                                        objD = d(who0Var2, str29, fryVar2);
                                        if (objD == obj2) {
                                            return obj2;
                                        }
                                        objA2 = objD;
                                        z5 = z4;
                                        str31 = str24;
                                        uv00Var6 = uv00Var4;
                                        str32 = str26;
                                        z2 = z5;
                                        str27 = str32;
                                        str24 = str31;
                                        uv00Var4 = uv00Var6;
                                        who0Var = (who0) objA2;
                                        str20 = str30;
                                        str21 = str28;
                                        jo70Var2 = uv00Var5.a(jo70.class, str24).b;
                                        if (jo70Var2 != null) {
                                            break;
                                        }
                                        eg.m("Failed to retrieve name from IdentityTrait");
                                        return null;
                                    }
                                    go41 go41Var1119 = (go41) this.d;
                                    fryVar2.a = str21;
                                    fryVar2.b = str22;
                                    fryVar2.c = null;
                                    fryVar2.d = null;
                                    fryVar2.e = str20;
                                    fryVar2.f = uv00Var4;
                                    fryVar2.g = str24;
                                    fryVar2.h = uv00Var5;
                                    fryVar2.i = str26;
                                    fryVar2.t = i;
                                    fryVar2.X = z;
                                    fryVar2.N0 = 5;
                                    z3 = z;
                                    obj2 = obj;
                                    objA = go41Var1119.a(str22, str21, str25, str17, fryVar2);
                                    if (objA == obj2) {
                                        return obj2;
                                    }
                                    str28 = str21;
                                    str29 = str22;
                                    i2 = i;
                                    z4 = z3;
                                    str30 = str20;
                                    who0Var2 = (who0) objA;
                                    if (who0Var2 == null) {
                                        z2 = z4;
                                        str20 = str30;
                                        str21 = str28;
                                        str27 = str26;
                                        who0Var = null;
                                        jo70Var2 = uv00Var5.a(jo70.class, str24).b;
                                        if (jo70Var2 != null) {
                                            break;
                                        }
                                        eg.m("Failed to retrieve name from IdentityTrait");
                                        return null;
                                    }
                                    fryVar2.a = str28;
                                    fryVar2.b = null;
                                    fryVar2.c = null;
                                    fryVar2.d = null;
                                    fryVar2.e = str30;
                                    fryVar2.f = uv00Var4;
                                    fryVar2.g = str24;
                                    fryVar2.h = uv00Var5;
                                    fryVar2.i = str26;
                                    fryVar2.t = i2;
                                    fryVar2.X = z4;
                                    fryVar2.N0 = 6;
                                    objD = d(who0Var2, str29, fryVar2);
                                    if (objD == obj2) {
                                        return obj2;
                                    }
                                    objA2 = objD;
                                    z5 = z4;
                                    str31 = str24;
                                    uv00Var6 = uv00Var4;
                                    str32 = str26;
                                    z2 = z5;
                                    str27 = str32;
                                    str24 = str31;
                                    uv00Var4 = uv00Var6;
                                    who0Var = (who0) objA2;
                                    str20 = str30;
                                    str21 = str28;
                                    jo70Var2 = uv00Var5.a(jo70.class, str24).b;
                                    if (jo70Var2 != null) {
                                        break;
                                    }
                                    eg.m("Failed to retrieve name from IdentityTrait");
                                    return null;
                                }
                                str27 = str26;
                                z2 = z;
                                who0Var = null;
                                jo70Var2 = uv00Var5.a(jo70.class, str24).b;
                                if (jo70Var2 != null) {
                                    break;
                                }
                                eg.m("Failed to retrieve name from IdentityTrait");
                                return null;
                            case 5:
                                z4 = fryVar2.X;
                                int i10 = fryVar2.t;
                                String str50 = fryVar2.i;
                                uv00 uv00Var10 = fryVar2.h;
                                String str51 = fryVar2.g;
                                uv00Var4 = fryVar2.f;
                                str20 = fryVar2.e;
                                String str52 = fryVar2.b;
                                String str53 = fryVar2.a;
                                hm5.M(objA2);
                                i2 = i10;
                                uv00Var5 = uv00Var10;
                                str28 = str53;
                                str29 = str52;
                                str24 = str51;
                                str26 = str50;
                                objA = objA2;
                                obj2 = d9nVar;
                                str30 = str20;
                                who0Var2 = (who0) objA;
                                if (who0Var2 == null) {
                                    z2 = z4;
                                    str20 = str30;
                                    str21 = str28;
                                    str27 = str26;
                                    who0Var = null;
                                    jo70Var2 = uv00Var5.a(jo70.class, str24).b;
                                    if (jo70Var2 != null) {
                                        break;
                                    }
                                    eg.m("Failed to retrieve name from IdentityTrait");
                                    return null;
                                }
                                fryVar2.a = str28;
                                fryVar2.b = null;
                                fryVar2.c = null;
                                fryVar2.d = null;
                                fryVar2.e = str30;
                                fryVar2.f = uv00Var4;
                                fryVar2.g = str24;
                                fryVar2.h = uv00Var5;
                                fryVar2.i = str26;
                                fryVar2.t = i2;
                                fryVar2.X = z4;
                                fryVar2.N0 = 6;
                                objD = d(who0Var2, str29, fryVar2);
                                if (objD == obj2) {
                                    return obj2;
                                }
                                objA2 = objD;
                                z5 = z4;
                                str31 = str24;
                                uv00Var6 = uv00Var4;
                                str32 = str26;
                                z2 = z5;
                                str27 = str32;
                                str24 = str31;
                                uv00Var4 = uv00Var6;
                                who0Var = (who0) objA2;
                                str20 = str30;
                                str21 = str28;
                                jo70Var2 = uv00Var5.a(jo70.class, str24).b;
                                if (jo70Var2 != null) {
                                    break;
                                }
                                eg.m("Failed to retrieve name from IdentityTrait");
                                return null;
                            case 6:
                                z5 = fryVar2.X;
                                str32 = fryVar2.i;
                                uv00Var5 = fryVar2.h;
                                str31 = fryVar2.g;
                                uv00Var6 = fryVar2.f;
                                str30 = fryVar2.e;
                                str28 = fryVar2.a;
                                hm5.M(objA2);
                                z2 = z5;
                                str27 = str32;
                                str24 = str31;
                                uv00Var4 = uv00Var6;
                                who0Var = (who0) objA2;
                                str20 = str30;
                                str21 = str28;
                                jo70Var2 = uv00Var5.a(jo70.class, str24).b;
                                if (jo70Var2 != null) {
                                    break;
                                }
                                eg.m("Failed to retrieve name from IdentityTrait");
                                return null;
                            default:
                                eg.m("call to 'resume' before 'invoke' with coroutine");
                                return null;
                        }
                    }

                    public void l(String str) {
                        this.f = str;
                    }

                    public void m(byte[] bArr) {
                        this.h = bArr;
                    }

                    public void n(byte[] bArr) {
                        this.e = bArr;
                    }

                    public void o(String str) {
                        this.c = asj0.p(str);
                    }

                    public void p(ArrayList arrayList) {
                        this.d = arrayList;
                    }

                    public mr20 r() {
                        return rqt0.u(new vow((kge) this.h, this, (byte) 1));
                    }

                    public void z() {
                        EncoreButton encoreButton = (EncoreButton) this.f;
                        bpb1 bpb1Var = (bpb1) this.e;
                        ImageView imageView = (ImageView) this.h;
                        ParagraphView paragraphView = (ParagraphView) this.g;
                        Float fValueOf = Float.valueOf(1.0f);
                        mmr0 mmr0Var = new mmr0(paragraphView, fValueOf);
                        ParagraphView paragraphView2 = (ParagraphView) this.b;
                        mmr0 mmr0Var2 = new mmr0(paragraphView2, fValueOf);
                        ParagraphView paragraphView3 = (ParagraphView) this.c;
                        List listM = p7h.M(new mmr0[]{mmr0Var, mmr0Var2, new mmr0(paragraphView3, Float.valueOf(0.7f))});
                        qdy qdyVar = (qdy) this.d;
                        boolean z = qdyVar.n;
                        Iterator it = listM.iterator();
                        while (true) {
                            float f = 0.0f;
                            if (!it.hasNext()) {
                                break;
                            }
                            mmr0 mmr0Var3 = (mmr0) it.next();
                            ParagraphView paragraphView4 = (ParagraphView) mmr0Var3.a;
                            float fFloatValue = ((Number) mmr0Var3.b).floatValue();
                            paragraphView4.setVisibility(0);
                            if (!z) {
                                f = fFloatValue;
                            }
                            paragraphView4.setAlpha(f);
                        }
                        paragraphView.x(qdyVar.h);
                        paragraphView2.x(qdyVar.i);
                        paragraphView3.x(qdyVar.j);
                        bpb1Var.m((Object) null, Boolean.valueOf(z));
                        sgc1.x(qdyVar.l, encoreButton, ((zda) qdyVar).c, qdyVar.o, bpb1Var, new sg0(1, (lnm) null, (byte) 10));
                        encoreButton.setVisibility(z ? 4 : 0);
                        encoreButton.setAlpha(z ? 0.0f : 1.0f);
                        imageView.setAlpha(1.0f);
                        imageView.setScaleX(z ? 0.0f : 1.0f);
                        imageView.setScaleY(z ? 0.0f : 1.0f);
                        imageView.setVisibility(0);
                        imageView.setImageBitmap(qdyVar.k);
                    }

                    public goq(Context context, qor qorVar, zor zorVar, f2l f2lVar, apr aprVar, jo20 jo20Var) {
                        this.a = (byte) 16;
                        this.g = context;
                        this.b = qorVar;
                        this.c = zorVar;
                        this.d = f2lVar;
                        this.e = aprVar;
                        this.f = jo20Var;
                    }

                    public goq(gj5 gj5Var, l8s l8sVar, hwb hwbVar, Scheduler scheduler) {
                        this.a = (byte) 13;
                        this.g = gj5Var;
                        this.b = l8sVar;
                        this.c = scheduler;
                        this.d = new vku();
                        this.h = new m9s(this, (byte) 0);
                    }

                    public goq(dxz0 dxz0Var, bcp bcpVar, vwm1 vwm1Var, bl3 bl3Var, hbv hbvVar, ak3 ak3Var, q8n q8nVar) {
                        h9n h9nVar;
                        this.a = (byte) 19;
                        this.g = dxz0Var;
                        this.b = vwm1Var;
                        this.c = bl3Var;
                        this.d = hbvVar;
                        this.e = ak3Var;
                        this.f = q8nVar;
                        switch (bcpVar.a) {
                            case 0:
                                h9nVar = new h9n(ak3Var, (byte) 27);
                                break;
                            case 1:
                                h9nVar = new h9n(ak3Var, (byte) 27);
                                break;
                            case 2:
                                h9nVar = new h9n(ak3Var, (byte) 27);
                                break;
                            default:
                                h9nVar = new h9n(ak3Var, (byte) 27);
                                break;
                        }
                        this.h = h9nVar;
                    }

                    public goq(zr00 zr00Var, yh2 yh2Var, g7h g7hVar, a6z a6zVar, i4q i4qVar, e8r0 e8r0Var) {
                        this.a = (byte) 24;
                        this.g = zr00Var;
                        this.b = yh2Var;
                        this.c = g7hVar;
                        this.d = a6zVar;
                        this.e = i4qVar;
                        this.f = e8r0Var;
                        this.h = gio1.b(b7x.a);
                    }

                    public goq(nw40 nw40Var, gj5 gj5Var, y0o y0oVar) {
                        this.a = (byte) 11;
                        this.g = nw40Var;
                        this.b = gj5Var;
                        this.c = y0oVar;
                        this.d = new idd1(new y6s(this, (byte) 3));
                        this.e = new idd1(new y6s(this, (byte) 2));
                        this.f = new idd1(new y6s(this, (byte) 1));
                        this.h = new idd1(new y6s(this, (byte) 0));
                    }

                    public goq(i710 i710Var, a710 a710Var, Flowable flowable, bnj0 bnj0Var, dg8 dg8Var, fgr fgrVar, dxz0 dxz0Var, Scheduler scheduler) {
                        this.a = (byte) 21;
                        this.g = i710Var;
                        this.b = a710Var;
                        this.c = bnj0Var;
                        this.d = dg8Var;
                        this.e = dxz0Var;
                        this.f = scheduler;
                        vbm[] vbmVarArr = q601.a;
                        this.h = new kge(flowable);
                    }

                    public /* synthetic */ goq(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, byte b) {
                        this.a = b;
                        this.g = obj;
                        this.b = obj2;
                        this.c = obj3;
                        this.d = obj4;
                        this.e = obj5;
                        this.f = obj6;
                        this.h = obj7;
                    }

                    public goq(Uri uri, String str) {
                        this.a = (byte) 18;
                        this.g = str;
                        this.b = uri;
                    }

                    public goq(LayoutInflater layoutInflater, ViewGroup viewGroup, gw70 gw70Var, xfx xfxVar, i7d i7dVar, uny unyVar) {
                        this.a = (byte) 27;
                        this.g = unyVar;
                        ConstraintLayout constraintLayoutInflate = layoutInflater.inflate(2131625147, viewGroup, false);
                        int i = 2131428200;
                        CoordinatorLayout coordinatorLayoutT = m5n1.t(constraintLayoutInflate, 2131428200);
                        if (coordinatorLayoutT != null) {
                            i = 2131429739;
                            if (m5n1.t(constraintLayoutInflate, 2131429739) != null) {
                                ConstraintLayout constraintLayout = constraintLayoutInflate;
                                this.b = new nsg(constraintLayout, coordinatorLayoutT);
                                ufx ufxVar = xfxVar.d;
                                xe00 xe00Var = new xe00(ufxVar.a, ufxVar.b);
                                this.c = xe00Var;
                                yyr yyrVar = new yyr(xfxVar.c.b);
                                this.d = yyrVar;
                                this.e = new idd1(oxx.Z0);
                                this.f = new idd1(oxx.Y0);
                                coordinatorLayoutT.addView((BehaviorRetainingAppBarLayout) xe00Var.d.b, 0);
                                AppBarLayout appBarLayoutFindViewById = coordinatorLayoutT.findViewById(2131427590);
                                ComposeView composeView = yyrVar.d;
                                appBarLayoutFindViewById.addView(composeView);
                                composeView.setPaddingRelative(composeView.getResources().getDimensionPixelOffset(2131166829), composeView.getPaddingTop(), composeView.getResources().getDimensionPixelOffset(2131166828), composeView.getPaddingBottom());
                                composeView.setBackgroundColor(composeView.getContext().getColor(2131101505));
                                constraintLayout.findViewById(2131429739).setContent(new j2i(850367251, new g6w(this, gw70Var, i7dVar, (byte) 27), true));
                                return;
                            }
                        }
                        bhn0.i("Missing required view with ID: ".concat(constraintLayoutInflate.getResources().getResourceName(i)));
                        throw null;
                    }

                    public goq(k0q k0qVar, qop qopVar, tbt tbtVar) {
                        this.a = (byte) 4;
                        this.g = tbtVar;
                        this.e = qopVar;
                        this.f = k0qVar;
                        this.b = iy81.a(new ipq(this, 1, (byte) 27));
                        this.c = iy81.a(new ipq(this, 2, (byte) 27));
                        this.d = iy81.a(new ipq(this, 0, (byte) 27));
                        this.h = new ipq(this, 3, (byte) 27);
                    }

                    public goq(nle1 nle1Var, ole1 ole1Var, q7r0 q7r0Var) {
                        this.a = (byte) 6;
                        this.g = nle1Var;
                        this.c = ole1Var;
                        this.d = q7r0Var;
                        this.b = xqu.b(new tsq(this, 1, (byte) 4));
                        this.e = new tsq(this, 0, (byte) 4);
                        this.f = new tsq(this, 3, (byte) 4);
                        this.h = new tsq(this, 2, (byte) 4);
                    }

                    public goq(hle1 hle1Var, ile1 ile1Var, q7r0 q7r0Var) {
                        this.a = (byte) 5;
                        this.g = hle1Var;
                        this.c = ile1Var;
                        this.d = q7r0Var;
                        this.b = xqu.b(new tsq(this, 0, (byte) 3));
                        this.e = new tsq(this, 1, (byte) 3);
                        this.f = new tsq(this, 3, (byte) 3);
                        this.h = new tsq(this, 2, (byte) 3);
                    }

                    public goq(lk81 lk81Var, kk81 kk81Var) {
                        this.a = (byte) 1;
                        this.g = lk81Var;
                        this.h = kk81Var;
                        this.b = xqu.b(new ipq(this, 1, (byte) 13));
                        this.c = xqu.b(new ipq(this, 0, (byte) 13));
                        this.d = xqu.b(new ipq(this, 3, (byte) 13));
                        this.e = xqu.b(new ipq(this, 4, (byte) 13));
                        this.f = xqu.b(new ipq(this, 2, (byte) 13));
                    }

                    public goq(v8a1 v8a1Var, i9a1 i9a1Var, q7r0 q7r0Var) {
                        this.a = (byte) 2;
                        this.g = v8a1Var;
                        this.f = i9a1Var;
                        this.h = q7r0Var;
                        this.b = xqu.b(new ipq(this, 1, (byte) 21));
                        this.c = iy81.a(new ipq(this, 2, (byte) 21));
                        this.d = xqu.b(new ipq(this, 0, (byte) 21));
                        this.e = xqu.b(new ipq(this, 3, (byte) 21));
                    }

                    public goq(b0j1 b0j1Var) {
                        this.a = (byte) 8;
                        this.g = b0j1Var;
                        this.b = xqu.b(new tsq(this, 0, (byte) 16));
                        this.c = xqu.b(new tsq(this, 1, (byte) 16));
                        this.d = iy81.a(new tsq(this, 2, (byte) 16));
                        this.e = iy81.a(new tsq(this, 3, (byte) 16));
                        this.f = iy81.a(new tsq(this, 4, (byte) 16));
                        this.h = xqu.b(new tsq(this, 5, (byte) 16));
                    }

                    public goq(zta1 zta1Var, dua1 dua1Var, q7r0 q7r0Var) {
                        this.a = (byte) 3;
                        this.g = dua1Var;
                        this.e = zta1Var;
                        this.f = q7r0Var;
                        this.b = xqu.b(new ipq(this, 0, (byte) 24));
                        this.h = new ipq(this, 1, (byte) 24);
                        this.c = xqu.b(new ipq(this, 2, (byte) 24));
                        this.d = xqu.b(new ipq(this, 3, (byte) 24));
                    }

                    public goq(zzj1 zzj1Var, b0k1 b0k1Var, q7r0 q7r0Var) {
                        this.a = (byte) 9;
                        this.g = q7r0Var;
                        this.b = xqu.b(new tsq(this, 0, (byte) 19));
                        this.c = xqu.b(new tsq(this, 3, (byte) 19));
                        this.d = iy81.a(new tsq(this, 2, (byte) 19));
                        this.e = iy81.a(new tsq(this, 4, (byte) 19));
                        this.f = iy81.a(new tsq(this, 5, (byte) 19));
                        this.h = iy81.a(new tsq(this, 1, (byte) 19));
                    }

                    public goq(cxi1 cxi1Var, dxi1 dxi1Var, q7r0 q7r0Var) {
                        this.a = (byte) 7;
                        this.g = cxi1Var;
                        this.f = q7r0Var;
                        this.b = iy81.a(new tsq(this, 1, (byte) 15));
                        this.c = iy81.a(new tsq(this, 0, (byte) 15));
                        this.d = iy81.a(new tsq(this, 2, (byte) 15));
                        this.h = new tsq(this, 4, (byte) 15);
                        this.e = iy81.a(new tsq(this, 3, (byte) 15));
                    }

                    public goq(qns0 qns0Var, uu00 uu00Var, joo jooVar, go41 go41Var, vbs vbsVar, rzq rzqVar) {
                        this.a = (byte) 23;
                        this.g = qns0Var;
                        this.b = uu00Var;
                        this.c = jooVar;
                        this.d = go41Var;
                        this.e = vbsVar;
                        this.f = rzqVar;
                        this.h = w3p1.o(new l4r(pwc0.b, 1, rqy.Y, new j4r(rqy.t), rqy.Z), rqy.X);
                    }

                    public goq(n221 n221Var, o221 o221Var) {
                        this.a = (byte) 0;
                        this.g = n221Var;
                        this.b = xqu.b(new ykq(this, 0, (byte) 18));
                        this.c = xqu.b(new ykq(this, 1, (byte) 18));
                        this.d = iy81.a(new ykq(this, 2, (byte) 18));
                        this.e = iy81.a(new ykq(this, 3, (byte) 18));
                        this.f = iy81.a(new ykq(this, 4, (byte) 18));
                        this.h = iy81.a(new ykq(this, 5, (byte) 18));
                    }

                    public goq(Context context, dn3 dn3Var, rdd1 rdd1Var, o2i0 o2i0Var, il00 il00Var, LogSessionId logSessionId) {
                        this.a = (byte) 28;
                        this.g = context;
                        this.b = dn3Var;
                        this.c = rdd1Var;
                        this.d = o2i0Var;
                        if (il00Var == null) {
                            yws ywsVar = new yws();
                            ((j0g1) ywsVar).G = true;
                            ywsVar.N = false;
                            il00Var = new sws(new zws(ywsVar));
                        }
                        this.e = il00Var;
                        this.f = logSessionId;
                        this.h = new p58((byte) 5);
                    }
                }
