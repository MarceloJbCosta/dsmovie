import {ReactComponent as GithubIcon} from 'assets/img/github.svg';
import './styles.css';

function NavBar(){

    return (
        <header>
          <nav className="container">
            <div className="dsmovie-nav-content">
                <h1>DsMovie</h1>
                <a href="https://github.com/MarceloJbCosta">
                    <div className="dsmovie-contac-container">
                        <GithubIcon />
                        <p className="dsmovie-contact-link">/Marcelojbcosta</p>
                    </div>
                </a>
              </div>
          </nav>
        </header>
      );
}

export default NavBar;