package p;

import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final /* synthetic */ class g7w extends tv30 implements iu30 {
    public static final g7w a = new g7w(1, h7w.class, "hasEditorAttribute", "hasEditorAttribute(Lcom/spotify/listplatform/endpoints/kodiak/ListMetadataTable$Entity;)Z", 1);

    public final Object invoke(Object obj) {
        Map map;
        qxc0 qxc0Var = (qxc0) obj;
        return Boolean.valueOf(u890.j((qxc0Var == null || (map = qxc0Var.X) == null) ? null : (String) map.get("editorial_profile"), "true"));
    }
}
