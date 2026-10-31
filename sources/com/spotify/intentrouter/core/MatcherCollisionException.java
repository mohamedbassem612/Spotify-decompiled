package com.spotify.intentrouter.core;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p.jbh0;
import p.qs31;
import p.qy8;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public class MatcherCollisionException extends RuntimeException {
    public static MatcherCollisionException a(qs31 qs31Var, List list) {
        ArrayList<jbh0> arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((qy8) it.next()).a);
        }
        StringBuilder sb = new StringBuilder("Collision found for the input: ");
        sb.append(qs31Var);
        sb.append("\n  Colliding matchers:");
        for (jbh0 jbh0Var : arrayList) {
            sb.append("\n    ");
            sb.append(jbh0Var.description());
        }
        return new MatcherCollisionException(sb.toString());
    }
}
