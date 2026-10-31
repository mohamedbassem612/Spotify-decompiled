package p;

import android.util.Log;
import androidx.car.app.model.Action;
import androidx.car.app.model.ActionStrip;
import androidx.car.app.model.CarIcon;
import androidx.car.app.model.CarText;
import androidx.car.app.model.Header;
import androidx.car.app.model.MessageTemplate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class c6j0 {
    public boolean a;
    public CarText b;
    public final CarText c;
    public CarText d;
    public CarIcon e;
    public Action f;
    public ActionStrip g;
    public final ArrayList h = new ArrayList();
    public Header i;

    public c6j0(CharSequence charSequence) {
        Objects.requireNonNull(charSequence);
        this.c = CarText.create(charSequence);
    }

    public final MessageTemplate a() {
        if (this.a && this.e != null) {
            eg.m("Template in a loading state can not have an icon");
            return null;
        }
        if (this.c.isEmpty()) {
            eg.m("Message cannot be empty");
            return null;
        }
        String str = "" + Log.getStackTraceString(null);
        if (!str.isEmpty()) {
            this.d = CarText.create(str);
        }
        return new MessageTemplate(this);
    }

    public final void b(Header header) {
        if (header.getStartHeaderAction() != null) {
            this.f = header.getStartHeaderAction();
        }
        if (header.getTitle() != null) {
            this.b = header.getTitle();
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
            this.g = new ActionStrip(a80Var);
        }
        this.i = header;
    }
}
