package p;

import java.util.HashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class glm {
    public final HashMap a = new HashMap();

    public final int getType() {
        String string;
        Object obj = this.a.get("requestedContextType");
        if (obj == null || (string = obj.toString()) == null) {
            return -1;
        }
        return Integer.parseInt(string);
    }

    public final void setType$continuity_release(int i) {
        this.a.put("requestedContextType", Integer.valueOf(i));
    }
}
