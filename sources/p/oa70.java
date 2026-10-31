package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final enum oa70 extends gb70 {
    public final int h(y570 y570Var) {
        eb70 eb70Var;
        y570Var.getClass();
        if (hxo1.t(y570Var)) {
            if (dxo1.r(y570Var)) {
                int i = ja70.a;
                eb70Var = y570Var.g().b("hubs:glue:muted", false) ? eb70.i : eb70.h;
            } else if (y570Var.g().r("row_number") != null) {
                int i2 = ja70.a;
                eb70Var = y570Var.g().b("hubs:glue:muted", false) ? eb70.Y : eb70.X;
            } else {
                int i3 = ja70.a;
                eb70Var = y570Var.g().b("hubs:glue:muted", false) ? eb70.t : eb70.g;
            }
        } else if (((id70) y570Var.n()).a.d != null) {
            eb70Var = eb70.b;
        } else {
            eb70Var = dxo1.r(y570Var) ? eb70.d : eb70.c;
        }
        return eb70Var.a;
    }
}
