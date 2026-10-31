package p;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.spotify.encoremobile.component.buttons.EncoreButton;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class hjz extends v4n {
    public xiz b2;
    public Function0 c2;
    public Function0 d2;

    @Override // p.zf30
    public final void D0() {
        this.h1 = true;
        Y0();
    }

    @Override // p.haa
    public final void k1(t4n t4nVar) {
        t4nVar.g().L(3);
        t4nVar.g().K(true);
    }

    @Override // p.haa
    public final void l1() {
        Function0 function0 = this.d2;
        if (function0 != null) {
            function0.invoke();
        } else {
            u890.C("onDismiss");
            throw null;
        }
    }

    @Override // p.v4n
    public final View n1(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        a9x a9xVarB = a9x.b(layoutInflater, viewGroup);
        EncoreButton encoreButton = a9xVarB.c;
        rwq0.s(a9xVarB.a(), gft.Z0);
        TextView textView = a9xVarB.d;
        xiz xizVar = this.b2;
        if (xizVar == null) {
            u890.C("config");
            throw null;
        }
        textView.setText(p1((djz) xizVar.c().a));
        TextView textView2 = a9xVarB.b;
        xiz xizVar2 = this.b2;
        if (xizVar2 == null) {
            u890.C("config");
            throw null;
        }
        textView2.setText(p1(xizVar2.a().a()));
        xiz xizVar3 = this.b2;
        if (xizVar3 == null) {
            u890.C("config");
            throw null;
        }
        encoreButton.setText(p1(xizVar3.b().a()));
        encoreButton.setOnClickListener(new zfs(this, (byte) 10));
        return a9xVarB.a();
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final String p1(djz djzVar) throws NoWhenBranchMatchedException {
        if (djzVar instanceof cjz) {
            return l0(((cjz) djzVar).a);
        }
        if (djzVar instanceof bjz) {
            return ((bjz) djzVar).a();
        }
        eg.o();
        return null;
    }
}
