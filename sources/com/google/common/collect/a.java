package com.google.common.collect;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import p.dm5;
import p.ffp0;
import p.gfp0;
import p.jg11;
import p.p380;
import p.q380;
import p.x980;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class a extends x980 {
    public final /* synthetic */ q380 d;

    public a(q380 q380Var) {
        this.d = q380Var;
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Use EntrySetSerializedForm");
    }

    public final boolean contains(Object obj) {
        if (!(obj instanceof ffp0)) {
            return false;
        }
        ffp0 ffp0Var = (ffp0) obj;
        if (ffp0Var.a() <= 0) {
            return false;
        }
        return ((jg11) this.d).e.b(ffp0Var.a) == ffp0Var.a();
    }

    @Override // p.x980
    public final Object get(int i) {
        gfp0 gfp0Var = ((jg11) this.d).e;
        dm5.q(i, gfp0Var.c);
        return new ffp0(gfp0Var, i);
    }

    public final int hashCode() {
        return this.d.hashCode();
    }

    public final boolean i() {
        return false;
    }

    public final int size() {
        return this.d.l().size();
    }

    @Override // p.x980
    public Object writeReplace() {
        return new p380(this.d);
    }
}
