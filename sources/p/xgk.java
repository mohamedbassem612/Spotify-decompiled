package p;

import java.util.Collections;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class xgk extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ bhk b;
    public final /* synthetic */ String c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xgk(bhk bhkVar, String str, byte b) {
        super(1);
        this.a = b;
        this.b = bhkVar;
        this.c = str;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        String str = this.c;
        bhk bhkVar = this.b;
        switch (b) {
            case 0:
                fn31.T(cto1.q(bhkVar.h), (o8n) null, 0, new wgk(bhkVar, str, null, (byte) 0), 3);
                bhkVar.b(2131959151, Collections.singletonList(str));
                break;
            default:
                fn31.T(cto1.q(bhkVar.h), (o8n) null, 0, new wgk(bhkVar, str, null, (byte) 1), 3);
                bhkVar.b(2131959153, Collections.singletonList(str));
                break;
        }
        return rih1Var;
    }
}
