import React, { Component } from 'react';
import {Button} from 'primereact/button';
import logo from './logo.png';
import './App.css';
import 'primereact/resources/themes/omega/theme.css';
import 'primereact/resources/primereact.min.css';
import 'primeicons/primeicons.css';
import {Password} from 'primereact/password';
import {Card} from 'primereact/card';
class App extends Component {



    render() {
        return (
          <div  >
            <h3>Sample Layout</h3>
           <div className="ui-g">
               <div className="ui-g-12">
                 Footer
             </div>
               <div className="ui-g-12 ui-md-2">Menu</div>
               <div className="ui-g-12 ui-md-8 ui-g-nopad">
                 <Card>
                  < div className="content-section implementation" >
                    <h3 className="first">Password</h3>
                    <Password promptLabel="Entrez un Mot de passe svp" weakLabel="Faible" mediumLabel="Moyen" strongLabel="Solid"/>
                </div>
                 </Card>
               </div>
               <div className="ui-g-12 ui-md-2">Menu</div>
               <div className="ui-g-12">
                   Footer
               </div>

           </div>
          </div>
        );
    }
}

export default App;
