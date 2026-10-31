package p;

import androidx.car.app.model.Action;
import androidx.car.app.model.ActionStrip;
import androidx.car.app.model.CarText;
import androidx.car.app.model.Header;
import androidx.car.app.model.Pane;
import androidx.car.app.model.PaneTemplate;
import java.util.Iterator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class rnr0 {
    public CarText a;
    public Pane b;
    public Action c;
    public ActionStrip d;
    public Header e;

    public final PaneTemplate a() {
        gw31 gw31Var = gw31.d;
        Pane pane = this.b;
        gw31Var.getClass();
        int size = pane.getActions().size();
        byte b = gw31Var.a;
        if (size > b) {
            hhg1.n(f4i1.c(b, "The number of actions on the pane exceeded the supported max of "));
            return null;
        }
        gw31Var.a(pane.getRows());
        v90.m.a(pane.getActions());
        return new PaneTemplate(this);
    }

    public final void b(Header header) {
        if (header.getStartHeaderAction() != null) {
            this.c = header.getStartHeaderAction();
        }
        if (header.getTitle() != null) {
            this.a = header.getTitle();
        }
        if (!header.getEndHeaderActions().isEmpty()) {
            a80 a80Var = new a80();
            Iterator<Action> it = header.getEndHeaderActions().iterator();
            while (it.hasNext()) {
                a80Var.a(it.next());
            }
            if (a80Var.a.isEmpty()) {
                eg.m("Action strip must contain at least one action");
                return;
            }
            this.d = new ActionStrip(a80Var);
        }
        this.e = header;
    }
}
