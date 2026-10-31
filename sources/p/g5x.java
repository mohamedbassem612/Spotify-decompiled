package p;

import android.text.InputFilter;
import android.text.method.PasswordTransformationMethod;
import android.text.method.TransformationMethod;
import android.util.SparseArray;
import android.widget.TextView;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class g5x extends gio1 {
    public final TextView d;
    public final i4x e;
    public boolean f = true;

    public g5x(TextView textView) {
        this.d = textView;
        this.e = new i4x(textView);
    }

    public final void A(boolean z) {
        if (z) {
            TextView textView = this.d;
            textView.setTransformationMethod(E(textView.getTransformationMethod()));
        }
    }

    public final void B(boolean z) {
        this.f = z;
        TextView textView = this.d;
        textView.setTransformationMethod(E(textView.getTransformationMethod()));
        textView.setFilters(p(textView.getFilters()));
    }

    public final TransformationMethod E(TransformationMethod transformationMethod) {
        if (this.f) {
            return ((transformationMethod instanceof l5x) || (transformationMethod instanceof PasswordTransformationMethod)) ? transformationMethod : new l5x(transformationMethod);
        }
        return transformationMethod instanceof l5x ? ((l5x) transformationMethod).a : transformationMethod;
    }

    public final InputFilter[] p(InputFilter[] inputFilterArr) {
        if (!this.f) {
            SparseArray sparseArray = new SparseArray(1);
            for (int i = 0; i < inputFilterArr.length; i++) {
                InputFilter inputFilter = inputFilterArr[i];
                if (inputFilter instanceof i4x) {
                    sparseArray.put(i, inputFilter);
                }
            }
            if (sparseArray.size() == 0) {
                return inputFilterArr;
            }
            int length = inputFilterArr.length;
            InputFilter[] inputFilterArr2 = new InputFilter[inputFilterArr.length - sparseArray.size()];
            int i2 = 0;
            for (int i3 = 0; i3 < length; i3++) {
                if (sparseArray.indexOfKey(i3) < 0) {
                    inputFilterArr2[i2] = inputFilterArr[i3];
                    i2++;
                }
            }
            return inputFilterArr2;
        }
        int length2 = inputFilterArr.length;
        int i4 = 0;
        while (true) {
            i4x i4xVar = this.e;
            if (i4 >= length2) {
                InputFilter[] inputFilterArr3 = new InputFilter[inputFilterArr.length + 1];
                System.arraycopy(inputFilterArr, 0, inputFilterArr3, 0, length2);
                inputFilterArr3[length2] = i4xVar;
                return inputFilterArr3;
            }
            if (inputFilterArr[i4] == i4xVar) {
                return inputFilterArr;
            }
            i4++;
        }
    }

    public final boolean x() {
        return this.f;
    }
}
