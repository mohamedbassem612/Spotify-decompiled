package p;

import android.view.ContentInfo;
import android.view.View;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public abstract class y7k1 {
    public static String[] a(View view) {
        return view.getReceiveContentMimeTypes();
    }

    public static ful b(View view, ful fulVar) {
        ContentInfo contentInfoC = fulVar.c();
        ContentInfo contentInfoPerformReceiveContent = view.performReceiveContent(contentInfoC);
        if (contentInfoPerformReceiveContent == null) {
            return null;
        }
        return contentInfoPerformReceiveContent == contentInfoC ? fulVar : new ful(new rcl(contentInfoPerformReceiveContent));
    }

    public static void c(View view, String[] strArr, y7q0 y7q0Var) {
        if (y7q0Var == null) {
            view.setOnReceiveContentListener(strArr, null);
        } else {
            view.setOnReceiveContentListener(strArr, new z7k1(y7q0Var));
        }
    }
}
