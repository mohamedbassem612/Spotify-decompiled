package com.google.mlkit.vision.text.internal;

import com.google.firebase.components.ComponentRegistrar;
import java.util.List;
import p.bhn0;
import p.enm1;
import p.f4i1;
import p.hzh;
import p.im00;
import p.lzo1;
import p.nqn1;
import p.qok0;
import p.rqn1;
import p.vem1;
import p.vzh;
import p.wct;
import p.y0p1;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public class TextRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    public final List getComponents() {
        hzh hzhVarA = vzh.a(y0p1.class);
        hzhVarA.a(wct.a(qok0.class));
        hzhVarA.f = new vem1();
        vzh vzhVarB = hzhVarA.b();
        hzh hzhVarA2 = vzh.a(lzo1.class);
        hzhVarA2.a(wct.a(y0p1.class));
        hzhVarA2.a(wct.a(im00.class));
        hzhVarA2.f = new enm1();
        Object[] objArr = {vzhVarB, hzhVarA2.b()};
        for (int i = 0; i < 2; i++) {
            nqn1 nqn1Var = rqn1.g;
            if (objArr[i] == null) {
                bhn0.i(f4i1.c(i, "at index "));
                return null;
            }
        }
        return rqn1.q(2, objArr);
    }
}
