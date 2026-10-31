package p;

import android.net.Uri;
import com.spotify.signup.signup.v2.proto.Error;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class ney implements y371 {
    public final gqg a;
    public final boolean b;
    public final s6v0 c;
    public final qwe1 d;

    public ney(gqg gqgVar, boolean z, s6v0 s6v0Var, qwe1 qwe1Var) {
        this.a = gqgVar;
        this.b = z;
        this.c = s6v0Var;
        this.d = qwe1Var;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    @Override // p.y371
    public final Object a(ywy ywyVar, o571 o571Var, List list, Uri uri, lnm lnmVar) {
        mey meyVar;
        String str;
        Long lD0;
        Object objA;
        ywy ywyVar2;
        bwe1 bwe1Var;
        o571 o571Var2;
        List list2;
        Uri uri2;
        wwy wwyVar;
        LinkedHashMap linkedHashMap;
        wa71 wa71Var;
        String strA;
        llw0 llw0Var;
        if (lnmVar instanceof mey) {
            meyVar = (mey) lnmVar;
            int i = meyVar.X;
            if ((i & Integer.MIN_VALUE) != 0) {
                meyVar.X = i - Integer.MIN_VALUE;
            } else {
                meyVar = new mey(this, (onm) lnmVar);
            }
        } else {
            meyVar = new mey(this, (onm) lnmVar);
        }
        mey meyVar2 = meyVar;
        Object obj = meyVar2.i;
        int i2 = meyVar2.X;
        d9n d9nVar = d9n.a;
        if (i2 == 0) {
            hm5.M(obj);
            wa71 wa71Var2 = ywyVar.a().a.a;
            wwy wwyVar2 = ywyVar instanceof wwy ? (wwy) ywyVar : null;
            LinkedHashMap linkedHashMap2 = new LinkedHashMap((Map) wa71Var2.c);
            bwe1 bwe1Var2 = wwyVar2 != null ? wwyVar2.i : null;
            String str2 = wa71Var2.a;
            boolean z = ((exy) ywyVar.a().b()).d;
            meyVar2.a = ywyVar;
            meyVar2.b = o571Var;
            meyVar2.c = list;
            meyVar2.d = uri;
            meyVar2.e = wa71Var2;
            meyVar2.f = wwyVar2;
            meyVar2.g = linkedHashMap2;
            meyVar2.h = bwe1Var2;
            meyVar2.X = 1;
            s6v0 s6v0Var = this.c;
            rih1 rih1Var = rih1.a;
            if (bwe1Var2 != null) {
                objA = s6v0Var.a(linkedHashMap2, str2, bwe1Var2.a, meyVar2);
                if (objA != d9nVar) {
                    objA = rih1Var;
                }
            } else {
                if (!z) {
                    linkedHashMap2.remove("t");
                    linkedHashMap2.remove("ct");
                    linkedHashMap2.remove("imt");
                } else if (((String) linkedHashMap2.get("t")) == null || (str = (String) linkedHashMap2.get("t")) == null || (lD0 = nhc1.d0(10, str)) == null || (objA = s6v0Var.a(linkedHashMap2, str2, lD0.longValue(), meyVar2)) != d9nVar) {
                }
                objA = rih1Var;
            }
            if (objA != d9nVar) {
                bwe1 bwe1Var3 = bwe1Var2;
                ywyVar2 = ywyVar;
                bwe1Var = bwe1Var3;
                o571Var2 = o571Var;
                list2 = list;
                uri2 = uri;
                wwyVar = wwyVar2;
                linkedHashMap = linkedHashMap2;
                wa71Var = wa71Var2;
            }
        }
        if (i2 != 1) {
            if (i2 != 2) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            List list3 = meyVar2.c;
            hm5.M(obj);
            return obj;
        }
        bwe1Var = meyVar2.h;
        linkedHashMap = meyVar2.g;
        wwyVar = meyVar2.f;
        wa71Var = meyVar2.e;
        uri2 = meyVar2.d;
        list2 = meyVar2.c;
        o571Var2 = meyVar2.b;
        ywyVar2 = meyVar2.a;
        hm5.M(obj);
        if (linkedHashMap.containsKey("t")) {
            strA = this.d.a(String.valueOf(bwe1Var != null ? new Long(bwe1Var.a) : null));
        } else {
            strA = null;
        }
        wa71 wa71VarA = wa71.a(wa71Var, null, mqo1.G(linkedHashMap), strA, Error.TOO_YOUNG_FIELD_NUMBER);
        if (wwyVar == null || (llw0Var = wwyVar.f) == null) {
            llw0Var = null;
        } else {
            pdy pdyVar = new pdy(ywyVar2, (byte) 1);
            if (o571Var2 == i571.d && !this.b && (llw0Var instanceof klw0)) {
                llw0Var = (llw0) pdyVar.invoke();
            }
        }
        vmt vmtVarA = this.a.a(o571Var2, list2, new dmt(3));
        jlw0 jlw0VarH = wwyVar != null ? wwyVar.h() : null;
        meyVar2.a = null;
        meyVar2.b = null;
        meyVar2.c = null;
        meyVar2.d = null;
        meyVar2.e = null;
        meyVar2.f = null;
        meyVar2.g = null;
        meyVar2.h = null;
        meyVar2.X = 2;
        Object objA2 = vmtVarA.a(wa71VarA, llw0Var, jlw0VarH, uri2, meyVar2);
        return objA2 == d9nVar ? d9nVar : objA2;
    }
}
