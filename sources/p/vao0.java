package p;

import android.webkit.PermissionRequest;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class vao0 implements ihr0 {
    public final /* synthetic */ xao0 a;
    public final /* synthetic */ ArrayList b;
    public final /* synthetic */ PermissionRequest c;

    public vao0(xao0 xao0Var, ArrayList arrayList, PermissionRequest permissionRequest) {
        this.a = xao0Var;
        this.b = arrayList;
        this.c = permissionRequest;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0057  */
    public final boolean b(ehr0 ehr0Var) {
        if (!(ehr0Var instanceof bos0)) {
            return false;
        }
        this.a.h.remove(this);
        ArrayList arrayList = new ArrayList();
        Iterator it = this.b.iterator();
        while (true) {
            boolean zBooleanValue = true;
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            String str = (String) next;
            if (u890.j(str, "android.webkit.resource.AUDIO_CAPTURE")) {
                Map map = ((bos0) ehr0Var).a;
                Boolean bool = (Boolean) map.get("android.permission.MODIFY_AUDIO_SETTINGS");
                if (bool != null ? bool.booleanValue() : true) {
                    Boolean bool2 = (Boolean) map.get("android.permission.RECORD_AUDIO");
                    if (!(bool2 != null ? bool2.booleanValue() : true)) {
                        zBooleanValue = false;
                    }
                } else {
                    zBooleanValue = false;
                }
            } else if (u890.j(str, "android.webkit.resource.VIDEO_CAPTURE")) {
                Boolean bool3 = (Boolean) ((bos0) ehr0Var).a.get("android.permission.CAMERA");
                if (bool3 != null) {
                    zBooleanValue = bool3.booleanValue();
                }
            } else {
                zBooleanValue = false;
            }
            if (zBooleanValue) {
                arrayList.add(next);
            }
        }
        boolean zIsEmpty = arrayList.isEmpty();
        PermissionRequest permissionRequest = this.c;
        if (zIsEmpty) {
            permissionRequest.deny();
            return true;
        }
        permissionRequest.grant((String[]) arrayList.toArray(new String[0]));
        return true;
    }
}
