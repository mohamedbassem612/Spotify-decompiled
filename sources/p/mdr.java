package p;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatCheckBox;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class mdr implements qzh {
    public final View a;
    public dc b;
    public final TextView c;
    public final TextView d;
    public final TextView e;
    public final TextView f;
    public final AppCompatCheckBox g;
    public final View h;

    public mdr(Context context) {
        View viewInflate = View.inflate(context, 2131626324, null);
        viewInflate.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        this.a = viewInflate;
        this.c = (TextView) viewInflate.findViewById(2131431288);
        this.d = (TextView) viewInflate.findViewById(2131431286);
        this.e = (TextView) viewInflate.findViewById(2131431282);
        this.f = (TextView) viewInflate.findViewById(2131431283);
        this.g = viewInflate.findViewById(2131431186);
        this.h = viewInflate.findViewById(2131431611);
    }

    public final void f(Object obj) {
        dc dcVar = (dc) obj;
        if (u890.j(this.b, dcVar)) {
            return;
        }
        this.b = dcVar;
        this.d.setText(dcVar.b());
        wb wbVarA = dcVar.a();
        String str = wbVarA != null ? wbVarA.a : null;
        TextView textView = this.e;
        textView.setText(str);
        textView.setVisibility(dcVar.a() != null ? 0 : 8);
        wb wbVarC = dcVar.c();
        String str2 = wbVarC != null ? wbVarC.a : null;
        TextView textView2 = this.f;
        textView2.setText(str2);
        textView2.setVisibility(dcVar.c() != null ? 0 : 8);
        boolean z = dcVar instanceof bc;
        View view = this.a;
        AppCompatCheckBox appCompatCheckBox = this.g;
        TextView textView3 = this.c;
        if (z) {
            bc bcVar = (bc) dcVar;
            appCompatCheckBox.setVisibility(bcVar.e != null ? 0 : 8);
            textView3.setVisibility(bcVar.f ? 0 : 8);
            textView3.setText(view.getContext().getString(2131957140));
        } else if (!(dcVar instanceof cc)) {
            eg.o();
            return;
        } else {
            textView3.setVisibility(0);
            textView3.setText(view.getContext().getString(2131957141));
            appCompatCheckBox.setVisibility(0);
        }
        xb xbVar = dcVar.a;
        appCompatCheckBox.setChecked(xbVar != null ? xbVar.a : false);
    }

    public final View getView() {
        return this.a;
    }

    public final void n(iu30 iu30Var) {
        this.e.setOnClickListener(new kdr(this, iu30Var, (byte) 0));
        this.f.setOnClickListener(new kdr(this, iu30Var, (byte) 1));
        this.h.setOnClickListener(new c20(this, (byte) 24));
        this.g.setOnCheckedChangeListener(new ldr(this, iu30Var, (byte) 0));
    }
}
