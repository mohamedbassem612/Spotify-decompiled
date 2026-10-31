package p;

import android.content.Context;
import com.spotify.player.model.command.SignalCommand;
import io.reactivex.rxjava3.internal.operators.completable.CompletableEmpty;
import io.reactivex.rxjava3.internal.operators.completable.CompletableFromAction;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class l68 extends hab0 implements zu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ m68 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l68(m68 m68Var, byte b) {
        super(4);
        this.a = b;
        this.b = m68Var;
    }

    public final Object J(Object obj, Object obj2, Object obj3, Object obj4) {
        byte b = this.a;
        m68 m68Var = this.b;
        switch (b) {
            case 0:
                i68 i68Var = (j68) obj2;
                c68 c68Var = (c68) obj3;
                tqw tqwVar = (tqw) obj4;
                p68 p68Var = m68Var.b;
                if (!(i68Var instanceof i68)) {
                    CompletableEmpty completableEmpty = CompletableEmpty.a;
                    completableEmpty.getClass();
                    return completableEmpty;
                }
                if (c68Var instanceof a68) {
                    return ((w9u0) p68Var.b).a(new k9u0(SignalCommand.create("switch-to-audio"))).ignoreElement();
                }
                if (!(c68Var instanceof b68)) {
                    if (!(c68Var instanceof z58)) {
                        eg.o();
                        return null;
                    }
                    i68 i68Var2 = i68Var;
                    h68 h68Var = i68Var2.a;
                    if (h68Var instanceof h68) {
                        String str = i68Var2.b;
                        ne2 ne2Var = h68Var.b;
                        return ne2Var instanceof je2 ? new CompletableFromAction(new o68(p68Var, str, ((je2) ne2Var).a, (tv80) null)) : ((w9u0) p68Var.b).a(new k9u0(SignalCommand.create("switch-to-video"))).ignoreElement();
                    }
                    CompletableEmpty completableEmpty2 = CompletableEmpty.a;
                    completableEmpty2.getClass();
                    return completableEmpty2;
                }
                i68 i68Var3 = i68Var;
                h68 h68Var2 = i68Var3.a;
                if (!(h68Var2 instanceof h68)) {
                    return CompletableEmpty.a;
                }
                h68 h68Var3 = h68Var2;
                int i = h68Var3.d;
                if (i != 0) {
                    return new CompletableFromAction(new n68(p68Var, i, (byte) 0));
                }
                if (h68Var3.c) {
                    hma1 hma1VarEdit = m68Var.d.a.edit();
                    hma1VarEdit.a(sad1.b, true);
                    hma1VarEdit.g();
                }
                tv80 tv80VarY = tqwVar != null ? n3o1.y(tqwVar) : null;
                String str2 = i68Var3.b;
                ne2 ne2Var2 = h68Var3.b;
                return ne2Var2 instanceof je2 ? new CompletableFromAction(new o68(p68Var, str2, ((je2) ne2Var2).a, tv80VarY)) : ((w9u0) p68Var.b).a(new k9u0(SignalCommand.create("switch-to-video"))).ignoreElement();
            default:
                return new vh((Context) obj2, m68Var, (iu30) obj4);
        }
    }
}
