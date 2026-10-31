package p;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.channels.Channels;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final /* synthetic */ class v8a0 implements j9a0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ w8a0 b;

    public /* synthetic */ v8a0(w8a0 w8a0Var, byte b) {
        this.a = b;
        this.b = w8a0Var;
    }

    public final void run() throws IOException {
        byte b = this.a;
        w8a0 w8a0Var = this.b;
        switch (b) {
            case 0:
                g9a0 g9a0Var = (g9a0) w8a0Var;
                byte b2 = 1;
                if (g9a0Var.k == null) {
                    g9a0Var.m.l = 10;
                    g9a0Var.i.setDoOutput(true);
                    g9a0Var.i.connect();
                    g9a0Var.m.l = 12;
                    OutputStream outputStream = g9a0Var.i.getOutputStream();
                    g9a0Var.l = outputStream;
                    g9a0Var.k = Channels.newChannel(outputStream);
                }
                w8a0Var.a.set(0);
                w8a0Var.b(new v8a0(w8a0Var, b2), "readFromProvider");
                break;
            default:
                w8a0Var.d.read(w8a0Var, w8a0Var.e);
                w8a0Var.c.execute(new gv40(w8a0Var, (byte) 5));
                break;
        }
    }
}
