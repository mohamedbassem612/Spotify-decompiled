package p;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class ewx implements LayoutInflater.Factory2 {
    public final ogr a;

    public ewx(ogr ogrVar) {
        this.a = ogrVar;
    }

    @Override // android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        vu30 vu30Var = (vu30) ((Map) this.a.b).get(str);
        qzh qzhVar = vu30Var != null ? (qzh) vu30Var.invoke(context, attributeSet) : null;
        if (qzhVar == null) {
            return null;
        }
        qzhVar.getView().setId(Integer.parseInt(attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "id").substring(1)));
        View view = qzhVar.getView();
        int i = 0;
        int attributeIntValue = attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "visibility", 0);
        if (attributeIntValue == 1) {
            i = 4;
        } else if (attributeIntValue == 2) {
            i = 8;
        }
        view.setVisibility(i);
        qzhVar.getView().setTag(2131428639, qzhVar);
        return qzhVar.getView();
    }

    @Override // android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        return onCreateView(str, context, attributeSet);
    }
}
