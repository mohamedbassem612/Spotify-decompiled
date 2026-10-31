package p;

import android.content.Context;
import android.net.Uri;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class rl5 extends a8d1 implements vu30 {
    public /* synthetic */ Object a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ String c;
    public final /* synthetic */ nl5 d;
    public final /* synthetic */ WeakReference e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rl5(Context context, String str, nl5 nl5Var, WeakReference weakReference, lnm lnmVar) {
        super(2, lnmVar);
        this.b = context;
        this.c = str;
        this.d = nl5Var;
        this.e = weakReference;
    }

    public final lnm<rih1> create(Object obj, lnm<?> lnmVar) {
        rl5 rl5Var = new rl5(this.b, this.c, this.d, this.e, lnmVar);
        rl5Var.a = obj;
        return rl5Var;
    }

    public final Object invoke(c9n c9nVar, lnm<? super rih1> lnmVar) {
        return create(c9nVar, lnmVar).invokeSuspend(rih1.a);
    }

    public final Object invokeSuspend(Object obj) {
        Uri m231Var;
        hm5.M(obj);
        Context context = this.b;
        String str = this.c;
        nl5 nl5Var = this.d;
        try {
            m231Var = context.getContentResolver().insert(Uri.parse(str), nl5Var.getContentValues$continuity_release());
        } catch (Throwable th) {
            m231Var = new m231(th);
        }
        boolean z = m231Var instanceof m231;
        WeakReference weakReference = this.e;
        cte0 cte0Var = cte0.a;
        if (!z) {
            if (m231Var == null) {
                cte0Var.w("AppContextManager", "Response not accepted, requester returned a null URI");
                ynm ynmVar = (eg70) weakReference.get();
                if (ynmVar != null) {
                    ynmVar.a(nl5Var, new UnknownError("Response not accepted, requester returned a null URI"));
                }
            } else {
                cte0Var.i("AppContextManager", "Response sent successfully");
            }
        }
        Throwable thA = e331.a(m231Var);
        if (thA != null) {
            String message = thA.getMessage();
            message.getClass();
            cte0Var.e("AppContextManager", message, thA);
            ynm ynmVar2 = (eg70) weakReference.get();
            if (ynmVar2 != null) {
                ynmVar2.a(nl5Var, thA);
            }
        }
        return rih1.a;
    }
}
