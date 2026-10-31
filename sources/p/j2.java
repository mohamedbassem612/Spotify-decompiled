package p;

import android.os.Bundle;
import com.spotify.mobius.functions.Consumer;
import com.spotify.wrapped.widget.v1.WrappedWidgetResources;
import java.util.Collections;
import java.util.Date;
import java.util.LinkedHashSet;
import java.util.Map;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class j2 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j2(rs0 rs0Var, Date date) {
        super(1);
        this.a = (byte) 15;
        this.b = date;
    }

    public final Object invoke(Object obj) throws Exception {
        LinkedHashSet linkedHashSet;
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                qv00 qv00Var = (qv00) obj;
                String str = ((m2) obj2).g;
                qv00Var.a(str, pnt.class, false);
                qv00Var.a(str, jo70.class, false);
                return rih1Var;
            case 1:
                v3 v3Var = (v3) obj2;
                return d3p1.H(v3Var.a, v3Var.g, (s3) obj);
            case 2:
                cas casVar = (a7m0) obj;
                casVar.a = e3.e;
                casVar.d = p4.b;
                casVar.e = p4.c;
                x4 x4Var = (x4) obj2;
                oud oudVar = x4Var.c;
                fns fnsVar = igu.a;
                casVar.c = new lud(oudVar, b3s.c, new q4(x4Var, (lnm) null, (byte) 0));
                return rih1Var;
            case 3:
                lj ljVar = (lj) obj;
                Consumer consumer = ((uj) obj2).d;
                if (consumer != null) {
                    consumer.accept(new mcr(ljVar));
                }
                return rih1Var;
            case 4:
                return new rm((vm) obj2, (byte) 0);
            case 5:
                jh5 jh5Var = (jh5) obj;
                s60 s60Var = (s60) obj2;
                w60 w60Var = s60Var.l;
                dmh1 dmh1Var = w60Var.a;
                if (ob51.f(dmh1Var, jh5Var) && ((linkedHashSet = s60Var.k) == null || !linkedHashSet.contains(jh5Var))) {
                    Object objC = w60Var.c.c(jh5Var);
                    if (objC != null) {
                        s60Var.d(Collections.singletonMap(jh5Var, new j3r(objC)));
                    } else {
                        s60Var.i.b(Collections.singleton(jh5Var));
                        i3r i3rVarC = f3r.c(dmh1Var, jh5Var);
                        if (i3rVarC == null) {
                            i3rVarC = i3r.a;
                        }
                        s60Var.d(Collections.singletonMap(jh5Var, i3rVarC));
                    }
                }
                return rih1Var;
            case 6:
                return new wcm(((uv11) obj).a, ((lik1) ((u961) obj2).a).a, (String) null, (ucm) null, (Function0) null, p4.t, false, (String) null, (String) null, 988);
            case 7:
                ((i01) obj2).b(((Number) obj).intValue());
                return rih1Var;
            case 8:
                tm tmVar = (tm) obj2;
                il0 il0Var = (il0) tmVar.c;
                return h5p1.s(il0Var.c, il0Var.d, ((pcl) tmVar.d).a(), sk0.h);
            case 9:
                bl0 bl0Var = (bl0) ((Map) obj).get((String) ((uce0) obj2).b);
                return bl0Var != null ? new it61(bl0Var) : new ht61(2131951818, 0);
            case 10:
                rwq0.z((qtr) obj, new m3((cm0) obj2, (byte) 9));
                return rih1Var;
            case 11:
                rwq0.z((qtr) obj, new gm0((im0) obj2, (byte) 0));
                return rih1Var;
            case 12:
                ((qtr) obj).b(new wm0((an0) obj2, (lnm) null, (byte) 0));
                return rih1Var;
            case 13:
                ((qtr) obj).b(new ep0((jp0) obj2, (lnm) null, (byte) 0));
                return rih1Var;
            case 14:
                return (uer) ((rt01) obj2).d;
            case 15:
                d441 d441VarG1 = ((y341) obj).g1("UPDATE AdOnAppOpenEntity SET isShown = ? WHERE id = ?");
                try {
                    d441VarG1.r(1, 1L);
                    d441VarG1.r(2, ((Date) obj2).getTime());
                    d441VarG1.f1();
                    return rih1Var;
                } finally {
                    d441VarG1.close();
                }
            case 16:
                rwq0.z((qtr) obj, new m3((tm) obj2, (byte) 13));
                return rih1Var;
            case 17:
                rwq0.z((qtr) obj, new m3((bs0) obj2, (byte) 14));
                return rih1Var;
            case 18:
                rwq0.z((qtr) obj, new m3((lw0) obj2, (byte) 16));
                return rih1Var;
            case 19:
                rwq0.z((qtr) obj, new m3((pw0) obj2, (byte) 17));
                return rih1Var;
            case 20:
                rwq0.z((qtr) obj, new m3((qw0) obj2, (byte) 18));
                return rih1Var;
            case 21:
                rwq0.z((qtr) obj, new m3((tw0) obj2, (byte) 19));
                return rih1Var;
            case 22:
                return (qzh) ((dx0) obj2).d;
            case WrappedWidgetResources.WIDGET_BG_LOSSLESS_URL_FIELD_NUMBER /* 23 */:
                rwq0.z((qtr) obj, new m3((ex0) obj2, (byte) 20));
                return rih1Var;
            case 24:
                return (lkr) ((dx0) obj2).d;
            case WrappedWidgetResources.WIDGET_SM_WIFI_URL_FIELD_NUMBER /* 25 */:
                Bundle bundle = (Bundle) obj;
                eb1 eb1Var = (eb1) obj2;
                if (bundle == null) {
                    return eb1Var.c();
                }
                bb1 bb1Var = (bb1) jhc1.t(bundle, "AddBlockedContentModel", bb1.class);
                return bb1Var == null ? eb1Var.c() : bb1Var;
            case 26:
                return new rxc0(((id1) obj2).a);
            case 27:
                return new qzz(((f9w) obj2).b);
            case 28:
                vh1 vh1Var = (vh1) obj2;
                return d3p1.F(vh1Var.c, vh1Var.d, (uho) obj);
            default:
                ((q7r0) obj2).d((String) obj, (tv80) null, (Bundle) null);
                return rih1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j2(Object obj, byte b) {
        super(1);
        this.a = b;
        this.b = obj;
    }
}
