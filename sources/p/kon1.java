package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class kon1 extends AbstractSet {
    public final /* synthetic */ byte a;
    public final /* synthetic */ rpn1 b;

    public /* synthetic */ kon1(rpn1 rpn1Var, byte b) {
        this.a = b;
        this.b = rpn1Var;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        byte b = this.a;
        rpn1 rpn1Var = this.b;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                rpn1Var.clear();
                break;
            default:
                rpn1Var.clear();
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        byte b = this.a;
        rpn1 rpn1Var = this.b;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                Map mapD = rpn1Var.d();
                if (mapD != null) {
                    return mapD.entrySet().contains(obj);
                }
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    int iH = rpn1Var.h(entry.getKey());
                    if (iH != -1 && poo1.K(rpn1Var.c()[iH], entry.getValue())) {
                        return true;
                    }
                }
                return false;
            default:
                return rpn1Var.containsKey(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        byte b = this.a;
        rpn1 rpn1Var = this.b;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                Map mapD = rpn1Var.d();
                return mapD != null ? mapD.entrySet().iterator() : new mnn1(rpn1Var, (byte) 1);
            default:
                Map mapD2 = rpn1Var.d();
                return mapD2 != null ? mapD2.keySet().iterator() : new mnn1(rpn1Var, (byte) 0);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        byte b = this.a;
        rpn1 rpn1Var = this.b;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                Map mapD = rpn1Var.d();
                if (mapD != null) {
                    return mapD.entrySet().remove(obj);
                }
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    if (!rpn1Var.f()) {
                        int iG = rpn1Var.g();
                        Object key = entry.getKey();
                        Object value = entry.getValue();
                        Object obj2 = rpn1Var.a;
                        Objects.requireNonNull(obj2);
                        int iH0 = l4o1.h0(key, value, iG, obj2, rpn1Var.a(), rpn1Var.b(), rpn1Var.c());
                        if (iH0 != -1) {
                            rpn1Var.e(iH0, iG);
                            rpn1Var.f--;
                            rpn1Var.e += 32;
                            return true;
                        }
                    }
                }
                return false;
            default:
                Map mapD2 = rpn1Var.d();
                if (mapD2 != null) {
                    return mapD2.keySet().remove(obj);
                }
                return rpn1Var.j(obj) != rpn1.t;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        byte b = this.a;
        rpn1 rpn1Var = this.b;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                break;
        }
        return rpn1Var.size();
    }
}
