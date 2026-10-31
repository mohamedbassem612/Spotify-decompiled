package p;

import android.content.Context;
import android.view.ViewGroup;
import com.spotify.userinteractivityservice.usercomments.v1.proto.Comment;
import com.spotify.userinteractivityservice.usercomments.v1.proto.GetCommentCardResponse;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class cfh extends hab0 implements zu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ffh b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ cfh(ffh ffhVar, byte b) {
        super(4);
        this.a = b;
        this.b = ffhVar;
    }

    public final Object J(Object obj, Object obj2, Object obj3, Object obj4) {
        switch (this.a) {
            case 0:
                r6h1 r6h1Var = (r6h1) obj4;
                dxk0 dxk0Var = new dxk0(Integer.valueOf(((Number) obj3).intValue()), ((bfh) obj).a, r6h1Var);
                ffh ffhVar = this.b;
                ffhVar.g = dxk0Var;
                GetCommentCardResponse getCommentCardResponse = ((bfh) obj2).b;
                if (!getCommentCardResponse.t().isEmpty() && ((Comment) getCommentCardResponse.t().get(0)).y()) {
                    i8h1 i8h1Var = ffhVar.a;
                    x6h1 x6h1VarC = dxk0Var.b.c();
                    x6h1VarC.i.add(new a7h1("sensitive_comments_disclaimer", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC.j = true;
                    y6h1 y6h1VarA = x6h1VarC.a();
                    k7h1 k7h1Var = new k7h1();
                    ((xjn) k7h1Var).a = y6h1VarA;
                    ((xjn) k7h1Var).b = r6h1Var;
                    ((xjn) k7h1Var).c = Long.valueOf(System.currentTimeMillis());
                    i8h1Var.f(k7h1Var.a(), (Set) null);
                }
                return dxk0Var;
            default:
                return new i34((Context) obj2, (ViewGroup) obj3, (d75) obj, this.b, (iu30) obj4);
        }
    }
}
