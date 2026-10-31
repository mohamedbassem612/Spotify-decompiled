package p;

import java.util.Collections;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class mgq0 implements h3o0, n8h1, p8h1 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ mgq0(Object obj, byte b) {
        this.a = b;
        this.d = obj;
        this.b = obj;
        this.c = obj;
    }

    public final r6h1 b() {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                break;
        }
        return ((ttk0) obj).b();
    }

    public final w7h1 d() {
        byte b = this.a;
        b7x b7xVar = b7x.a;
        Object obj = this.d;
        switch (b) {
            case 0:
                return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", "bluetoothpermission:acquisitionsheet:open_native_permission_dialog")), ((ttk0) obj).b, r6h1.c, System.currentTimeMillis());
            default:
                return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("navigate_to_external_uri", 1, Collections.singletonMap("destination", "bluetoothpermission:acquisitionsheet:go_to_settings")), ((ttk0) obj).b, r6h1.c, System.currentTimeMillis());
        }
    }

    public final l7h1 e() {
        byte b = this.a;
        Object obj = this.c;
        switch (b) {
            case 0:
                break;
        }
        return ((ttk0) obj).e();
    }
}
