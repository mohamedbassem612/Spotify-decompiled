package p;

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class f491 extends RecyclerView {
    public final xsw0 l2;

    /* JADX WARN: Multi-variable type inference failed */
    public f491(Context context) {
        super(context);
        xsw0 xsw0Var = new xsw0((byte) 1);
        w280 w280Var = b380.b;
        xsw0Var.e = bg11.e;
        this.l2 = xsw0Var;
        getContext();
        setLayoutManager(new d491(1));
        super.setAdapter(xsw0Var);
        if (isInEditMode()) {
            l391 l391Var = z391.Y;
            setComponents(z391.a, z391.b, z391.g, z391.h, l391Var, l391Var, l391Var, l391Var, l391Var, l391Var, l391Var, l391Var, l391Var);
        }
    }

    public void setComponents(List<e491> list) {
        xsw0 xsw0Var = this.l2;
        xsw0Var.e = list;
        xsw0Var.h();
    }

    public void setComponents(e491... e491VarArr) {
        setComponents(Arrays.asList(e491VarArr));
    }
}
