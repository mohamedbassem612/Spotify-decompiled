package p;

import android.widget.EditText;
import android.widget.TextView;
import com.spotify.encoremobile.component.buttons.EncoreButton;
import com.spotify.encoremobile.facepile.FaceView;
import com.spotify.mobius.Connection;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class ngh implements Connection {
    public eww0 a;
    public String b;
    public Boolean c;
    public kmh d;
    public boolean e;
    public final /* synthetic */ ogh f;

    public ngh(ogh oghVar) {
        this.f = oghVar;
    }

    public final void accept(Object obj) {
        int i;
        rph rphVar = (rph) obj;
        kmh kmhVar = rphVar.h;
        ace0 ace0Var = rphVar.e;
        String str = rphVar.i;
        ogh oghVar = this.f;
        bpb1 bpb1Var = oghVar.g;
        jgh jghVar = oghVar.e;
        TextView textView = jghVar.c;
        FaceView faceView = jghVar.g;
        EditText editText = jghVar.d;
        bpb1Var.getClass();
        bpb1Var.m((Object) null, rphVar);
        ace0 ace0Var2 = rphVar.d;
        if (ace0Var2 instanceof ebe0) {
            Object obj2 = ((ebe0) ace0Var2).a;
            if (!u890.j(obj2, this.a)) {
                eww0 eww0Var = (eww0) obj2;
                this.a = eww0Var;
                faceView.e(oghVar.b, new td10(eww0Var.f, eww0Var.a, eww0Var.b, (sd10) null));
                faceView.setVisibility(0);
            }
        }
        if (!u890.j(str, this.b)) {
            if (this.b == null) {
                editText.setText(str);
            }
            this.b = str;
            int length = 500 - str.length();
            EncoreButton encoreButton = jghVar.h;
            textView.setText(String.valueOf(length));
            if (length > 20) {
                i = 2130968791;
            } else {
                i = length > 10 ? 2130968792 : 2130968789;
            }
            textView.setTextColor(xfo1.r(textView, i));
            encoreButton.setVisibility((ihc1.y0(str) || !editText.hasFocus()) ? 8 : 0);
            encoreButton.setEnabled(length >= 0);
        }
        if (ace0Var instanceof ebe0) {
            ebe0 ebe0Var = (ebe0) ace0Var;
            Object obj3 = ebe0Var.a;
            if (!u890.j(obj3, this.c)) {
                this.c = (Boolean) obj3;
                if (ebe0Var.a(Boolean.TRUE)) {
                    editText.setVisibility(0);
                    jghVar.e.setVisibility(8);
                }
            }
        }
        boolean z = rphVar.c instanceof ebe0;
        if (z && !this.e) {
            oghVar.b(editText.getText());
        }
        if (!u890.j(kmhVar, this.d) || z != this.e) {
            this.d = kmhVar;
            oghVar.d(rphVar);
        }
        this.e = z;
    }

    public final void dispose() {
        ogh oghVar = this.f;
        rph rphVar = (rph) oghVar.g.getValue();
        String string = (rphVar != null ? rphVar.f12p : null) == null ? ihc1.e1(oghVar.e.d.getText().toString()).toString() : "";
        oghVar.a.f.put(oghVar.d, string);
    }
}
