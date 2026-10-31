package p;

import android.content.Context;
import android.net.Uri;
import com.spotify.aipartner.promptsuggestionsprovider.PromptSuggestionsWorker;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class gge0 extends hab0 implements xu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Context b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ gge0(Context context, byte b) {
        super(3);
        this.a = b;
        this.b = context;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        Context context = this.b;
        switch (b) {
            case 0:
                String str = (String) obj3;
                ciq0 ciq0Var = new ciq0(PromptSuggestionsWorker.class);
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                linkedHashMap.put("content_uri", ((Uri) obj).toString());
                linkedHashMap.put("calling_package", (String) obj2);
                linkedHashMap.put("request_id", str);
                ewq ewqVar = new ewq(linkedHashMap);
                o0c.N(ewqVar);
                awl1.d(context.getApplicationContext()).c("partner_ai_prompt_suggestions_v1:".concat(str), 2, ciq0Var.i(ewqVar).a("partner_ai_prompt_suggestions_v1").b());
                break;
            case 1:
                x340 x340Var = (b0k) obj2;
                ((Number) obj3).intValue();
                yoi1.d(new p05(2131233396), context.getString(2131959288), (gt40) null, 0, (u8h) null, x340Var, 0, 28);
                et40 et40Var = et40.a;
                fc11.g(obh.a(et40Var), x340Var, 0);
                String string = context.getString(2131959298);
                kee1 kee1Var = nee1.d;
                x340 x340Var2 = x340Var;
                Object objT = x340Var2.T();
                m4c m4cVar = fkj0.X;
                if (objT == m4cVar) {
                    objT = xjm0.W0;
                    x340Var2.s0(objT);
                }
                o4p1.g(string, iko1.x(et40Var, (iu30) objT), kee1Var, 0, x340Var2, 0, 8);
                String string2 = context.getString(2131959297);
                kee1 kee1Var2 = nee1.e;
                Object objT2 = x340Var2.T();
                if (objT2 == m4cVar) {
                    objT2 = xjm0.X0;
                    x340Var2.s0(objT2);
                }
                o4p1.g(string2, iko1.x(et40Var, (iu30) objT2), kee1Var2, 0, x340Var2, 0, 8);
                break;
            default:
                b0k b0kVar = (b0k) obj2;
                ((Number) obj3).intValue();
                eox eoxVar = eox.c;
                jsl jslVar = new jsl(context.getString(2131962688));
                uwr uwrVar = cbx.a;
                w0h1.a(eoxVar, jslVar, (qim0) null, cbx.a(b0kVar).c.b, 0L, false, b0kVar, eox.d, 52);
                break;
        }
        return rih1Var;
    }
}
