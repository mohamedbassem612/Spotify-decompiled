package p;

import android.view.KeyEvent;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class u6c extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ h9c b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u6c(h9c h9cVar, byte b) {
        super(1);
        this.a = b;
        this.b = h9cVar;
    }

    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                ((ez20) obj).d(d9y0.j(new qka(1, this.b, h9c.class, "onExit", "onExit-3ESFkO8(I)Landroidx/compose/ui/focus/FocusRequester;", 0, (byte) 11)));
                return rih1.a;
            default:
                KeyEvent keyEvent = ((cpa0) obj).a;
                h9c h9cVar = this.b;
                h9cVar.getClass();
                boolean zA = false;
                if (ern1.t(keyEvent) == 2) {
                    long jD = mno1.d(keyEvent.getKeyCode());
                    if (toa0.a(jD, toa0.q)) {
                        zA = h9cVar.a(keyEvent.isShiftPressed() ? 33 : 130);
                    } else if (toa0.a(jD, toa0.f)) {
                        zA = h9cVar.a(130);
                    } else if (toa0.a(jD, toa0.e)) {
                        zA = h9cVar.a(33);
                    }
                }
                return Boolean.valueOf(zA);
        }
    }
}
