package p;

import android.view.DragEvent;
import android.view.View;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class xd4 implements View.OnDragListener, c4v {
    public final d4v a = new d4v(null, 3);
    public final d46 b = new d46(0);
    public final wd4 c = new wd4(this);

    @Override // android.view.View.OnDragListener
    public final boolean onDrag(View view, DragEvent dragEvent) {
        x3v x3vVar = new x3v(dragEvent);
        int action = dragEvent.getAction();
        d46 d46Var = this.b;
        d4v d4vVar = this.a;
        switch (action) {
            case 1:
                l811 l811Var = new l811();
                fn31.o(d4vVar, new pg(x3vVar, d4vVar, l811Var, (byte) 11));
                boolean z = l811Var.a;
                w36 w36Var = new w36(d46Var);
                while (w36Var.hasNext()) {
                    ((e4v) w36Var.next()).W0(x3vVar);
                }
                return z;
            case 2:
                d4vVar.a0(x3vVar);
                return false;
            case 3:
                return d4vVar.Y0(x3vVar);
            case 4:
                d4vVar.I0(x3vVar);
                d46Var.clear();
                return false;
            case 5:
                d4vVar.O0(x3vVar);
                return false;
            case 6:
                d4vVar.q(x3vVar);
                return false;
            default:
                return false;
        }
    }
}
