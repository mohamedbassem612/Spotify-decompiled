package p;

import android.net.Uri;
import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class tnf0 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ wh71 a;

    public tnf0(sjb sjbVar, wh71 wh71Var) {
        this.a = wh71Var;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x010d  */
    /* JADX WARN: Code duplicated, block: B:35:0x0110  */
    /* JADX WARN: Code duplicated, block: B:51:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    public final Object a(Object obj, r261 r261Var, onm onmVar) {
        snf0 snf0Var;
        pdw pdwVar;
        ouo1 ouo1Var;
        d9n pz70Var;
        int i;
        Uri uri;
        d9n d9nVarG;
        Object obj2;
        d9n d9nVar;
        Object objK;
        l771 clw0Var;
        if (onmVar instanceof snf0) {
            snf0Var = (snf0) onmVar;
            int i2 = snf0Var.b;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                snf0Var.b = i2 - Integer.MIN_VALUE;
            } else {
                snf0Var = new snf0(this, onmVar);
            }
        } else {
            snf0Var = new snf0(this, onmVar);
        }
        snf0 snf0Var2 = snf0Var;
        Object obj3 = snf0Var2.a;
        int i3 = snf0Var2.b;
        d9n d9nVar2 = d9n.a;
        if (i3 != 0) {
            if (i3 == 1) {
                i = snf0Var2.f;
                uri = snf0Var2.e;
                pdwVar = snf0Var2.d;
                hm5.M(obj3);
                obj2 = obj3;
                ouo1Var = null;
            } else if (i3 == 2) {
                i = snf0Var2.f;
                hm5.M(obj3);
                objK = obj3;
                ouo1Var = null;
                d9nVar = d9nVar2;
                clw0Var = new clw0(new zmt((umt) objK));
                snf0Var2.d = ouo1Var;
                snf0Var2.e = ouo1Var;
                snf0Var2.f = i;
                snf0Var2.b = 3;
                if (this.a.a(clw0Var, snf0Var2) == d9nVar) {
                    return d9nVar;
                }
            } else {
                if (i3 != 3) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj3);
            }
            return rih1.a;
        }
        hm5.M(obj3);
        pdwVar = (pdw) obj;
        wkt wktVar = pdwVar.d;
        rnf0 rnf0Var = pdwVar.c;
        o571 o571VarA = wktVar.a();
        List listL1 = o7h.l1(pdwVar.d.g());
        Uri uri2 = pdwVar.e;
        String str = rnf0Var.b;
        kw9 kw9Var = rnf0Var.a;
        int i4 = bmq0.i(kw9Var.a);
        int i5 = bmq0.i(kw9Var.b);
        String str2 = rnf0Var.c.a;
        snf0Var2.d = pdwVar;
        snf0Var2.e = uri2;
        snf0Var2.f = 0;
        snf0Var2.b = 1;
        d9n vkc0Var = new vkc0(str, null, null, null, null, 30);
        if (kyo1.r(o571VarA)) {
            d9nVarG = vkc0.g(vkc0Var, sqg0.O(vkc0Var.c, Collections.singletonMap("lyrics_provider_id", str2)), null, 27);
        } else if (listL1.contains(yy61.IMAGE_STORY)) {
            d9nVarG = new f9c1(str, new ant(i4, i5), uri2 != null ? new bnt(uri2) : null, vkc0Var.b, vkc0Var.c, vkc0Var.d, new o371(null, false, false, 7));
        } else {
            if (listL1.contains(yy61.IMAGE)) {
                ouo1Var = null;
                pz70Var = new pz70(uri2, str, vkc0Var.b, vkc0Var.d, vkc0Var.c, null, null);
            }
            if (pz70Var == d9nVar2) {
                d9nVarG = vkc0Var;
                return d9nVar2;
            }
            d9nVarG = vkc0Var;
            i = 0;
            uri = uri2;
            obj2 = pz70Var;
        }
        d9nVarG = vkc0Var;
        ouo1Var = null;
        pz70Var = d9nVarG;
        if (pz70Var == d9nVar2) {
            d9nVarG = vkc0Var;
            return d9nVar2;
        }
        d9nVarG = vkc0Var;
        i = 0;
        uri = uri2;
        obj2 = pz70Var;
        p371 p371Var = (p371) obj2;
        wkt wktVar2 = pdwVar.d;
        xx3 xx3Var = new xx3(uri, pdwVar, ouo1Var, (byte) 5);
        o4 o4Var = new o4(uri, ouo1Var, (byte) 2);
        ouo1 vj61Var = uri != null ? new vj61(new qj61(new sj61(new uj61(uri)), cuo1.J(pdwVar.c.f).a), ouo1Var) : ouo1Var;
        n3o1 ssdVar = vj61Var != null ? new ssd(vj61Var) : tsd.c;
        snf0Var2.d = ouo1Var;
        snf0Var2.e = ouo1Var;
        snf0Var2.f = i;
        snf0Var2.b = 2;
        d9nVar = d9nVar2;
        objK = fq7.K(wktVar2, p371Var, xx3Var, o4Var, null, ssdVar, snf0Var2, 24);
        if (objK == d9nVar) {
            return d9nVar;
        }
        clw0Var = new clw0(new zmt((umt) objK));
        snf0Var2.d = ouo1Var;
        snf0Var2.e = ouo1Var;
        snf0Var2.f = i;
        snf0Var2.b = 3;
        if (this.a.a(clw0Var, snf0Var2) == d9nVar) {
            return d9nVar;
        }
        return rih1.a;
    }
}
