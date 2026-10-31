package p;

import android.view.View;
import android.widget.AdapterView;
import androidx.appcompat.widget.SearchView;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class qk5 implements AdapterView.OnItemClickListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ qk5(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        l320 state;
        k320 k320Var;
        iu30 onOptionSelected;
        byte b = this.a;
        Object obj = null;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                sk5 sk5Var = (sk5) obj2;
                vk5 vk5Var = sk5Var.f1;
                vk5Var.setSelection(i);
                if (vk5Var.getOnItemClickListener() != null) {
                    vk5Var.performItemClick(view, i, sk5Var.c1.getItemId(i));
                }
                sk5Var.dismiss();
                break;
            case 1:
                fav favVar = (fav) obj2;
                Object itemAtPosition = adapterView.getItemAtPosition(i);
                if (itemAtPosition != null && (state = favVar.getState()) != null) {
                    for (Object obj3 : state.e) {
                        if (u890.j(((k320) obj3).b, itemAtPosition)) {
                            obj = obj3;
                            k320Var = (k320) obj;
                            if (k320Var != null && (onOptionSelected = favVar.getOnOptionSelected()) != null) {
                                onOptionSelected.invoke(k320Var.a);
                            }
                            break;
                        }
                    }
                    k320Var = (k320) obj;
                    if (k320Var != null) {
                        onOptionSelected.invoke(k320Var.a);
                        break;
                    }
                }
                break;
            case 2:
                qbh0 qbh0Var = (qbh0) obj2;
                y0d0 y0d0Var = qbh0Var.e;
                qbh0Var.b(i < 0 ? !y0d0Var.Y0.isShowing() ? null : y0d0Var.c.getSelectedItem() : qbh0Var.getAdapter().getItem(i));
                AdapterView.OnItemClickListener onItemClickListener = qbh0Var.getOnItemClickListener();
                if (onItemClickListener != null) {
                    if (view == null || i < 0) {
                        view = !y0d0Var.Y0.isShowing() ? null : y0d0Var.c.getSelectedView();
                        i = !y0d0Var.Y0.isShowing() ? -1 : y0d0Var.c.getSelectedItemPosition();
                        j = !y0d0Var.Y0.isShowing() ? Long.MIN_VALUE : y0d0Var.c.getSelectedItemId();
                    }
                    onItemClickListener.onItemClick(y0d0Var.c, view, i, j);
                }
                y0d0Var.dismiss();
                break;
            default:
                ((SearchView) obj2).o(i);
                break;
        }
    }
}
