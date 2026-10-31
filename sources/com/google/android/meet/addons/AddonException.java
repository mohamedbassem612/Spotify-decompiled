package com.google.android.meet.addons;

import java.util.Objects;
import p.gvg;
import p.m02;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public class AddonException extends RuntimeException {
    public final m02 a;

    /* JADX WARN: Illegal instructions before constructor call */
    public AddonException(String str, m02 m02Var) {
        m02 m02Var2 = m02.a;
        if (str == null && m02Var.equals(m02Var2)) {
            str = null;
        } else if (!m02Var.equals(m02Var2)) {
            str = str == null ? m02Var.name() : gvg.h(str, " [", m02Var.name(), "]");
        }
        super(str);
        this.a = m02Var;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof AddonException)) {
            return false;
        }
        AddonException addonException = (AddonException) obj;
        if (this.a != addonException.a) {
            return false;
        }
        if (getMessage() == null && addonException.getMessage() == null) {
            return true;
        }
        return getMessage() != null && getMessage().equals(addonException.getMessage());
    }

    public final int hashCode() {
        return Objects.hash(this.a, getMessage());
    }
}
