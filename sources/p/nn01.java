package p;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class nn01 extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public boolean b;
    public final /* synthetic */ on01 c;
    public final /* synthetic */ String d;
    public final /* synthetic */ tv80 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ nn01(on01 on01Var, String str, tv80 tv80Var, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.c = on01Var;
        this.d = str;
        this.e = tv80Var;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        switch (this.a) {
            case 0:
                return new nn01(this.c, this.d, this.e, lnmVar, (byte) 0);
            default:
                return new nn01(this.c, this.d, this.e, lnmVar, (byte) 1);
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        c9n c9nVar = (c9n) obj;
        lnm lnmVar = (lnm) obj2;
        switch (b) {
            case 0:
                break;
        }
        return create(c9nVar, lnmVar).invokeSuspend(rih1Var);
    }

    public final Object invokeSuspend(Object obj) {
        Object objF;
        Object objL;
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        tv80 tv80Var = this.e;
        d9n d9nVar = d9n.a;
        on01 on01Var = this.c;
        String str = this.d;
        switch (b) {
            case 0:
                boolean z = this.b;
                if (!z) {
                    hm5.M(obj);
                    xyc0 xyc0Var = on01Var.b;
                    List listSingletonList = Collections.singletonList(str);
                    zxc0 zxc0Var = tv80Var != null ? new zxc0(tv80Var.a) : null;
                    this.b = true;
                    objF = xyc0Var.f("spotify:playlist:37i9dQZF1Fs6Dvo6yu9lo4", listSingletonList, "start", "spotify:search", "spotify:search", zxc0Var, this);
                    if (objF == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (!z) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                    objF = obj;
                }
                ly21 ly21Var = (py21) objF;
                if (!(ly21Var instanceof ly21)) {
                    return rih1Var;
                }
                blc0[] blc0VarArr = on01.f;
                Set set = s4b1.f;
                blc0[] blc0VarArr2 = on01.f;
                if (uic.h(str, (blc0[]) Arrays.copyOf(blc0VarArr2, blc0VarArr2.length))) {
                    return rih1Var;
                }
                on01Var.a(2, str, "Failed to add item. " + ly21Var.a.b());
                return rih1Var;
            default:
                boolean z2 = this.b;
                if (!z2) {
                    hm5.M(obj);
                    xyc0 xyc0Var2 = on01Var.b;
                    List listSingletonList2 = Collections.singletonList(str);
                    this.b = true;
                    objL = xyc0Var2.l("spotify:playlist:37i9dQZF1Fs6Dvo6yu9lo4", listSingletonList2, this, tv80Var);
                    if (objL == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (!z2) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                    objL = obj;
                }
                ly21 ly21Var2 = (py21) objL;
                if (!(ly21Var2 instanceof ly21)) {
                    return rih1Var;
                }
                String strM = l1d.m("Failed to delete item. ", ly21Var2.a.b());
                blc0[] blc0VarArr3 = on01.f;
                on01Var.a(3, str, strM);
                return rih1Var;
        }
    }
}
