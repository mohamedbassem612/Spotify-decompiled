package p;

import java.util.UUID;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class nqh {
    public final hl30 a;
    public final y1t0 b;
    public final llm c;

    public nqh(hl30 hl30Var, y1t0 y1t0Var, llm llmVar) {
        this.a = hl30Var;
        this.b = y1t0Var;
        this.c = llmVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(String str, String str2, onm onmVar) {
        mqh mqhVar;
        String str3;
        if (onmVar instanceof mqh) {
            mqhVar = (mqh) onmVar;
            int i = mqhVar.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                mqhVar.e = i - Integer.MIN_VALUE;
            } else {
                mqhVar = new mqh(this, onmVar);
            }
        } else {
            mqhVar = new mqh(this, onmVar);
        }
        Object objM = mqhVar.c;
        int i2 = mqhVar.e;
        try {
            if (i2 == 0) {
                hm5.M(objM);
                awe aweVar = new awe(this, (lnm) null, (byte) 10);
                mqhVar.a = str;
                mqhVar.b = str2;
                mqhVar.e = 1;
                objM = rc2.M(5000L, aweVar, mqhVar);
                d9n d9nVar = d9n.a;
                if (objM == d9nVar) {
                    return d9nVar;
                }
            } else {
                if (i2 != 1) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                str2 = mqhVar.b;
                str = mqhVar.a;
                hm5.M(objM);
            }
            str3 = ((ei31) objM).a;
        } catch (Exception e) {
            n57.t("Failed to generate risk device id", e);
            str3 = "";
        }
        fn31.T(this.c, (o8n) null, 0, new bag(this, new el30(gl30.b, UUID.randomUUID().toString(), str, str2, new bl30(str3)), (lnm) null, (byte) 13), 3);
        return str3;
    }
}
