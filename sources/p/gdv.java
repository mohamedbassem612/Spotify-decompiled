package p;

import android.net.Uri;
import android.os.Bundle;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class gdv extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gdv(c380 c380Var, String str, qpj1 qpj1Var, iu30 iu30Var, boolean z, iu30 iu30Var2) {
        super(1);
        this.a = (byte) 8;
        this.c = c380Var;
        this.d = str;
        this.e = qpj1Var;
        this.f = iu30Var;
        this.b = z;
        this.g = iu30Var2;
    }

    /* JADX WARN: Code duplicated, block: B:62:0x02a6  */
    public final Object invoke(Object obj) {
        Set set;
        String string;
        long jB;
        byte b = this.a;
        boolean z = this.b;
        rih1 rih1Var = rih1.a;
        Object obj2 = this.g;
        Object obj3 = this.f;
        Object obj4 = this.e;
        Object obj5 = this.d;
        Object obj6 = this.c;
        switch (b) {
            case 0:
                mv51 mv51Var = (mv51) obj5;
                rtb0 rtb0Var = (rtb0) obj;
                hdv hdvVar = (hdv) obj3;
                rdv rdvVar = (rdv) obj6;
                c380 c380Var = rdvVar.h;
                if (z) {
                    rtb0.f(rtb0Var, "search_header", new j2i(643149578, new gk0((g451) obj4, rdvVar, hdvVar, (byte) 10), true), 2);
                }
                w6d1.w(rtb0Var, c380Var, mv51Var, 0, 8);
                if (!z) {
                    rtb0.c(rtb0Var, (Object) null, iki.a, 3);
                }
                w6d1.w(rtb0Var, rdvVar.i, mv51Var, c380Var.size(), 4);
                jdv jdvVarC = rdvVar.c();
                boolean z2 = jdvVarC instanceof jdv;
                if (z2) {
                    rtb0.c(rtb0Var, (Object) null, new j2i(-1668372106, new e6j(hdvVar, jdvVarC, (byte) 23), true), 3);
                }
                if (!z2 || !rdvVar.e) {
                    rtb0.c(rtb0Var, (Object) null, new j2i(160834231, new e6j(rdvVar, (tao0) obj2, (byte) 24), true), 3);
                }
                break;
            case 1:
                tv80 tv80Var = (tv80) obj;
                zeu zeuVar = (zeu) obj6;
                if (z) {
                    z6k0 z6k0Var = (z6k0) zeuVar.a;
                    Map map = ((qxc0) obj5).X;
                    z6k0Var.getClass();
                    if (z6k0.b(map)) {
                        set = (Set) obj4;
                    } else {
                        set = w7x.a;
                    }
                } else {
                    set = w7x.a;
                }
                ktv.b((ktv) zeuVar.c, (String) obj3, tv80Var, set, (g3d0) obj2, 8);
                break;
            case 2:
                tv80 tv80Var2 = (tv80) obj;
                String str = (String) obj4;
                String str2 = (String) obj5;
                String str3 = (String) obj6;
                if (z) {
                    Uri.Builder builderAppendQueryParameter = new Uri.Builder().encodedPath("spotify:internal:contribution-notes-management:picker").appendQueryParameter("context_uri", str3).appendQueryParameter("item_uri", str2);
                    if (str != null) {
                        builderAppendQueryParameter.appendQueryParameter("list_item_id", str);
                    }
                    string = builderAppendQueryParameter.build().toString();
                } else {
                    String str4 = (String) obj3;
                    Uri.Builder builderAppendQueryParameter2 = new Uri.Builder().encodedPath("spotify:internal:contribution-notes-management:menu:".concat(ihc1.V0(str4, ':', str4))).appendQueryParameter("context_uri", str3).appendQueryParameter("item_uri", str2);
                    if (str != null) {
                        builderAppendQueryParameter2.appendQueryParameter("list_item_id", str);
                    }
                    string = builderAppendQueryParameter2.build().toString();
                }
                a1r0.e((a1r0) ((ruc0) obj2).b, new dwn0(string, "", false, false, 0, 0, false, (a690) null, (Bundle) null, new bwn0(tv80Var2)), (Bundle) null, 6);
                break;
            case 3:
                tv80 tv80Var3 = (tv80) obj;
                phi0 phi0Var = (phi0) obj6;
                if (!z) {
                    rss rssVar = (rss) ((p811) obj4).a;
                    if (rssVar == null) {
                        n57.e("Context-menu interaction was not logged before its action was invoked");
                    }
                    fn31.T(cto1.q((dg30) phi0Var.b), (q8n) phi0Var.f, 0, new zvu0(phi0Var, (String) obj3, (dwu0) obj2, rssVar, (lnm) null, (byte) 0), 2);
                } else {
                    ((lzn0) phi0Var.e).a((String) obj5, tv80Var3, (Bundle) null);
                }
                break;
            case 4:
                qtr qtrVar = (qtr) obj;
                qtrVar.b(new kjv0(qtrVar, (a1q) obj6, this.b, (d78) obj5, (kv00) obj4, (String) obj3, (pzn0) obj2, null));
                break;
            case 5:
                e261 e261Var = (e261) obj;
                b261.t(e261Var, 0);
                b261.p(e261Var, z ? z6x.a : ((String) obj6) == null ? Collections.singletonList(new epo((String) obj5, new us21((Function0) obj3, (byte) 26))) : Collections.singletonList(new epo((String) obj4, new us21((Function0) obj2, (byte) 27))));
                break;
            case 6:
                DrawScope drawScope = (DrawScope) obj;
                wat watVar = (wat) obj4;
                tob1 tob1Var = (tob1) obj5;
                q2f1 q2f1Var = (q2f1) obj6;
                Integer num = q2f1Var.b;
                if (num == null) {
                    uwr uwrVar = cbx.a;
                    jB = u7h.b(((yex) zex.a.d).e, ((Number) tob1Var.getValue()).floatValue(), 0.0f, 0.0f, 0.0f, 14);
                } else {
                    jB = u7h.b(z4p1.e(num.intValue()), ((Number) tob1Var.getValue()).floatValue(), 0.0f, 0.0f, 0.0f, 14);
                }
                DrawScope.d0(drawScope, jB, 0L, drawScope.j(), 0.0f, (phc1) null, (ColorFilter) null, 122);
                if (q2f1Var.g && !z) {
                    float fX0 = watVar.X0(24.0f);
                    float fX1 = watVar.X0(4.0f);
                    float fIntBitsToFloat = fX0 + fX1;
                    float fFloatValue = ((Number) ((tob1) obj3).getValue()).floatValue();
                    uwr uwrVar2 = cbx.a;
                    long j = ((vex) zex.a.e).c;
                    if (((flb0) obj2) == flb0.b) {
                        fIntBitsToFloat = Float.intBitsToFloat((int) (drawScope.j() >> 32)) - fIntBitsToFloat;
                    }
                    DrawScope.b0(drawScope, j, fX0, (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits((Float.intBitsToFloat((int) (drawScope.j() & 4294967295L)) - fX0) - fX1)) & 4294967295L), fFloatValue, (DrawStyle) null, 112);
                }
                break;
            case 7:
                String str5 = (String) obj5;
                iu30 iu30Var = ((mfj1) obj6).d;
                if (!z) {
                    iu30Var.invoke(new sej1(str5, (String) obj3, (m4m) obj2));
                } else {
                    iu30Var.invoke(new uej1(str5, (String) obj4));
                }
                break;
            default:
                c380 c380Var2 = (c380) obj6;
                ((rtb0) obj).e(c380Var2.size(), new vse1(c380Var2, (byte) 14), new vse1(c380Var2, (byte) 15), new j2i(2039820996, new ymh(c380Var2, (String) obj5, (qpj1) obj4, (iu30) obj3, this.b, (iu30) obj2), true));
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gdv(a1q a1qVar, boolean z, d78 d78Var, kv00 kv00Var, String str, pzn0 pzn0Var) {
        super(1);
        this.a = (byte) 4;
        this.c = a1qVar;
        this.b = z;
        this.d = d78Var;
        this.e = kv00Var;
        this.f = str;
        this.g = pzn0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ gdv(byte b, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, boolean z) {
        super(1);
        this.a = b;
        this.b = z;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f = obj4;
        this.g = obj5;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gdv(q2f1 q2f1Var, tob1 tob1Var, boolean z, wat watVar, tob1 tob1Var2, flb0 flb0Var) {
        super(1);
        this.a = (byte) 6;
        this.c = q2f1Var;
        this.d = tob1Var;
        this.b = z;
        this.e = watVar;
        this.f = tob1Var2;
        this.g = flb0Var;
    }
}
