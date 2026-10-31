package p;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import androidx.core.content.FileProvider;
import com.spotify.base.java.logging.Logger;
import java.io.File;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class r3d {
    public final Context a;
    public final g0i b;
    public iu30 c;
    public Uri d;
    public File e;
    public int f;
    public final ConcurrentHashMap g;
    public final rh0 h;
    public final rh0 i;
    public final rh0 j;

    public r3d(Context context, Activity activity) {
        this.a = context;
        g0i g0iVar = (g0i) activity;
        this.b = g0iVar;
        c0i c0iVar = g0iVar.i;
        this.g = new ConcurrentHashMap();
        this.h = c0iVar.h("camera_capture", new o3d((byte) 7), new p3d(this, (byte) 0));
        this.i = c0iVar.h("video_capture", new e1r0((byte) 8), new p3d(this, (byte) 2));
        this.j = c0iVar.h("camera_permission", new e1r0((byte) 4), new p3d(this, (byte) 1));
    }

    public final void a(iu30 iu30Var) {
        this.c = iu30Var;
        this.f = 1;
        if (x74.j(this.a, "android.permission.CAMERA") == 0) {
            b();
        } else {
            this.j.a("android.permission.CAMERA");
        }
    }

    public final void b() {
        mmr0 mmr0VarD = d(".jpg");
        if (mmr0VarD == null) {
            f(bod.a);
            return;
        }
        File file = (File) mmr0VarD.a;
        Uri uri = (Uri) mmr0VarD.b;
        this.e = file;
        this.d = uri;
        this.h.a(uri);
    }

    public final void c() {
        mmr0 mmr0VarD = d(".mp4");
        if (mmr0VarD == null) {
            f(bod.a);
            return;
        }
        File file = (File) mmr0VarD.a;
        Uri uri = (Uri) mmr0VarD.b;
        this.e = file;
        this.d = uri;
        this.i.a(uri);
    }

    public final mmr0 d(String str) {
        Context context = this.a;
        try {
            File file = new File(context.getCacheDir(), "camera");
            file.mkdirs();
            File fileCreateTempFile = File.createTempFile("camera_", str, file);
            Uri uriForFile = FileProvider.getUriForFile(context, context.getPackageName() + ".share", fileCreateTempFile);
            this.g.put(uriForFile, fileCreateTempFile);
            return new mmr0(fileCreateTempFile, uriForFile);
        } catch (Exception e) {
            Logger.e(e, "MediaPicker: Failed to create camera output file", new Object[0]);
            return null;
        }
    }

    public final void e(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            File file = (File) this.g.remove(Uri.parse((String) it.next()));
            if (file != null) {
                try {
                    if (!file.delete()) {
                        Logger.k("MediaPicker: Failed to delete temp camera file: %s", new Object[]{file.getName()});
                    }
                } catch (SecurityException e) {
                    Logger.e(e, "MediaPicker: Failed to delete temp camera file: %s", new Object[]{file.getName()});
                }
            }
        }
    }

    public final void f(fod fodVar) {
        iu30 iu30Var = this.c;
        this.c = null;
        if (iu30Var != null) {
            iu30Var.invoke(fodVar);
        }
    }
}
