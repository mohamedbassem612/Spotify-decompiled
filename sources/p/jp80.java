package p;

import android.view.View;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class jp80 extends x2s {
    public final nml b;
    public final Function0 c;

    public jp80(nml nmlVar) {
        Function0 function0C;
        super(vgp1.R0);
        this.b = nmlVar;
        oly0 oly0Var = nmlVar instanceof oly0 ? (oly0) nmlVar : null;
        this.c = (oly0Var == null || (function0C = oly0Var.c()) == null) ? new nd70(this, (byte) 18) : function0C;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jp80) && u890.j(this.b, ((jp80) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public jp80(View view) {
        this(obg1.n(view));
    }

    public jp80(Function0 function0) {
        this((nml) new oly0(function0));
    }
}
